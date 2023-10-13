import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class laba_4_2 {

    public static void printb(String x){
        System.out.println("\033[0;1m" + x + "\u001B[0m");
    }

    public static double min(double a, double b, double c) {
        double m=0;
        if (a <= b && a <= c) {
            m = a;
        }
        else if (b <= c && b <= a) {
            m = b;
        }
        else if (c <= b & c <= a) {
            m = c;
        }
        return m;

    }


    public static double max(double a, double b,double c){
        if (a > b) {
            if (a > c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if (b>c){
                return b;
            }
            else{
                return c;
            }
        }
    }

    public static void f2(double a, double b, double c){

        if (((a + b) > c) & ((a + c) > b) & ((b + c) > a)){
            System.out.println("Треугольник существует!");
            if (Math.pow(max(a,b,c),2) < (Math.pow(((a+b+c) - max(a,b,c) - min(a,b,c)),2) + Math.pow(min(a,b,c),2))){
                System.out.println("Треугольник остроугольный!");
            }
            else {
                System.out.println("Треугольник не остроугольный!");
            }
        }
        else{
            System.out.println("Такого треугольника не существует!");
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        printb("Задание номер 2");
        System.out.println("Введите первое значение:");
        double a = in.nextDouble();
        System.out.println("Введите второе значение:");
        double b = in.nextDouble();
        System.out.println("Введите третье значение:");
        double c = in.nextDouble();
        f2(a,b,c);
    }
}
