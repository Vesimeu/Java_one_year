package laba_6;

import java.util.Random;
import java.util.Scanner;

public class Task_number_8 {
    public static void print_matric(int[][] matric){
        for (int i =0 ; i<matric.length;i++){
            for (int g =0;g<matric.length;g++){
                System.out.print(matric[i][g] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] auto_matric_0(int[][] matric){
        for (int i=0;i<matric.length;i++){
            for (int g=0;i<matric[0].length;i++){
                matric[i][g]    =0;
            }
        }
        return matric;
    }
    public static int[][] auto_mactric(int[][] matric){
        int k =1;
        int kef_1 = 0;
        int count = 2;
        while (count != 0) {
            for (int i = matric[0].length / 2 - 1; i > 0 + kef_1; i--) {
                matric[0+kef_1][i] = k;
                k = k + 1;
            }
            for (int i = 0 + kef_1; i <= (matric.length / 2) - 1 - kef_1; i++) {
                matric[i][0+kef_1] = k;
                k = k + 1;
            }
            for (int i = 1; i < matric[0].length / 2 - kef_1; i++) {
                matric[matric.length / 2 - 1 - kef_1][i + kef_1] = k;
                k = k + 1;
            }
            count = count-1;
            kef_1 = kef_1 + 1;
        }
        k =1;
        kef_1 = 0;
        count = 2;
        while (count != 0) {
            for (int i = matric[0].length - 1; i > matric.length/2 + kef_1; i--) {
                matric[0+kef_1][i] = k;
                k = k + 1;
            }
            for (int i = 0+ kef_1; i <= (matric.length / 2) - 1 - kef_1; i++) {
                matric[i][4+kef_1] = k;
                k = k + 1;
            }
            for (int i = 5; i < matric[0].length - kef_1; i++) {
                matric[matric.length / 2 - 1 - kef_1][i + kef_1] = k;
                k = k + 1;
            }
            count = count-1;
            kef_1 = kef_1 + 1;
        }
        k =1;
        kef_1 = 0;
        count = 2;
        while (count != 0) {
            for (int i = matric[0].length / 2 - 1; i > 0 + kef_1; i--) {
                matric[matric[0].length/2+kef_1][i] = k;
                k = k + 1;
            }
            for (int i = 0+ kef_1; i <= (matric.length / 2) - 1 - kef_1; i++) {
                matric[i+matric[0].length/2][0+kef_1] = k;
                k = k + 1;
            }
            for (int i = 1; i < matric[0].length / 2 - kef_1; i++) {
                matric[matric.length - 1 - kef_1][i + kef_1] = k;
                k = k + 1;
            }
            count = count-1;
            kef_1 = kef_1 + 1;
        }
        k =1;
        kef_1 = 0;
        count = 2;
        while (count != 0) {
            for (int i = matric[0].length - 1; i > matric[0].length/2 + kef_1; i--) {
                matric[matric[0].length/2+kef_1][i] = k;
                k = k + 1;
            }
            for (int i = 0+ kef_1; i <= (matric.length / 2) - 1 - kef_1; i++) {
                matric[i+matric[0].length/2][4+kef_1] = k;
                k = k + 1;
            }
            for (int i = matric[0].length/2 + 1; i < matric[0].length - kef_1; i++) {
                matric[matric.length - 1 - kef_1][i + kef_1] = k;
                k = k + 1;
            }
            count = count-1;
            kef_1 = kef_1 + 1;
        }
        return matric;
    }

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        System.out.println(" ");
        print_matric(auto_mactric(arr));
    }
}
