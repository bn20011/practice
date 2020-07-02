package codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountSheep {
    public static String mur(int n){
        String a = "";
        for (int i = 1; i <= n; i++) {
            a = a + i + " sheep...";
        }
        return a;
    }
/*
    public static String countingSheep(int num) {
        return IntStream.rangeClosed(1, num)
                .mapToObj(i -> i + " sheep...")
                .collect(Collectors.joining());
    }
*/
    public static void run(){
        int nr = 3;
       String str= mur(nr);
        System.out.println(str);
    }
}
