public class min_no_of_days_to_make_boquet {
    public static void main(String[] args) {
        int[] bloomDay = { 1,10,3,10,2};
        int  m = 3, k = 1;
        System.out.println(minDays(bloomDay, m, k));
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        if((long) m *k > bloomDay.length){
            return -1;

        }
        int low=1 , high=(int)1e9;
        while(low<high){
            int mid=low+(high-low)/2;
            if(helper(bloomDay,m,k,mid)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    public static boolean helper(int[]bloomDay , int m , int k , int mid){
            int total=0;
            for(int i=0 ;i < bloomDay.length ;i++){
                int count=0;
                while(i<bloomDay.length && count<k && bloomDay[i]<=mid){
                    count++;
                    i++;
                }

                if(count==k) {
                    total++;
                    i--;
                }
                if(total>=m) return true;

            }
            return false;
    }
}
