package codewars;

public class CountWords {

    public void countWord(String str){
        str.replace(",", "");
        String[] s = str.split(" ");
        System.out.println(s.length);
    }

    public static void run(){
        String str = "Houston, we have a problem";
        CountWords cw = new CountWords();
        cw.countWord(str);
    }
}
