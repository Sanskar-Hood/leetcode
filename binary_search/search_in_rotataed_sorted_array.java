package binary_search;

public class search_in_rotataed_sorted_array {
    public static void main(String[] args) {
        int[]nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
        

    }

    public static  int search(int[] nums, int target) {
        int left = 0;
        int mid;
        int right = nums.length - 1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;

            if (nums[mid] >= nums[left]) {
                if (target>nums[mid] || target<nums[left]) {
                    left = mid + 1;

                }
                else{
                    right=mid-1;
                }
            }

            else{
                if(target<nums[mid] || target>nums[right]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
        }
        return -1;
    }
}