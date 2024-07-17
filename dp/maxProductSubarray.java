public class maxProductSubarray {
    public static void main(String[] args) {
        int [] nums = {0        };
        System.out.println(product(nums));
    }
    public static int product(int [] nums){
        int max=1;
        int min=1;
        int res= nums[0];

        for(int num : nums){
            int temp =  num*max;
            max=Math.max(temp, Math.max(num,min)); 
            min=Math.min(temp, Math.min(num,min));
            res=Math.max(max, res);

            
        }
        return res;
    }
}
