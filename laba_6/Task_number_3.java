package laba_6;

import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.Scanner;

public class Task_number_3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество точек: ");
        int n = scanner.nextInt();
        int[] array = new int[2 * n];
        System.out.println("Введите координаты точек: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Введите координаты центра окружности: ");
        int xc = scanner.nextInt();
        int yc = scanner.nextInt();
        System.out.println("Введите радиус окружности:");
        int r = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i += 2) {
            if (Math.sqrt(Math.pow(array[i] - xc, 2) + Math.pow(array[i + 1] - yc, 2)) <= r) {
                count++;
            }
        }
        System.out.println("Количество точек, лежащих внутри круга: " + count);
    }
}