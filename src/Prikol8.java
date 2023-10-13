import java.util.Scanner;

public class Prikol8 extends FunctionMy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Какую функцию вы хотите посчитать? 1 or 2");
        int otv = in.nextInt();
        double x;
        switch (otv){
            case(1):
                double SumA = 0;
                System.out.println("Введите x");
                x = in.nextDouble();
                for(int i = 0;i!=10;i++){
                    SumA = SumA + FunctionA(x,2);
                }
                    System.out.println("Сумма 10 1 функций от введенного x и y=2:" +FunctionA(x,2));
                break;
            case(2):
                double SumB = 0;
                System.out.println("Введите x");
                x = in.nextDouble();
                for(int i = 0;i!=10;i++){
                    SumB = SumB + FunctionB(x,4,2);
                }
                System.out.println("Сумма 10 2 функций от введенного x и y=4,z=2:" +FunctionB(x,4,2));
        }
    }
}
