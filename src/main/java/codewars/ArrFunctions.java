package codewars;
import static java.util.Arrays.stream;
public class ArrFunctions {

    public int findOdd(int[] a){
        int i;
        for (i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count % 2 != 0) return a[i];
        }
        return -1;
    }

    public static int findIt(int[] A){
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }
}
/*
    public static int findIt2(int[] arr) {
        return stream(arr).reduce(0, (x, y) -> x ^ y);
    }
    }

*/