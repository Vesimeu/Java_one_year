import java.util.Scanner;

public class lava_4_4 {

    public static double f1(double x) {
        double y;
        if (x < 0) {
            y = Math.exp(Math.pow(x, 2));
            return y;
        } else if ((x < 2) & (x > 0)) {
            y = Math.pow(x, 2) + 5;
            return y;
        } else if (x > 2) {
            y = 4 / Math.pow(x, 2);
            return y;

        } else if ((x == 2.0) & (x == 0)) {
            y = 1;
            return y;
        }
        return 0;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Задание номер 4.");
        System.out.println("Введите переменную x:");
        double x = in.nextDouble();
        System.out.println(f1(x));

    }
}
