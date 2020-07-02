package codewars;

public class XO2 {
    private String str;
    private boolean eq;

    public XO2(String s){
        str =s.toLowerCase();
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
        boolean q = run('x', 'o');
        this.eq = q;
    }

    public boolean run2(char a, char b){
        int countX =0;
        int countO =0;
        char x = Character.toLowerCase(a);
        char o = Character.toLowerCase(b);
        for (int i = 0; i < str.length() ; i++) {
            char c = str.charAt(i);
            int compare1 = Character.compare(x, c);
            int compare2 = Character.compare(o, c);
            if (compare1 == 0){ countX++; }
            if (compare2 == 0){ countO++; }

        }

        return compare(countX, countO);

    }

    public boolean run(char a, char b){
        int countX =0;
        int countO =0;
        for (int i = 0; i < str.length() ; i++) {
            char c = str.charAt(i);
            if (str.charAt(i) == c) countX++;
            if (str.charAt(i) == c) countO++;
        }
        return countX==countO;
    }

    public boolean compare(int a, int b){
        boolean eq = true;
        if(a !=b){eq = false; return eq;}
        if(a ==b){eq = true; return eq;}
         return eq;
    }

    public static boolean getXO(String str){
        XO2 a = new XO2(str);
        return a.isEq();
    }

    public static boolean getXO2 (String str) {
        int x = 0, o = 0;
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'x') x++;
            if (c == 'o') o++;
        }

        return x == o ? true : false;
    }

    public static boolean getXO3 (String str) {
        str = str.toLowerCase();
        int countX = 0, countO = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') countX++;
            if (str.charAt(i) == 'o') countO++;

        }
        return countX == countO;

    }

    public static boolean getXO4 (String str) {
        int countx = 0; int counto = 0;
        for (char x : str.toCharArray()){
            if (Character.toLowerCase(x) == 'x') countx++;
            if (Character.toLowerCase(x) == 'o') counto++;
        }
        return countx == counto;
}

    public static boolean getXO5 (String str) {
        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();

    }
}
