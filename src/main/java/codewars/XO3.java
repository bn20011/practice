package codewars;

import java.util.ArrayList;

public class XO3 {
    private String str;
    private boolean eq;

    public XO3(String s){
        str =s;
        setEq();
    }

    public String getStr(){
        return str;
    }

    public void setStr(String str){
        this.str = str;
    }

    public boolean isEq(){
          return eq;
    }

    public void setEq(){
        boolean q = checkIfValuesEqual(countChar(getStr()));
        this.eq = q;
    }

    public ArrayList<Integer> countChar(String str){
        str = str.toLowerCase();
        str = str.replace(" ", "");
        ArrayList<Integer>  arrList= new ArrayList <>();
        do {
            int count = 0;
            char c1 = str.charAt(0);
            for (int j = 0; j < str.length(); j++) {
                char c2 = str.charAt(j);
                int compare = Character.compare(c1, c2);
                if (compare == 0) {
                    count++;
                }
            }
            String r = Character.toString(c1);
            str = str.replace(r, "");
            arrList.add(count);
        }while (str.length()>0);
        return arrList;
    }
/*
this method checks if all values from an Array are equal.
if one pair is not equal then it returns false
* */
    public boolean checkIfValuesEqual(ArrayList <Integer> arr){
        boolean eq = true;
        for (int i = 0; i <arr.size()-1 ; i++) {
            if(arr.get(i) == arr.get(i+1)) { eq=true; }
            else { eq=false;break; }
        }
        return eq;
    }

    public static boolean getXO(String str){
        XO3 XO3 = new XO3(str);
        return XO3.isEq();
    }

    public void printEq(){
        System.out.println(this.isEq());
    }

}
