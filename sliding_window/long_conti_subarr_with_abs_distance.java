package sliding_window;

import java.util.Comparator;
import java.util.PriorityQueue;

public class long_conti_subarr_with_abs_distance {
    public static void main(String[] args) {
        int[] nums = { 8, 2, 4, 7 };
        int limit = 4;
        System.out.println(longestSubarray(nums, limit));

    }

    public static int longestSubarray(int[] nums, int limit) {
        PriorityQueue<int[]> maxheap = new PriorityQueue<>(
                (a, b) -> b[0] - a[0]);
        PriorityQueue<int[]> minheap = new PriorityQueue<>(
                Comparator.comparingInt(a -> a[0]));

        int left = 0;
        int maxlength = 0;

        for (int right = 0; right < nums.length; right++) {
            maxheap.add(new int[] { nums[right], right });
            minheap.add(new int[] { nums[right], right });

            while (maxheap.peek()[0] - minheap.peek()[0] > limit) {
                left = Math.min(maxheap.peek()[1], minheap.peek()[1]) + 1;

                while (maxheap.peek()[1] < left)
                    maxheap.poll();
                while (minheap.peek()[1] < left)
                    minheap.poll();
            }
            maxlength=Math.max(maxlength, right-left+1);

        }
        return maxlength;

    }
}