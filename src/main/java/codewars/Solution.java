package codewars;

public class Solution {

    public static String camelCase(String input){
        String result = "";
        String[] strings = input.split("(?=\\p{Upper})");
        for (int i = 0; i < strings.length; i++) {
            result +=strings[i]+" ";
        }
        System.out.println(result);
        return result.trim();
    }
    public static String camelCase2(String input){
        String sub = "";
        String result ="";
        String right = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(Character.isUpperCase(c)){
                sub = input.substring(0,i);
                result = result+sub+" ";
                right = input.substring(i, input.length());
                if(right.length()>0) {
                    camelCase(right);
                }
                System.out.println(result);
                System.out.println(right);
            }
        }
        return result;
    }

    public static String camelCase3(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }

    public static String camelCase4(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = Character.isUpperCase(input.charAt(i)) ? output + " " + input.charAt(i) : output + input.charAt(i);
        }
        return output;
    }

    public static String camelCase5(String input) {
        String result = "";
        String[] array = input.split("");

        for (int i = 0; i < input.length(); i++) {
            if (array[i].equals(array[i].toUpperCase())) {
                result += " " + array[i];
            }else {
                result += array[i];
            }
        }
        return result;
    }
/*
    static String camelCase6(String input) {
        var separated = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                separated.append(' ');
            }
            separated.append(c);
        }
        return separated.toString();
    }
*/
    public static String camelCase7(String input) {

        String x="";
        for(int i=0;i<input.length();i++)
        {
            if(Character.isUpperCase(input.charAt(i)))
            {
                x=x+" ";
            }
            x=x+input.charAt(i);

        }
        return x;
    }

}


