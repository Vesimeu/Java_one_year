import java.util.Scanner;

public class Task_number_7 {
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
                matric[i][g]=0;
            }
        }
        return matric;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int stroka = n - 1;
        int k = 1;
        int kef = 0;
        int count = 4;
        int kef_1 = 0;
        int kef_2 = 0;
        while (count != 0) {
            stroka = n-1;
            for (int i = (0 + kef_1) ; i < n; i++) {
                arr[stroka][i] = k;
                stroka = stroka - 1;
                k = k + 1;
            }
            stroka = stroka - 2;
            kef = kef + 1;
            int stolbec = n - 1;
            for (int i = 1 + kef_2 ; i < n; i++) {
                arr[i][stolbec] = k;
                k = k + 1;
                stolbec = stolbec - 1;
            }
            count = count - 1;
            kef_1 = kef_1 + 2;
            kef_2 = kef_2 + 2;
        }
        print_matric(arr);
    }
}
