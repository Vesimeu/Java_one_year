package laba_6;

import java.util.Scanner;

public class Task_number_9 {
    public static void print_matric(int[][] matric){
        for (int i =0 ; i<matric.length;i++){
            for (int g =0;g<matric.length;g++){
                System.out.print(matric[i][g] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] filling_matrix(int[][] matric){
        int kof_1= 0;
        int count = 1;
        for (int g = 0;g<2;g++) {
            for (int i = (0 + kof_1); i < matric.length / 2 - kof_1; i++) {
                matric[0 + kof_1][i] = count;
                count = count + 1;
            }
            for (int i = (1 + kof_1); i < matric.length / 2 - kof_1; i++) {
                matric[i][3 - kof_1] = count;
                count = count + 1;
            }
            kof_1 = kof_1 + 1;
        }
        kof_1= 0;
        count = 1;
        for (int g = 0;g<matric.length/4;g++) {
            for (int i = (0 + kof_1); i < matric.length / 2 - kof_1; i++) {
                matric[4+kof_1][i] = count;
                count = count + 1;
            }
            for (int i = matric.length / 2 + 1 + kof_1; i < matric.length - kof_1; i++) {
                matric[i][3 - kof_1] = count;
                count = count + 1;
            }
            kof_1 = kof_1 + 1;
        }
        int kof_2=0;
        kof_1 = 0;
        count=1;
        int kof_3=1;
        for (int g = 0 ;g<2;g++) {
            for (int i = matric.length / 2 + kof_1  ; i < matric.length - kof_1; i++) {
                matric[i-4 - kof_1][i] = count;
                count = count + 1;
                kof_2 = kof_2 + 1;
            }
            for (int i = (matric.length / 2) - kof_3 - kof_1; i > 0; i--) {
                matric[i - 1][matric.length - 1 - kof_1] = count;
                count = count + 1;
            }
            kof_1 = kof_1 + 1;
            kof_3 = kof_3 +1;
        }
        kof_2=0;
        kof_1 = 0;
        count=1;
        kof_3=1;
        for (int g = 0 ;g<matric.length/4;g++) {
            for (int i = matric.length / 2 + kof_1  ; i < matric.length - kof_1; i++) {
                matric[i- kof_1][i] = count;
                count = count + 1;
                kof_2 = kof_2 + 1;
            }
            for (int i = (matric.length ) - kof_3 - kof_1; i > matric.length/2; i--) {
                matric[i - 1][matric.length - 1 - kof_1] = count;
                count = count + 1;
            }
            kof_1 = kof_1 + 1;
            kof_3 = kof_3 +1;
        }
    return matric;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        N=scanner.nextInt();
        int[][] matrix = new int[N][N]; // Создание матрицы размером NxN

        // Заполнение матрицы нулями
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = 0;
            }
        }
        print_matric(filling_matrix(matrix));

    }
    }


