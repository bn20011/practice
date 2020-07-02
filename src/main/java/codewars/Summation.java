package codewars;

import java.util.stream.*;

public class Summation {
    public static int sum(int n){
        int sum =0;
        for (int i = 1; i <= n; i++) {
                sum = sum+i;
            System.out.print(sum + " ");
        }
        return sum;
    }

    public static int summation(int n) {

        return  n*(n+1)/2;
    }
/*
    public static int summation2(int n) {

        return IntStream.rangeClosed(1,n).sum();
    }
*/
    public static void run(){
        int nr= 8;
        int s = sum(8);
        System.out.println(s);
    }
}
