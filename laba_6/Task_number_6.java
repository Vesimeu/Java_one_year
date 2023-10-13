import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task_number_6 {
    public static void print_matric(int[][] matric){
        for (int i = 0 ; i<matric.length;i++){
            for (int g = 0 ; g<matric[0].length;g++){
                System.out.print(matric[i][g] + " ");
            }
            System.out.println("");
        }

    }
    public static void print_matric_1(int[] matric){
        for (int i = 0 ; i<matric.length;i++){
            System.out.print(matric[i] + " ");
        }

    }

    public static double max_massive(double[] mass){
        double k = 0;
        for (int i =0 ; i<mass.length;i++){
            if (mass[i] > k){
                k = mass[i];
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество студентов");
        int number_of_students = scanner.nextInt();
        int[][] array = new int[number_of_students][4];
        int st = 0;
            for (int i = 0; i < array.length; i++) {
                array[i][st] = 50 + (int) (Math.random() * 50); // kg
            }
            st = st+1;
            for (int i = 0; i < number_of_students; i++) {
                array[i][st] = 160 + (int) (Math.random() * (200 - 160)); // lenght
            }
            st=st+1;
            for (int i = 0; i < number_of_students; i++) {
                array[i][st] = 2 + (int) (Math.random() * 5); // grade
            }
            st=st+1;
            for (int i = 0; i < number_of_students; i++) {
                array[i][st] = 1 + (int) (Math.random() * 4); // family
            }
            print_matric(array);
            double uniq ;
            System.out.println("Напишите параметр уникальности в процентах:");
            uniq = scanner.nextDouble();
            int[][] massive_avarage;
             double avarage_lenght = 0;
             int k = 0;
            for (int i = 0 ; i < array.length;i++){
                avarage_lenght = avarage_lenght + array[i][1];
                k=k+1;
            }
            avarage_lenght = avarage_lenght / k;
            System.out.println("Средний рост:" + avarage_lenght);
            int count = 0;
            for (int i = 0 ;i < array[0].length;i++){
                if (((Math.abs(array[i][1] - avarage_lenght)) / array[i][1] )*100 <= uniq){
                    count = count+1;
                }
            }
            if (count!=0) {
                massive_avarage = new int[count][4];
                int stroka=0;
                for (int i = 0; i < array[0].length; i++) {
                    if (((Math.abs(array[i][1] - avarage_lenght)) / array[i][1]) * 100 <= uniq) {
                        massive_avarage[stroka][0] = array[i][0];
                        massive_avarage[stroka][1] = array[i][1];
                        massive_avarage[stroka][2] = array[i][2];
                        massive_avarage[stroka][3] = array[i][3];
                        stroka=stroka+1;
                    }

                }
                System.out.println("Среднестат. студенты отностельно параметра уникальности:");
                print_matric(massive_avarage);
            }
            else{
                System.out.println("Нету среднестат. студентов!");
            }
            double kof;
            int index=0;
            double max_uniq=0;
            for (int i = 0; i<array.length;i++){
                kof = ((Math.abs(array[i][1] - avarage_lenght)) / array[i][1] )*100;
                if (kof > max_uniq){
                    max_uniq = kof;
                    index = i;
                }
            }
        int[] most_unique = new int[4];
            for (int i = 0 ;i<array[0].length;i++){
                most_unique[i] = array[index][i];
        }
            System.out.println("Самый уникальный студент : ");
            print_matric_1(most_unique);


        }
}