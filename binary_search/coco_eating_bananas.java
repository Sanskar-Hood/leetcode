package binary_search;

public class coco_eating_bananas {
    public static void main(String[] args) {
        int[] piles={3,6,7,11};
        int h=8;
        System.out.println(minEatingSpeed(piles, h));

    }

    public static  int minEatingSpeed(int[] piles, int h) {
        int max= Integer.MIN_VALUE;
        for(int pile:piles){
            max = Math.max(pile, max);
        }
        
        int left=1 , right = max;
        int ans = right;
        while(left <= right){
            int mid = (left+right)/2;
            int hours = 0;
             for(int pile : piles){
                hours+= (pile+mid-1)/mid;
             }
             if(hours<=h) {
                ans=Math.min(ans, mid);
                right=mid-1;
             }
             else{
                left=mid+1;
             }
        }
        return ans;
    }
}
