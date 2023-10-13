import java.util.Scanner;

public class numver4_my {
    public static void print(String x){
        System.out.println(x);
    }
    public static double perevod(double A,double vnd,double gpb,double dollars){
        double vnd1 = A*vnd;
        double vnd_gpb = vnd1*gpb;
        double gpb_dollars = vnd_gpb * dollars;
        return gpb_dollars;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("Задание номер 4");
        print("Введите количество долларов:");
        double A = in.nextDouble();
        print("Введите курс обмена из доллара в дунги:");
        double vnd = in.nextDouble();
        print("Введите курс обмена из дунги в фунты");
        double gpb = in.nextDouble();
        print("Введите курс из фунты в доллар");
        double dollars = in.nextDouble();
        double usd = perevod(A,vnd,gpb,dollars);
        double k = Math.pow(10,5);
        System.out.println("После конвертера осталось:" + " " +Math.ceil(usd*k)/k+" " + "USD");
        System.out.println("Потеря составляет:" + " " + (Math.ceil(A-usd)*k)/k+" "+ "USD");


    }
}
