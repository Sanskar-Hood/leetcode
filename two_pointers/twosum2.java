package two_pointers;

public class twosum2 {
    public static void main(String[] args) {
        int[]numbers ={2,7,11,15};
        int target = 9;
        int[] ans = twoSum(numbers,target);
        for(int n: ans) System.out.println(n);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            int sum = numbers[i]+numbers[j];
            if(sum==target) return new int[]  { i+1,j+1};
            if(sum>target) j--;
            if(sum<target) i++;

        }

        return null; 
    }
}

