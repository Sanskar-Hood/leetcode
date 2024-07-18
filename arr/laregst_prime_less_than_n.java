// import java.util.Arrays;
import java.util.HashSet;

public class laregst_prime_less_than_n {
    public static void main(String[] args) {
        int n=2;
        int[]ans = primer(n);
        // int[]ans=Arrays.sort(ans1);
        for(int i : ans) System.out.println(i);
    }

    public static int[] primer(int n){
        HashSet<Integer> hs = new HashSet<>();
        if(n<2) return new int[]{};
        if(n==2) hs.add(2);
        if(n>2){
            hs.add(2);
            for(int i=3 ; i <=n ; i+=2){
                if(isprime(i)){
                    hs.add(i);
                }
            }
        }
        int[]ans = new int[hs.size()];
        int j=0;
        for(int i : hs){
            ans[j]=i;
            j++;
        }
        return ans;
    }

    public static boolean isprime(int n){
        if(n<2) return false;
        if(n==2) return true;
        for(int i=3 ;i < n ;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
