package two_pointers;

public class container_with_most_water {
    public static void main(String[] args) {
        int[]height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));

    }

    public static  int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int i=0 ;
        int j=height.length-1;
        while(j>i){
            max=Math.max(max, Math.min(height[i], height[j])*(j-i));
            if(height[i]>height[j]){
                j--;
            }
            else if(height[i]<height[j]){
                i++;
            }
            else i++;

        }
        return max;

    } 
}
