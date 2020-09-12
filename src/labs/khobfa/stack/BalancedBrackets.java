package labs.khobfa.stack;

import java.util.Stack;

public class BalancedBrackets {

    public boolean isBalanced(String brackets) {
        Stack<Character> stack = new Stack<>();

        for (char c : brackets.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char curr = stack.pop();
                    if (c == ']' && curr != '[') return false;
                    else if (c == '}' && curr != '{') return false;
                    else if (c == ')' && curr != '(') return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
