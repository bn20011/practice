package codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SmallestIntFinder {
    public static int findSmallestInt(int[] args) {

        boolean swapped;

        for (int i = 0; i <args.length-1 ; i++) {
            swapped = false;
            for (int j = 0; j < args.length-i-1; j++) {
                int t=0;
                if(args[j] > args[j+1]){
                    t=args[j];
                    args[j] =args[j+1];
                    args[j+1]=t;
                    swapped = true;
                }

            }
            if (swapped = false)
                break;
        }
        return args[0];

    }

    public static int findSmallestInt2(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
    /*
    public static int findSmallestInt3(int[] args) {
        return IntStream.of(args).min().getAsInt();
    }
    */
}
