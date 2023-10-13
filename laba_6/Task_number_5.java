
import java.util.Scanner;

public class Task_number_5{
    public static void print_matric(int[][] matric){
        for (int i =0 ; i<matric.length;i++){
            for (int g =0;g<matric[0].length;g++){
                System.out.print(matric[i][g] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк и столбцов матрицы");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Введите матрицу");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Введите номер столбца, который будет заменен на основную диагональ");
        int k = scanner.nextInt();
        int s = 0;
        int st = m-1;
//        int temp_1 = matrix[0][3];
        for (int i = 0; i < n; i++) {
            int temp = matrix[i][k - 1];
            matrix[i][k - 1] = matrix[s+i][st-i];
            matrix[s+i][st-i] = temp;
        }
//        matrix[0][3] = matrix[]
        System.out.println("Результирующая матрица имеет вид");
        print_matric(matrix);
    }
}