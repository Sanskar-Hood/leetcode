package stack;

import java.util.Arrays;
import java.util.Stack;

public class daily_temperatures {
    public static void main(String[] args) {
        int [] temperatures = {73,74,75,71,69,72,76,73};
        int[] ans =dailyTemperatures(temperatures);
        for(int a : ans ) System.out.println(a);
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Arrays.fill(ans, 0);
        Stack<sanskar> stack = new Stack<>();


        for(int i=0 ;i < temperatures.length ; i++){
            while(!stack.isEmpty() && stack.peek().value<temperatures[i]){
                ans[stack.peek().idx] = i-stack.peek().idx;
                stack.pop();
            }
            
        stack.add(new sanskar(i, temperatures[i]));
            
        }
        return ans;
    }

    public static class sanskar{
        int idx ; 
        int value;
        sanskar(int idx,int value){
            this.idx=idx;
            this.value=value;
        }
    }
}
