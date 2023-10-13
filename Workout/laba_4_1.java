import java.util.Scanner;

public class laba_4_1 {
    public static void print(String x){
        System.out.println(x);
    }
    public static void printb(String x){
        System.out.println("\033[0;1m" + x + "\u001B[0m");
    }
    public static String f1(double a, double b, double c){
        double disc = Math.pow(b,2) - 4*a*c;
        System.out.println(Math.pow(disc,1/2f));
        if (disc > 0){
            double x1 = (-b-Math.pow(disc,1/2f))/(2*a);
            double x2 = (-b+Math.pow(disc,1/2f))/(2*a);
            return "x1:" + Double.toString(x1) + " x2:" + Double.toString(x2);

        }
        if (disc == 0 ){
            double x1 = (-b-Math.pow(disc,1/2f))/(2*a);
            return Double.toString(x1);
        }
        else{
            return "Корней нет!";
        }

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        printb("Задание номер 1.");
        print("Введите значение a:");
        double a = in.nextDouble();
        print("Введите значение b:");
        double b = in.nextDouble();
        print("Введите значение c:");
        double c = in.nextDouble();
        System.out.println(f1(a,b,c));
    }
}
