package stack;

import java.util.HashMap;
import java.util.Stack;

public class valid_parenthesis {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        HashMap<Character, Character> hm = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        hm.put(')', '(');
        hm.put(']', '[');
        hm.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                if (!stack.isEmpty() && stack.peek() == hm.get(s.charAt(i))) {
                    stack.pop();
                } else {
                    return false;
                }
            } else
                stack.push(s.charAt(i));

        }
        return true ? stack.isEmpty() : false;
    }
}
