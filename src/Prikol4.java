import java.util.Scanner;

public class Prikol4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введите кол-во нулей после запятой");
        int p = in.nextInt();
        double n = zn();
        double f = ss();
        System.out.println(n);
    }
    public static double zn(){
        boolean h = false;
        double n =0;
        while (h!= true) {
            Scanner in = new Scanner (System.in);
            System.out.println("Введите не целое число меньшее 1");
            n = in.nextDouble();
            if ((n % 1 == 0) || n>1) {
                System.out.println("Вы ввели неправильное значение");
                h = false;
            } else {
                h = true;
            }
        }
        return n;
    }
        public static double ss(){
            double f=0;
            boolean y = false;
            Scanner in = new Scanner (System.in);
            while (y!=true){
                System.out.println("Введите систему счисления большую 1,меньшую 10 и целую");
                f = in.nextDouble();
                if ((f < 2 || f > 9) || (f % 1 != 0)) {
                    System.out.println("Вы ввели непрвильную систему счисления");
                    y = false;
                }
                else {
                    y = true;
                }
            }
        return f;
    }
    public static double per(){
        double p=1;

        return p;
    }
}
