import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        int [] ans = sum();
        for(int num:ans) System.out.println(num);
    }

    public static int[] sum() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(target - nums[i])) {
                return new int[] { i, hashmap.get(target - nums[i]) };
            }
            hashmap.put(nums[i], i);
        }
        return null;
    }
}
