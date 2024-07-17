package sliding_window;

public class no_of_nice_subarrray {
    public static void main(String[] args) {
        int[] nums= {1,1,2,1,1};
        int k=3;
        System.out.println(numberOfSubarrays(nums, k));
        
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        int i = 0, j = 0;
        int megacount = 0;
        int count = 0;
        while (j < nums.length) {
            if (nums[j] % 2 != 0) {
                count++;
                if (count == k)
                    megacount++;

            }
            if (count > k) {
                if (nums[i] % 2 != 0)
                    count--;
                i++;

            }
            j++;

        }
        return megacount;

    }
}
