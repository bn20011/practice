package main.java.codewars;
import static java.lang.Math.abs;

public class OpositeNr {
    public static int getOpositeNr(int number){
        return (number < 0) ? abs(number) : -number;
    }

    public static int opposite(int number)
    {
        return -number; //return the "opposite" of number
    }

    public static int opposite2(int number)
    {
        return Math.negateExact(number);
    }
}
