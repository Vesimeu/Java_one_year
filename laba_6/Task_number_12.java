import java.util.Scanner;

public class Task_number_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размерности матрицы
        System.out.print("Введите размерность матрицы: ");
        int n = scanner.nextInt();

        // Инициализация матрицы A, массивов F и X
        double[][] A = new double[n][n];
        double[] F = new double[n];
        double[] X = new double[n];

        // Ввод коэффициентов матрицы A
        System.out.println("Введите коэффициенты матрицы A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextDouble();
            }
        }

        // Ввод столбца правой части F
        System.out.println("Введите столбец правой части F:");
        for (int i = 0; i < n; i++) {
            F[i] = scanner.nextDouble();
        }

        // Ввод столбца решения X
        System.out.println("Введите столбец решения X:");
        for (int i = 0; i < n; i++) {
            X[i] = scanner.nextDouble();
        }

        // Проверка A*X=F
        double[] product = new double[n];
        for (int i = 0; i < n; i++) {
            double sum = 0.0;
            for (int j = 0; j < n; j++) {
                sum += A[i][j] * X[j];
            }
            product[i] = sum;
        }

        boolean isInverse = true;
        for (int i = 0; i < n; i++) {
            if (Math.abs(product[i] - F[i]) > 0.0001) { // Проверяем на равенство с определенной точностью
                isInverse = false;
                break;
            }
        }

        if (isInverse) {
            System.out.println("Решение A*X=F верно.");
        } else {
            System.out.println("Решение A*X=F неверно.");
        }

        scanner.close();
    }
}
