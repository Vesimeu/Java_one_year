package laba_6;
import laba_4.TaskNumberFive;

import java.util.Scanner;

public class Task_number_10 {
    public static void print_matric_t(int[][] matric, int A, int B){
        for (int i =0 ; i<A;i++){
            for (int g =0;g<B;g++){
                System.out.print(matric[i][g] + " | ");
            }
            System.out.println();
        }

    }
    public static int[] check_for_hits(int[][] arr){
        int[] answer = new int[arr[0].length];
        for (int i = 0 ;i<arr[0].length;i++){
            double x = arr[0][i];
            double y = arr[1][i];
            if ((Function_Matrica.FigureOne.figureOne(x,y)==0 || Function_Matrica.FigureOne.figureTwo(x,y)==0 || Function_Matrica.FigureOne.figureThree(x,y) == 0) || (Function_Matrica.FigureOne.figureFour(x,y) == 0) || (Function_Matrica.FigureOne.figureFive(x,y)==0) || (Function_Matrica.FigureOne.figureSix(x,y)==0) || (Function_Matrica.FigureOne.figureSeven(x,y)==0) ||
                    (Function_Matrica.FigureTwo.figureOne(x,y)==0 || Function_Matrica.FigureTwo.figureTwo(x,y)==0 || Function_Matrica.FigureTwo.figureThree(x,y) == 0) || (Function_Matrica.FigureTwo.figureFour(x,y) == 0) || (Function_Matrica.FigureTwo.figureFive(x,y)==0) || (Function_Matrica.FigureTwo.figureSix(x,y)==0) || (Function_Matrica.FigureTwo.figureSeven(x,y)==0)){
                System.out.println(x + " " + y );
                answer[i] = 0;
            }
            else {
                if (TaskNumberFive.FigureOne.figureOne(x,y) || TaskNumberFive.FigureOne.figureTwo(x,y) || TaskNumberFive.FigureOne.figureThree(x,y)||
                TaskNumberFive.FigureOne.figureFour(x,y) || TaskNumberFive.FigureOne.figureFive(x,y) || TaskNumberFive.FigureOne.figureSix(x,y) || TaskNumberFive.FigureOne.figureSeven(x,y) ||
                TaskNumberFive.FigureTwo.figureOne(x,y) || TaskNumberFive.FigureTwo.figureTwo(x,y) || TaskNumberFive.FigureTwo.figureThree(x,y) || TaskNumberFive.FigureTwo.figureFour(x,y)||
                TaskNumberFive.FigureTwo.figureFive(x,y) || TaskNumberFive.FigureTwo.figureSix(x,y) || TaskNumberFive.FigureTwo.figureSeven(x,y)){
                    answer[i] = 1;
                }
                else{
                    answer[i] = -1;
                }
            }

        }
        return answer;

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите количество точек, которые вы хотите проверить:");
        int num = scanner.nextInt();
        int[][] arr = new int[2][num];
        System.out.println("Укажите точки:");
        for (int i = 0 ;i<num;i++){
            System.out.println("Укажите координату " + (i+1) + " точки по x:");
            int x = scanner.nextInt();
            System.out.println("Укажите координату " + (i+1) + " точки по y:");
            int y = scanner.nextInt();
            arr[0][i] = x;
            arr[1][i] = y;
        }
        System.out.println("Отлично!Вот ваша матрица:");
        print_matric_t(arr,2,num);
        int[] ars;
        ars = check_for_hits(arr);
        System.out.println("Результаты попадания точек в область:");
        for (int i=0;i<ars.length;i++){
            System.out.print(ars[i] + " ");
        }
    }

}
