package codewars;
import static java.lang.Math.abs;
public class NegativeNr {

    public static int getNegNr(int nr){
        if(nr>0){return -nr;}
        else{return nr;}
    }

    public static int makeNegative(final int x) {
        return -abs(x);
    }

    public static int makeNegative2(final int x) {
        return (x < 0) ? x : -x;
    }
}
