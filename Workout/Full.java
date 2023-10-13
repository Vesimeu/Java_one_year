import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;
import java.io.*;
import static java.lang.Math.*;
import java.lang.*;
import java.util.*;
import java.lang.Math;
import java.util.Scanner;

public class Full {

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static void print(String x){
        System.out.println(x);
    }
    public static void printb(String x){
        System.out.println("\033[0;1m" + x + "\u001B[0m");
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
    public static double phisic(double s,double v1,double v2,double time){
        for (double sa = 1 ; sa<1000; sa=sa+0.5){
            double g1 = (sa/v1);
            double g2 = ((s-sa)/v2) + time;
            if (g2 - g1 ==0){
                return Math.round(sa);
            }

        }
        return 1234567890;
    }
    public static double perevod(double A,double vnd,double gpb,double dollars){
        double vnd1 = A*vnd;
        double vnd_gpb = vnd1*gpb;
        double gpb_dollars = vnd_gpb * dollars;
        return gpb_dollars;

    }
    public static String proect(double x1, double y1, double z1, double x2, double y2, double z2,double x,double y,double z)
    {
        String ret;
        for (double xx = 0;xx<100;xx++){
            for (double yy = 0 ; yy<100;yy++){
                for (double zz=0;zz<100;zz++){
                    if ((((((xx - x1)/(x2-x1)) == (yy - y1)/(y2-y1)) & (((yy - y1)/(y2-y1)) == ((zz - z1)/(z2-z1))) &((xx - x1)/(x2-x1)) == (zz - z1)/(z2-z1))) & (((x - xx)*(x2-x1) + (y-yy)*(y2-y1) + (z - zz) * (z2-z1)) == 0)){
                        ret = "x:"+Double.toString(xx) + " " + "y:"+ Double.toString(yy) + " " + "z:"+ Double.toString(zz);
                        return ret;
                    }
                }
            }
        }
        return "Произошла ошибка.Не удалось найти проекцию!";
    }
    public static double find_corner(double x1,double y1,double z1,double x2,double y2, double z2){
        double corner = (x1*x2 + y1*y2 + z1*z2) / (Math.pow((Math.pow(x1,2) + Math.pow(y1,2) + Math.pow(z1,2)),1/2f) * (Math.pow((Math.pow(x2,2) + Math.pow(y2,2) + Math.pow(z2,2)),1/2f)));
        return corner;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        printb("Здесь собраны все задание второй лабароторной работы!");
            print("Выберите задание:");
            int number = in.nextInt();
            if (number == 1) {
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
                } else {
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
                    System.out.println(func2(x, y, s, h, a, b));

                }
            }
            if (number == 2) {
                print("Задание номер 2");
                print("Введите расстояние между городами A и B");
                double s = in.nextDouble();
                print("Введите время в часах, после которого выехал второй автомобиль");
                double time = in.nextDouble();
                print("Введите скорость первого автомобиля:");
                double v1 = in.nextDouble();
                print("Введите скорость второго автомобиля");
                double v2 = in.nextDouble();
                if ((phisic(s, v1, v2, time)) == 1234567890) {
                    print("Ответ не найден");
                } else {
                    System.out.println(phisic(s, v1, v2, time));
                }
            }
            if (number == 3) {
                print("Задание номер 3.");
                print("Необходимо ввести координаты вектора a");
                print("Введите x1");
                double x1 = in.nextDouble();
                print("Введите y1");
                double y1 = in.nextDouble();
                print("Введите z1");
                double z1 = in.nextDouble();
                print("Необходимо ввести координаты вектора b");
                print("Введите x2");
                double x2 = in.nextDouble();
                print("Введите y2");
                double y2 = in.nextDouble();
                print("Введите z2");
                double z2 = in.nextDouble();
                double radian = Math.acos(find_corner(x1, y1, z1, x2, y2, z2));
                double degrees = (radian * 180) / Math.PI;
                System.out.println(find_corner(x1, y1, z1, x2, y2, z2));
                System.out.println("Ответ в радианах:" + " " + radian);
                System.out.println("Ответ в градусах:" + " " + degrees);

            }
            if (number == 4) {
                print("Задание номер 4");
                print("Введите количество долларов:");
                double A = in.nextDouble();
                print("Введите курс обмена из доллара в дунги:");
                double vnd = in.nextDouble();
                print("Введите курс обмена из дунги в фунты");
                double gpb = in.nextDouble();
                print("Введите курс из фунты в доллар");
                double dollars = in.nextDouble();
                double usd = perevod(A, vnd, gpb, dollars);
                double k = Math.pow(10, 5);
                System.out.println("После конвертера осталось:" + " " + Math.ceil(usd * k) / k + " " + "USD");
                System.out.println("Потеря составляет:" + " " + (Math.ceil(A - usd) * k) / k + " " + "USD");

            }
            if (number == 5) {
                printb("\u001B[45m" + "Задание номер 5 ");
                printb("Введите координаты первой точки прямой:");
                print("Введите координату по оси x первой точки прямой:");
                double x1 = in.nextDouble();
                print("Введите координату по оси y первой точки прямой:");
                double y1 = in.nextDouble();
                print("Введите координату по оси z первой точки прямой:");
                double z1 = in.nextDouble();
                printb("Введите координаты второй точки прямой.");
                print("Введите координату по оси x первой точки прямой:");
                double x2 = in.nextDouble();
                print("Введите координату по оси y первой точки прямой:");
                double y2 = in.nextDouble();
                print("Введите координату по оси z первой точки прямой:");
                double z2 = in.nextDouble();
                printb("Введите координа точки.");
                print("Введите координату точки по оси x:");
                double x = in.nextDouble();
                print("Введите координату точки по оси y:");
                double y = in.nextDouble();
                print("Введите координату точки по оси z:");
                double z = in.nextDouble();
                printb("Проекция:" + proect(x1, y1, z1, x2, y2, z2, x, y, z));
            } else {
                printb("Такого задания нет!Есть задания только 1,2,3,4,5");
            }
    }

}
