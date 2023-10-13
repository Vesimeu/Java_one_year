import java.util.Scanner;
import static java.lang.Math.*;
public class Prikol3 {
    public static void main(String[] args) {
        long Sj = 0;
        long Pj = 1;
        long Prk = 1;
        long Sk = 0;
        System.out.println("1 Выражение равно - " + SumJ(Sj));
        System.out.println("2 Выражение равно - " + PrJ(Pj));
        System.out.println("3 Выражение равно - " + PrK(Prk,Sk));
    }
    public static double SumJ(long Sj){
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                Sj += pow((cos(j) + pow(sin(i), j)), 2);
            }
        }
        return Sj;

    }
    public static double PrJ (long Pj){
        for(int i=1;i<=5;i++){
            for(int j =i;j<=i;j++){
                Pj*=pow(j,(i+1));
            }
        }
        return Pj;
    }
    public static double PrK (long Prk,double Sk){
        for(int i=1;i<=8;i++){
            for(int j=i;j<=(2*i-1);j++){
                for(int k=i+j;k<=(2*(i+j));k++){
                    Sk += log((2*j)-3*(i-(1/2*k)));
                    Prk*=Sk;
                }
            }
        }
        return Prk;
    }




}