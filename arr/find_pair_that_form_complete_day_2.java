import java.util.HashMap;

public class find_pair_that_form_complete_day_2 {
    public static void main(String[] args) {
        int[] hours = {12,12,30,24,24};
        System.out.println(countCompleteDayPairs(hours));
    }

    public static  long countCompleteDayPairs(int[] hours) {
        int ans=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int hour : hours){
            int x = hour%24;
            if(hm.containsKey(x)) 
            ans+=hm.get(x);
            hm.put(x, hm.getOrDefault(x, 0)+1);
        }
        return ans;
    }
}
