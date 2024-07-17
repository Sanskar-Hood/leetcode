import java.util.HashMap;

public class targetsum {
    static HashMap<String,Integer> dp ;
    public static void main(String[] args) {
        dp= new HashMap<>();
        int [] nums = {1,1,1,1,1};
        System.out.println(helper(0, 0, 3, nums));


        
    }

    public static int helper(int i , int sum , int target, int[] nums){
        String s = i + "," +sum;
        if(i==nums.length) {
            if(sum==target) return 1;
            else return 0;
        }
        if(dp.containsKey(s)) return dp.get(s);

        int res = helper(i+1, sum-nums[i], target, nums)+ helper(i+1, sum+nums[i], target, nums);
        dp.put(s, res);
        return res;
    }

    }
