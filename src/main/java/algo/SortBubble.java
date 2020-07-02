package algo;

import util.UtilArray;

public class SortBubble {

    public static int[] sortAsc(int[] arr){
        boolean swapped;

        for (int i = 0; i <arr.length-1 ; i++) {
            swapped = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                int t=0;
                if(arr[j] > arr[j+1]){
                    t=arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]=t;
                    swapped = true;
            }

            }
            if (swapped = false)
                break;
        }
        return arr;
    }

    public static void runSortBubble(){
        int[] arr = {3,5,2,6,8,10,1};
        UtilArray.printArray(arr);
        System.out.println();
        int[] sorted = sortAsc(arr);
        UtilArray.printArray(sorted);
    }
}
