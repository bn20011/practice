package codewars;
import java.util.ArrayList;

public class SquareDigit {

    public static int squareDigits(int n){
        return getReverseOrder(getArrayDigits(n));
    }

    public static ArrayList <Integer> getArrayDigits(int n){
        ArrayList <Integer> arr = new ArrayList<>();
        String result = "";
        while (n>0){
            int digit = n %10;
            n= n/10;
            int numberPow = digit * digit;
            arr.add(numberPow);
        }
        return arr;
    }

    public static int getReverseOrder(ArrayList<Integer> arr){
        String result = "";
        for(int i=0; i<arr.size(); i++){
            String nr = Integer.toString(arr.get((arr.size()-i)-1));
            result = result + nr;
        }
        int resultInt = Integer.parseInt(result);
        System.out.println(resultInt);
        return resultInt;
    }


}

/*
*
* public static int squareDigit4(int n){
        String result = "";
        int nrInt;
        StringBuilder sb = new StringBuilder();
        while (n>0){
            int digit = n %10;
            n= n/10;
           int numberPow = digit * digit;
            sb.append(numberPow);
           String nr = Integer.toString(numberPow);
           String result2 = String.valueOf(sb.append(result));

        }
        int resultInt = Integer.parseInt(result);

        return resultInt;
    }

    public static int squareDigit2(int n){
        ArrayList <Integer> arr = new ArrayList<>();
        String result = "";
        while (n>0){
            int digit = n %10;
            n= n/10;
            int numberPow = digit * digit;
            arr.add(numberPow);
            String nr = Integer.toString(numberPow);
            result = result + nr;

        }
        int resultInt = Integer.parseInt(result);

        return resultInt;
    }
*
* */