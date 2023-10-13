package laba_6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task_number_4 {

    public static int bubbleSort(int[] sortArr) {
        int k = 0;
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
            k=k+1;
        }
        return k;
    }

    public static int sort(int[] array) {
        int k =0;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
            k=k+1;
        }
        return k;
    }
    public static void main(String[] args) {
        int[] array = {22,33,11,3,-2,4,2};
        System.out.println("Исходный массив: " + Arrays.toString(array));
        sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array) + ".Количество итераций:" + sort(array));
        bubbleSort(array);
        System.out.println("Отсортированный массив пузырьком: " + Arrays.toString(array) + ".Количество итераций:" + bubbleSort(array));
    }

}

