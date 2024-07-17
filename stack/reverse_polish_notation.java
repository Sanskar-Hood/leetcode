package stack;

import java.util.HashMap;
import java.util.Stack;

public class reverse_polish_notation {
    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        // ReversePolishNotation rpn = new ReversePolishNotation();
        System.out.println(evalRPN(tokens)); // Output: 9
        
    }

    public static int evalRPN(String[] tokens) {
            HashMap<String,Integer> hm = new HashMap<>();
            hm.put("+", 1);
            hm.put("-", 1);
            hm.put("/", 1);
            hm.put("*", 1);

            Stack<Integer> stack =new Stack<>();
            for(String ch : tokens){
                if(!hm.containsKey(ch)){
                    stack.add(Integer.parseInt(ch));
                }

                else{
                    int a = stack.pop();
                    int b= stack.pop();
                    int ans = helper(a, b, ch);
                    stack.add(ans);
                }
            }
            return stack.pop();
        }

        public static int helper(int a,int b , String ch){
            if(ch.equals("+")) return a+b;
            if(ch.equals("-")) return b-a;
            if(ch.equals("/")) return b/a;
            if(ch.equals("*")) return a*b;

            return 0;

        }
}
