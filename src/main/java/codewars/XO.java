package codewars;

public class XO {
    private String str;
    private boolean eq;

    public XO(String s){
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
        boolean q = count('x', 'o');
        this.eq = q;
    }
    public boolean count(char a, char b){
        int countX =0;
        int countO =0;
        char x = Character.toLowerCase(a);
        char o = Character.toLowerCase(b);
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) == x) countX++;
            if (str.charAt(i) == o) countO++;
        }
        return countX==countO;
    }

    public static boolean getXO(String str){
        XO a = new XO(str);
        return a.isEq();
    }
}
