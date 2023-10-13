import java.util.Scanner;

public class number4 {
    public static void print(String x){
        System.out.println(x);
    }
    public static double aref(double a1,double n,double d){
        double s = (((2*a1 + (d*(n-1)))/2)*n);
        return s;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("Задание номер 4");
        print("Введите первый член прогрессии:");
        double a1 = in.nextDouble();
        print("Введите число членов прогрессии:");
        double n = in.nextDouble();
        print("Введите число d (Знаменатель)");
        double d = in.nextDouble();
        System.out.println("Ответ:"+ aref(a1,n,d));

    }
}
