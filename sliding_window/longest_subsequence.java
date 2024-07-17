package sliding_window;

import java.util.HashMap;

public class longest_subsequence {
    public static void main(String[] args) {
        String s = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int ans=0;
        int i ;
        int j;
        for( i=0 ; i<s.length() ; i++){
            hm.clear();
            j=i;
            while( j<s.length() && !hm.containsKey(s.charAt(j)) ){
                hm.put(s.charAt(j), 1);
                j++;

            }
            ans=Math.max(ans, j-i);
            
        }
        return ans;

    }
}
