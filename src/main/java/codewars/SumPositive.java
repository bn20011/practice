package codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumPositive {
    public static int sumPosNr(int[] arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] >0) {
               sum+= arr[i];
           }
        }
        return sum;
    }
/*
    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }

    public static int sum2(int[] arr) {
        return IntStream.of(arr).filter(x -> x > 0).sum();
    }
*/
    public static int sum3(int[] arr){
        int sum = 0;

        // Adds all positive numbers to the sum variable
        for(int num : arr) sum += num > 0 ? num : 0;

        return sum;
    }

    public static void run(){
        int[] arr = {-1,1,1,1};
        SumPositive s = new SumPositive();
        int sum = s.sumPosNr(arr);
        System.out.println(sum);

    }
}
