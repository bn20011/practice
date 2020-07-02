package codewars;

public class Counter {
    public int countSheeps(boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int size = arrayOfSheeps.length;
        int count =0;
        for(int i=0; i< size; i++){
            if(arrayOfSheeps[i]==true){count++;}
        }
        return count;
    }

    public static void run(){
        boolean[] arr ={true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true};
Counter c = new Counter();
c.countSheeps(arr);
        System.out.println(c.countSheeps(arr));
    }
}
