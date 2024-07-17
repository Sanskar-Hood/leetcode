package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class generate_parenthesis {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(generateParenthesis(n));
    }

    public static List<String> generateParenthesis(int n) {
        Stack<Character> stack = new Stack<>();
        List<String> ans = new ArrayList<>();
        helper(n, 0, 0, stack, ans);
        return ans;
    }

    public static void helper(int n, int open, int close, Stack<Character> stack, List<String> ans) {
        if (open == n && close == n) {
            StringBuilder s = new StringBuilder();
            for (Character c : stack) {
                s.append(c);
            }
            ans.add(s.toString());
            return;
        }

        if (open < n) {
            stack.add('(');
            helper(n, open + 1, close, stack, ans);
            stack.pop();
        }
        if (close < open) {
            stack.add(')');
            helper(n, open, close + 1, stack, ans);
            stack.pop();
        }
    }
}
