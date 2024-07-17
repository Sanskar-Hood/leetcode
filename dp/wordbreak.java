public class wordbreak {

    public static void main(String[] args) {
        
        String s = "catsandog";
        String[] wordDict = {"cats","dog","sand","and","cat"};
        System.out.println(wordbreaker(s, wordDict));
    }

    public static boolean wordbreaker(String s ,String[] wordDict)
    {int n = s.length();
    boolean [] dp = new boolean[n+1];
    dp[n]=true;

    for(int i = n-1 ;i >=0 ; i--){
        for(String word : wordDict){
            if(i+word.length()<=n && s.substring(i,i+word.length()).equals(word)){
                dp[i]=dp[i+word.length()];

            }
            if(dp[i]) break;
        }
        
    }
    return dp[0];
}
}

