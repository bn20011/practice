package main.java.codewars;

public class Triangle {

    public boolean isTriangle(int a, int b, int c){
        return (a+b>c) && (a+c>b) && (b+c>a) ? true : false;
    }

}
