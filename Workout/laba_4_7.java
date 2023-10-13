import java.util.Scanner;

public class laba_4_7 {

    public static double func_g(double x){
        double g;
        if (x <= 0){
            g = (3*Math.pow(x,2) + Math.tan(2*x+3)) / (1+4*Math.pow(x,2) + Math.exp(1));
            return g;
        }
        if (x > 0){
            g = (2*x + Math.pow(Math.cos(x),3) - Math.pow(Math.sin(x),2)) / (1 + Math.pow(x,2));
            return g;
        }
        return 0;
    }
    public static double func_z(double x){
        double z;
        if (x<0){
            z = (1 + Math.abs(Math.cos(4*Math.pow(x,4) + 6*Math.pow(x,6)))) / (Math.exp(1) + Math.pow(x,2) - 2*x);
            return z;
        }
        if ((x>=0) & (x<1)){
            z = Math.pow((1/(2*x)) + (2*x - Math.sin(3*x))/(1-Math.cos(Math.pow(Math.tan(Math.pow(x,2)),4))),1/4f);
            return z;
        }
        if (x>=1){
            z = 2 * Math.abs(0.5 + ((Math.cos(Math.pow(x,Math.exp(Math.PI))) - 2) / (Math.pow((x-2),1/2f))));
            return z;
        }
        return 0;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Задание номер 7.");
        int number_func;
        System.out.println("Какую функцию хотите вызвать?(1 или 2) :") ;
        number_func = in.nextInt();
        if (number_func == 1) {
            System.out.println("Функция номер 1.");
            double x;
            System.out.println("Введите x в пределах [-4;4]");
            x = in.nextDouble();
            if ((x<=4) & (x>=-4)) {
                System.out.println("Ответ:" + func_g(x));
            }
            else{
                System.out.println("Указанный x не соответствует условию!");
            }

        }
        if (number_func == 2){
            System.out.println("Функция номер 2.");
            double x;
            System.out.println("Введите x в пределах [-4;4]");
            x = in.nextDouble();
            if ((x<=4) & (x>=-4)) {
                System.out.println("Ответ:" + func_z(x));
            }
            else{
                System.out.println("Указанный x не соответствует условию!");
            }
        }


    }
}
