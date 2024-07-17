import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
// import java.util.spi.TimeZoneNameProvider;

// import javax.swing.plaf.synth.SynthStyle;

public class monsters {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int curpower = scn.nextInt();
        int ans=0;
        int[] power = new int[n];
        for(int i=0  ;i < n ; i++){
            power[i]=scn.nextInt();
        }
        int[] bonus = new int[n];
        for(int i=0  ;i < n ; i++){
            bonus[i]=scn.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0 ;i < n ; i++){
            hm.put(power[i], bonus[i]);

        }
        TreeMap<Integer,Integer> tm = new TreeMap<>(hm);
        for(Map.Entry<Integer,Integer> entry  : tm.entrySet()){
            if(entry.getKey()<=curpower){
                curpower+=entry.getValue();
                ans++;
            }
        }
        System.out.println(ans);

        scn.close();
    
}
}
