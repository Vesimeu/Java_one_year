package laba_8;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_10 {
    public static String path = "C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\Task_10";
    public static void Write_file(double summ, double rate , int i){
        try{
            FileWriter file = new FileWriter(path,true);
            file.write("Сумма ряда = "+ summ + ". Погрешность = "+ rate + ".Цикл остановился при n = "+ i);
            file.write("\n");
            file.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void Write_file_func(double x ,double value){
        try{
            FileWriter file = new FileWriter(path,true);
            file.write("Func:ln(x) = " + value + " при x = " + x);
            file.write("\n");
            file.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String path = "C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\Task_10";
        Scanner scanner = new Scanner(System.in);
        double x;
        System.out.println("Введите x:");
        x = scanner.nextDouble();
        Write_file_func(x , Math.log(x));
        if (x > 0.5) {
            double logarifmik = Math.log(x);
            int n = 1000;
            double summ = 0;
            int error_st = -2;
            double error_rate = Math.pow(10,error_st);
            for (int i=1;i<n;i++){
                summ = summ + Math.pow((x - 1),i)/(Math.pow(x,i) * i);
                if (Math.abs(logarifmik - summ) < error_rate){
                    System.out.println("Сумма ряда = "+ summ + ". Погрешность = "+ Math.abs(logarifmik - summ)+ ".Цикл остановился при n = "+ i);
                    Write_file(summ,Math.abs(logarifmik - summ), i);
                    if (error_st == -4){
                        break;
                    }
                    error_st = error_st - 1;
                    error_rate = Math.pow(10,error_st);
                }
            }
        }
        else{
            System.out.println("x Должен быть > 0.5 !");
        }
    }

}
