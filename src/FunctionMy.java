import java.util.Scanner;

public class FunctionMy {
    public static double FunctionA(double x,double y) {
        double a1;
        double a2;
        double a3;
        double a4;
        double a5;
        a1 = x + Math.pow(y,2);
        a2 = Math.pow(a1,1/3f);
        a3 = Math.abs(a2);
        a4 = Math.pow(x-1,1/2f) + ((1+ Math.pow(x,3/2f))/(Math.pow(y,2)-7));
        a5 = (a3/a4)+y*4;
        return a5;
    }
    public static double FunctionB(double x,double y,double z) {
        double b = (Math.pow(y,1/3f)/Math.pow(x,3/4f))*Math.cos(Math.sin(Math.atan((z/x)+(y/z))));
        return b;
    }
}
