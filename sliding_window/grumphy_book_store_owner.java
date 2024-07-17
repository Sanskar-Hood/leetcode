package sliding_window;

public class grumphy_book_store_owner {
    public static void main(String[] args) {
        int[] customers = { 1, 0, 1, 2, 1, 1, 7, 5 };
        int[] grumpy = { 0, 1, 0, 1, 0, 1, 0, 1 };
        int minutes = 3;
        System.out.println(maxSatisfied(customers, grumpy, minutes));
    }

    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int NotGruSum = 0;
        for (int i = 0; i < grumpy.length; i++) {
            if (grumpy[i] == 0) {
                NotGruSum += customers[i];
            }

        }

        int currentsat=0;
        int maxsati=0;
        for(int i=0 ;i < minutes ;i++){
            if(grumpy[i]==1) currentsat+=customers[i];
        }

        for(int i=minutes ;i < grumpy.length ;i++){
            if(grumpy[i-minutes]==1){
                currentsat-=grumpy[i-minutes];
            }

            if(grumpy[i]==1){
                currentsat+=customers[i];
            }
            maxsati=Math.max(maxsati, currentsat);
        }
        return NotGruSum+maxsati;

    }
}
