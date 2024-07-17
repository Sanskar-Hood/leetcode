package two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> ans = threeSum(nums);
        for (List<Integer> l : ans)
            System.out.println(l);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int tar = 1000000;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -tar)
                continue;
            tar = -nums[i];

            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (tar > nums[j] + nums[k])
                    j++;
                if (tar < nums[j] + nums[k])
                    k--;
                if (tar == nums[j] + nums[k])
                    ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[k], nums[j])));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;

            }

        }
        return ans;
    }
}
