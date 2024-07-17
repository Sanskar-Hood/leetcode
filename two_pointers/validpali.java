package two_pointers;

public class validpali {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        int i=0 ;
        int j=s.length()-1;
        while(i<j){
            if(i < j && !Character.isLetterOrDigit(s.charAt(i))){
                i=i+1;

            }
            if(i < j && !Character.isLetterOrDigit(s.charAt(j))){
                j=j-1;
                
            }
            if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))){
                i++;
                j--;

            }
            else return false;
        }
        return true;
    }
}
