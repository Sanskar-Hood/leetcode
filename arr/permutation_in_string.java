    import java.util.Arrays;

    public class permutation_in_string {
        public static void main(String[] args) {
            System.out.println(checkInclusion( "ab", "eidboaoo"));
        }

        public static boolean checkInclusion(String s1, String s2) {
            if (s1.length() > s2.length()) {
                return false;
            }
            int[] s1h = new int[26];
            int[] s2h = new int[26];

            Arrays.fill(s1h, 0);
            Arrays.fill(s2h, 0);
            int left =0 ;
            int right =0 ;
            for(int i=0 ;i < s1.length() ; i++){
                s1h[s1.charAt(i)-'a']+=1;
                s2h[s2.charAt(i)-'a']+=1;
                right++;
                

            }
            right--;
            while(right<s2.length()){
                if(Arrays.equals(s1h, s2h)) return true;
                right++;
                if(right!=s2.length()){
                    s2h[s2.charAt(right)-'a']+=1;
                    s2h[s2.charAt(left)-'a']-=1;
                    left++;
                }
            }
            return false;
        }
    }
