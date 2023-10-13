import java.util.ArrayList;
import java.util.Scanner;

public class number3 {
    public static void print(String x){
        System.out.println(x);
    }
    public static double find_corner(double x1,double y1,double z1,double x2,double y2, double z2){
        double corner = (x1*x2 + y1*y2 + z1*z2) / (Math.pow((Math.pow(x1,2) + Math.pow(y1,2) + Math.pow(z1,2)),1/2f) * (Math.pow((Math.pow(x2,2) + Math.pow(y2,2) + Math.pow(z2,2)),1/2f)));
        return corner;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
        double radian = Math.acos(find_corner(x1,y1,z1,x2,y2,z2));
        double degrees = (radian*180)/Math.PI;
        System.out.println(find_corner(x1,y1,z1,x2,y2,z2));
        System.out.println("Ответ в радианах:"+ " " + radian );
        System.out.println("Ответ в градусах:"+ " " + degrees );


    }
}
