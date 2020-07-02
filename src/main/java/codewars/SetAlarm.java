package codewars;

public class SetAlarm {
    public static boolean setAlarm(boolean e, boolean v){
        if(e==true && v==true){return false;}
        if(e==false && v==true){return false;}
        if(e==false && v==false){return false;}
        if(e==true && v==false){return true;}
        return false;
    }

    public static boolean setAlarm3(boolean employed, boolean vacation) {
        return employed && !vacation;
    }

    public static boolean setAlarm4(boolean employed, boolean vacation) {
        if (employed ^ vacation)
            return employed;
        else;
        return false;

    }

    public static boolean setAlarm8(boolean employed, boolean vacation) {
            return employed ^ vacation ? employed : false;
    }

    public static boolean setAlarm6(boolean employed, boolean vacation)
    {
        if (!employed)
            return false;
        else
            return (vacation == true)? false : true;
    }

    public static boolean setAlarm5(boolean employed, boolean vacation) {
        if(employed && !vacation)
            return true;
        return false;
    }


    public static boolean setAlarm2(boolean e, boolean v){

        return (e==true && v==false)? true: false;
    }
    public static void run(){
        System.out.println(setAlarm2(true, true));
        System.out.println(setAlarm2(false, true));
        System.out.println(setAlarm2(false, false));
        System.out.println(setAlarm2(true, false));
    }
}
