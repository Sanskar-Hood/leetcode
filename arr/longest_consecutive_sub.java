// import java.util.Arrays;
import java.util.HashSet;
// import java.util.LinkedHashSet;
import java.util.Set;

public class longest_consecutive_sub {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(helper(nums));
        
    }
    public static int helper(int[]nums){
        Set<Integer> sets = new HashSet<Integer>();
        for(int n : nums) sets.add(n);
        
        int longest=0;
        for(int num : nums){
            if(!sets.contains(num-1)){
                int length=0;
                while (sets.contains(num+length)) {
                    length++;
                }
                longest=Math.max(length, longest);

            }
        }
        return longest;


    }
}
