class interleavingstring {
    public static void main(String[] args) {
        String s1 = "aabcc" ;
        String s2 = "dbbca";
        String  s3 = "aadbbcbcac";
        System.out.println(isInterleave(s1,s2,s3));
    }
    public static boolean isInterleave(String s1, String s2, String s3) {

        if(s1.length()+s2.length()!=s3.length()) return false;
        int m=s1.length();
        int n= s2.length();
        boolean[][] dp =new boolean[m+1][n+1];
        dp[m][n]=true;
        for(int i=m ; i>=0 ; i--){
            for(int j=n ; j>=0 ; j--){
                if(i<s1.length() && s1.charAt(i)==s3.charAt(i+j) && dp[i+1][j]){
                    dp[i][j]=true;
                }
                if(j<s2.length() && s2.charAt(j)==s3.charAt(i+j) && dp[i][j+1]){
                    dp[i][j]=true;
                }
            }
        }
        return dp[0][0];
    }
}