import java.util.Scanner;


public class number2 {
    public static void print(String x){
        System.out.println(x);
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
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("Задание номер 2");
        print("Введите расстояние между городами A и B");
        double s = in.nextDouble();
        print("Введите время в часах, после которого выехал второй автомобиль");
        double time = in.nextDouble();
        print("Введите скорость первого автомобиля:");
        double v1 = in.nextDouble();
        print("Введите скорость второго автомобиля");
        double v2 = in.nextDouble();
        if ((phisic(s,v1,v2,time)) == 1234567890){
            print("Ответ не найден");
        }
        else{
            System.out.println(phisic(s,v1,v2,time));
        }

    }
}
