package algo;

import com.sun.org.apache.xpath.internal.SourceTree;
import datastructure.HashMapUtil;
import util.UtilArray;

import java.util.HashMap;

public class SumTwoFinder {

    public HashMap<Integer, Integer> checkArr3(int[] arr, int sum){
        int i, j=0;
        int arrSize = arr.length;
        HashMap<Integer, Integer> hm = new HashMap();
        for (i = 0; i < arr.length; i++) {
            for (j = 1; j < arr.length; j++) {
                int sumTwo = arr[i]+arr[j];
                if(sum==sumTwo) {
                    hm.put(arr[i], arr[j]);
 //                   System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }return hm;
    }

    public int[][] checkArr2(int[] arr, int sum){
        int i, j=0;
        int arrSize = arr.length;
        HashMap<Integer, Integer> hm = new HashMap();
        int[][] arrR = new int[arrSize][2];
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length-1; j++) {
                int sumTwo = arr[i]+arr[j];
                if(sum==sumTwo) {
                    arrR[i][i] = arr[i];
                    arrR[i][j] = arr[j];
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
            }return arrR;
        }


    public void checkArr(int[] arr, int sum){
        int i, j=0;
        for (i = 0; i < arr.length; i++) {
         boolean checked = false;
            int b = sum - arr[i];
            for (j = 1; j < arr.length-1; j++) {
                if(b==arr[j]) {
                    System.out.println(arr[i] + "," + arr[j]);
                checked = true;
                }
            }
            if(arr[j] == b){
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }

    public static void run(){
        int sum = 9;
        int[] arr = {2, 7, 11, 5, 4, 12};
        SumTwoFinder sf = new SumTwoFinder();
        int[][] arrR = sf.checkArr2(arr, sum);
        UtilArray.printArrayDim(arrR);
    }

    public static void run2(){
        int sum = 9;
        int[] arr = {2, 7, 11, 5, 4, 12};
        UtilArray.printArray(arr);
        SumTwoFinder sf = new SumTwoFinder();
        HashMapUtil.print(sf.checkArr3(arr, sum));
    }
}
