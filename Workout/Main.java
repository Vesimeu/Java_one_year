import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;
import java.io.*;
import static java.lang.Math.*;
import java.lang.*;
import java.util.*;
import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void print(String x){
        System.out.println(x);
    }
    public static double func(double y,double f){
        double g;
        g = (Math.pow(Math.E,2*y) + Math.sin(f))/Math.log(3.8*y + f);
        return g;
    }
    public static double func2(double x, double y,double s,double h,double a,double b){
        double l1;
        double l2;
        double l;
        l1 = (Math.log(y - Math.abs(Math.pow(Math.sin(s*h*((Math.pow(Math.E,y))+Math.pow(x,Math.E))),2))));
        l2 = ((Math.acos(Math.pow(Math.sin(x+y - a + Math.pow(b,1/2f)),5)))/(a*Math.PI*Math.E*x));
        l = l1-l2;
        return l;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number_func;
        print("Какую функцию хотите вызвать?");
        number_func = in.nextInt();
        if (number_func == 1) {
            print("Вызвана функция номер 1");
            print("Введите y:");
            double y = in.nextDouble();
            print("Введите f:");
            double f = in.nextDouble();
            System.out.println(func(y, f));
        }
        else{
            print("Вызвана функция номер 2");
            print("Введите x:");
            double x = in.nextDouble();
            print("Введите y:");
            double y = in.nextDouble();
            print("Введите s:");
            double s = in.nextDouble();
            print("Введите h:");
            double h = in.nextDouble();
            print("Введите a:");
            double a = in.nextDouble();
            print("Введите b:");
            double b = in.nextDouble();
            System.out.println(func2(x,y,s,h,a,b));

        }





    }
}