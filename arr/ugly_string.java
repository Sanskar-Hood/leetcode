Class ugly_string{
    public static void main(){
        if(a>b){
            swap(cash,string,a);
            flip()
        }
        else{
            flip(cash,string,b);
        }
    }

    public static int swap(int cash,int string,int a){
        char s[] =string.toCharArray ();
        int i=0;
        for(int i=0 ;i<s.length ; i++){
            if(s[i]=='1'){
                i=a;
                break;
            }
        }
        int j =s.length -1 ;
        while(j>i){
            if(cash<a) break;
            if(s[j]=='0'){
                if(s[i]=='0') i++;
                else{
                    char temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                    cash-=a;
                    j--;
                }

                

            }
            else{
                j--;
            }
        }
        str=new String(s);
        return str;
    }

    public static int flip(int cash,int string , int b){
        char[]s =string.toCharArray();
        for(int a= 0 ;i <s.length ;a++){
            if(s[a]=='1'){
                int i=a;
                break;
            }
        }

        while(cash>=b){
            if(i==s.length) break;
            if(s[i]=='1'){
                s[i]=='0';
                cash-=b;
                i++
            }
        }
    }
}