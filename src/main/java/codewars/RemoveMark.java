package codewars;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

public class RemoveMark {

    public static String removeMark5(String s, int n){
        StringBuilder sb = new StringBuilder();
        for (char d : s.toCharArray()) {
            if (n > 0 && d == '!') {
                n--;
            } else {
                sb.append(d);
            }
        }
        return s;
    }

    public static String removeMark6(String s, int n){

        int length = s.length();
        for (int i = 0, count = 0; i < length && count < n; i++) {
            if (s.contains("!")) {
                s = s.replaceFirst("!", "");
                count++;
            }
        }
        return s;
    }

    public static String removeMark7(String s, int n){

        while(n-->0) {
            s = s.replaceFirst("!", "");
        }
        return s;
    }

    public static String removeMark4(String s, int n){
        String mark = "!";
        char f= mark.charAt(0);
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0, k=0; i < s.length(); i++, k++)
        {
            char c = s.charAt(i);
            if (c==f && n>0)
            {
                n--;
                continue;
            }
            String ss =Character.toString(c);
            arr.add(ss);
        }
        s = String.join("", arr);
        return s;
    }


    public static String removeMark3(String s, int n){
            String mark = "!";
            char f= mark.charAt(0);
            char[] newS = new char[s.length()];
            char[] str = s.toCharArray();
            for (int i = 0, k=0; i < s.length(); i++, k++)
            {
                char c = s.charAt(i);
                if (c==f && n>0)
                {
                  n--;
                  continue;
                }
                newS[k] = str[i];
            }
            s = String.copyValueOf(newS);
        return s;
    }


    public static String removeMark(String s, int n){
        StringBuilder sb = new StringBuilder(s);
        String mark = "!";
        char f= mark.charAt(0);
        char ff= '.';
        //String tt = "";
        //char[] nc = tt.toCharArray();

        for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c==f && n>0) {
                    sb.setCharAt(i, ff);
                    n--;
                }
            }
            s = sb.toString();
            s.replace(".", "");

        return s;
    }
    //int compare = Character.compare(b[i], m[0]);
        public static void removeMark2(String s,int n){
            while (n > 0) {
                s.replace("", "!");
                n--;
            }
        }
    public static void run(){
        String actual = "Hi!!!";
        String  result= removeMark4(actual, 100);
        System.out.println("Result: ");
        System.out.println(actual);
        System.out.println(result);
       // int n = result.length();
       // String n = result.replace(" ", "");
        System.out.println(result.length());
    }
}
