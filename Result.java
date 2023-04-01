public static String isBalanced(String s) {
    // Write your code here
        Stack<Character> stack = new Stack();
        for (char c: s.toCharArray()){
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
                continue;
            }
            if (stack.isEmpty()) return "NO";
            if (c == ')' && stack.pop() != '(') return "NO";
            if (c == ']' && stack.pop() != '[') return "NO";
            if (c == '}' && stack.pop() != '{') return "NO";
        }
        return stack.isEmpty()? "YES" : "NO";
    }
