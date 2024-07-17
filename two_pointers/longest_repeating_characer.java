package two_pointers;

// import java.util.HashMap;

public class longest_repeating_characer {
    public static void main(String[] args) {
        String s = "AABABBA";
        int  k = 1;
        System.out.println(characterReplacement(s, k));


    }

    public static int characterReplacement(String s, int k) {
        int left=0;
        int ans=0;
        int max=0;
        int[] hm = new int[26];
        for(int right=0 ; right < s.length() ;right++){

            hm[s.charAt(right)-'A']++;
            max=Math.max(max, hm[s.charAt(right)-'A']);

            while((right-left+1-max)>k){
                hm[s.charAt(left)-'A']--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}
