import java.util.HashMap;

/**
 * validanagram
 */
public class validanagram {

    public static void main(String[] args) {
        System.out.println(funjct());
    }

        public static boolean funjct(){
        String s = "anagram";
        String t = "nagaram";
        HashMap<Character,Integer> hs  = new HashMap<>();
        HashMap<Character,Integer> ht  = new HashMap<>();
        for(char sc  : s.toCharArray()){
            hs.put(sc, hs.getOrDefault(ht, 0)+1);
        }
        for(char tc: t.toCharArray()){
            ht.put(tc, ht.getOrDefault(ht, 0)+1);

        }
        return hs.equals(ht);

         }
    
}