public class product_of_array_except_self {
    public static void main(String[] args) {
        int []nums = {-1,1,0,-3,3};
            
        int []ans= productExceptSelf(nums);
        for(int n : ans) System.out.println(n);
        
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        
        pre[0]=1;
        for(int i=1 ;i<nums.length;i++){
            pre[i]=pre[i-1]*nums[i-1];
        }
        post[nums.length-1]=1;
        for(int i=nums.length-2 ; i>=0 ; i--){
            post[i]=post[i+1]*nums[i+1];
        }

        int[] ans  = new int[nums.length];
        for(int i=0 ;i < nums.length ;i++){
            ans[i]= pre[i]*post[i];
        }
        return ans;
    }
}
