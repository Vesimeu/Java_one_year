import java.util.Scanner;
import static java.lang.Math.*;
public class Prikol5 {
    public static void main(String[] args) {
        double x = X();
        double e = exp(pow(-x,2));
        double pogr1 = 0.01;
        double pogr2= 0.001;
        double pogr3 = 0.0001;
        sum(x,e,pogr1);
        sum(x,e,pogr2);
        sum(x,e,pogr3);
    }
    public static void sum(double x ,double e,double pogr){
        double s=0;
        double n = 0;
        int flag = 0;
        double fact = 0;
        for(n=0;flag!=1;n++){
            fact = Fact(n);
            s +=  pow(-1,n)*((pow(x,(2*n))/fact));
            if (abs(e-s)<pogr){
                System.out.println("fact = "+fact);
                System.out.println("s = "+s);
                System.out.println("pogr = "+abs(e-s));
                flag =1;
            }
        }
    }
    public static double X(){
        double x=0;
        Scanner in = new Scanner (System.in);
        boolean h = false;
        while (h!= true) {
            System.out.println("Введите x<1");
            x = in.nextDouble();
            if (x>=1) {
                System.out.println("Вы ввели неправильное значение");
                h = false;
            } else {
                h = true;
            }
        }
        return x;
    }
    public static int Fact(double n){
        int f=1;
        if (n == 0){
            return 1;
        }
        else{
            for(int i =0;(n-i)!=0;i++){
                f *=(n-i);
            }
            }
        return f;
    }
}

