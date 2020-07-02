package codewars;
import util.UtilArray;
//import main.java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class CountChar {

    public static HashMap<Character, Integer> countChar(HashMap<Character, Integer> map, String str){
        str = str.toLowerCase();
        str = str.replace(" ", "");
        int count = 0;
        char c1 = str.charAt(0);
        for (int j = 0; j < str.length(); j++) {
            char c2 = str.charAt(j);
            int compare = Character.compare(c1, c2);
            if (compare==0) {
                count++;
            }
        }
        //System.out.println(c1 + "=" + count);
        map.put(c1, count);
        String r = Character.toString(c1);
        str = str.replace(r, "");
        if(str.length()>0){
            countChar(map,str);
        }
        return map;
    }

    public static ArrayList<Integer> countChar( String str){
        str = str.toLowerCase();
        str = str.replace(" ", "");
        ArrayList<Integer>  arrList= new ArrayList();
       // int p=0;
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
            System.out.println(c1 + "=" + count);
            String r = Character.toString(c1);
            str = str.replace(r, "");
            arrList.add(count);
            //p++;

        }while (str.length()>0);
        System.out.println();
        return arrList;
    }

    public static int[] maptoArr(HashMap<Character, Integer> map){
       Collection<Integer> values = map.values();
       String[] str= values.toArray(new String[values.size()]);
       int[] arr = new int[str.length];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }

    public static void printMapValues(HashMap<Character, Integer> map){
        for (char i: map.keySet()){
            System.out.println(i + "=" + map.get(i));
            //System.out.println(map.get(i));
        }
    }

    public static char[] strToCharArray(String str){
        str = str.toLowerCase();
        str = str.replace(" ", "");
        char[] sArr = str.toCharArray();
        return sArr;
    }

    public static void printCharArray(char[] ch){
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
    }

        public static void runM() {
            String s = "ce ce ce ce ";
            char[] c = strToCharArray(s);
            printCharArray(c);

        }

    public static void runM3() {
        String s = "ce ce ce be";
        HashMap <Character, Integer> map = new HashMap<>();
        int[] a = maptoArr(countChar(map, s));
        UtilArray.printArray(a);
  }

    public static void runM4() {
        String str = "ce ce ce ce";
        ArrayList <Integer> arrList = countChar(str);
        UtilArray.printArrayList(arrList);
        UtilArray.checkEqualValues3(arrList);
    }
}


