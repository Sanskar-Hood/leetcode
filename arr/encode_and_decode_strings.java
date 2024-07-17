import java.util.ArrayList;
import java.util.List;

public class encode_and_decode_strings {
    public static void main(String[] args) {
        String[] strs = {"neet","code","love","you"};
        String s = encode(strs);
        System.out.println(s);
        List<String>  res = decode(s);
        System.out.println(res);
    }

     public static String encode(String[] strs) {
        StringBuilder s= new StringBuilder();
        for(String n : strs ){
            s.append(n.length()).append("#").append(n);
        }
        return s.toString();
    }

    public static  List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i=0;
        while (i<str.length()) {
            int j=i;
            while(str.charAt(j)!='#') j++;
            int len = Integer.valueOf(str.substring(i, j) );
            i=j+1+len;
            ans.add(str.substring(j+1, i));
        }
        return ans;
    }
    
}
