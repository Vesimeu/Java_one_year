//import java.io.File;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Scanner;
//
//public class Task_13 {
//
//    public static void main(String[] args) {
//        // Чтение данных из файлов
//        File inputMatrixFile = new File("C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\Task_13_1"); // содержит матрицу коэффициентов СЛАУ;
//        File inputSolutionFile = new File("C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\Task_13_2"); //  содержит столбец решений СЛАУ, записанный в файле
//
//        Scanner matrixScanner = null;
//        Scanner solutionScanner = null;
//
//        try {
//            matrixScanner = new Scanner(inputMatrixFile);
//            solutionScanner = new Scanner(inputSolutionFile);
//        } catch (IOException e) {
//            System.out.println("Ошибка при открытии файлов: " + e.getMessage());
//        }
//
//        int k = matrixScanner.nextInt(); // Количество матриц
//        int n = matrixScanner.nextInt(); // Размерность матрицы
//        double[][][] matrices = new double[k][n][n + 1]; // Массив матриц
//        double[][] solutions = new double[k][n]; // Массив решений
//
//        // Чтение матриц и решений из файлов
//        for (int i = 0; i < k; i++) {
//            for (int j = 0; j < n; j++) {
//                for (int l = 0; l < n + 1; l++) {
//                    matrices[i][j][l] = matrixScanner.nextDouble();
//                }
//            }
//            for (int j = 0; j < n; j++) {
//                solutions[i][j] = solutionScanner.nextDouble();
//            }
//        }
//
//        // Проверка соответствия решения СЛАУ
//        for (int i = 0; i < k; i++) {
//            double[] solution = matrices[i][0].clone(); // Копия первой строки матрицы коэффициентов
//            for (int j = 0; j < n; j++) {
//                double sum = 0;
//                for (int l = 0; l < n; l++) {
//                    sum += matrices[i][j][l] * solution[l];
//                }
//                if (sum != matrices[i][j][n]) { // Если решение не соответствует СЛАУ
//                    solution = solve(matrices[i]); // Находим правильное решение
//                    break;
//                }
//            }
//            solutions[i] = solution; // Сохраняем правильное решение
//        }
//
//        // Запись правильных решений в третий файл
//        File outputSolutionFile = new File("C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\Task_13_3");
//        PrintWriter outputSolutionWriter = null;
//
//        try {
//            outputSolutionWriter = new PrintWriter(outputSolutionFile);
//        } catch (IOException e) {
//            System.out.println("Ошибка при открытии файла: " + e.getMessage());
//            System.exit(1);
//        }
//
//        for (int i = 0; i < k; i++) {
//            for (int j = 0; j < n; j++) {
//                outputSolutionWriter.print(solutions[i][j] + " ");
//            }
//            outputSolutionWriter.println();
//        }
//
//        outputSolutionWriter.close();
//    }
//
//    // Метод Гаусса
//    public static double[] solve(double[][] matrix) {
//        int n = matrix.length;
//
//        for (int i = 0; i < n; i++) {
//            int maxRow = i;
//            for (int j = i + 1; j < n; j++) {
//                if (Math.abs(matrix[j][i]) > Math.abs(matrix[maxRow][i])) {
//                    maxRow = j;
//                }
//            }
//
//            double[] temp = matrix[i];
//            matrix[i] = matrix[maxRow];
//            matrix[maxRow] = temp;
//
//            for (int j = i + 1; j < n; j++) {
//                double factor = matrix[j][i] / matrix[i][i];
//                for (int k = i; k < n + 1; k++) {
//                    matrix[j][k] -= factor * matrix[i][k];
//                }
//            }
//        }
//
//        // Обратный ход метода Гаусса
//        double[] solution = new double[n];
//        for (int i = n - 1; i >= 0; i--) {
//            double sum = 0;
//            for (int j = i + 1; j < n; j++) {
//                sum += matrix[i][j] * solution[j];
//            }
//            solution[i] = (matrix[i][n] - sum) / matrix[i][i];
//        }
//
//        return solution;
//    }
//}
