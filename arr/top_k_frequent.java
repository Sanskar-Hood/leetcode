import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class top_k_frequent {
    public static void main(String[] args) {
        int[]  nums = {1,1,1,2,2,3};
        System.out.println(frequent(nums, 2));
        for(int num : frequent(nums, 2) ){
            System.out.println(num);
        }
    }

    public static int[] frequent(int[] nums , int k ){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num:nums){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
            (a,b) -> a.getValue()- b.getValue()
        );

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            pq.add(entry);
            if(pq.size()>k) pq.poll();
        }

        int[] ans = new int[k];
        int i=k;
        while(!pq.isEmpty()){
            ans[--i]=pq.poll().getKey();
        }
        return ans;


    }
}
