package binary_search;

public class search_min_in_rotated_sorted_array {
    public static void main(String[] args) {
        int[] min = {3,4,5,1,2};
        System.out.println(findMin(min));
    }
    public static int findMin(int[] nums) {
        int mid=0;
        // int min = Integer.MAX_VALUE;
        int left=0;
        int right = nums.length-1;
        while(right>=left){
            if(nums[left]<=nums[right]) return nums[left];
            mid=(left+right)/2;
                     if(nums[mid]>=nums[left]){
                left=mid+1;
            }
            else right=mid;
            
        }
        return 0;
    }
    
}
