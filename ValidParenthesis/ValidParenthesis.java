class ValidParenthesis {
    public boolean isValid(String s) {
        if (s == null || s == "") return true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) return false;
                char comp = stack.pop();
                if ((comp == '(' && c != ')') || (comp == '{' && c != '}') || (comp == '[' && c != ']')) {
                    return false;
                }
            }
        }
        if (stack.empty()) {
            return true;    
        }
        return false;
    }
}
