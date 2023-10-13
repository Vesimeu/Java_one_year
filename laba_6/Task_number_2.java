package laba_6;

import java.util.Scanner;

public class Task_number_2 {
    public static int[] sort(int[] array) {
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
        }
        return array;
    }
    public static boolean isFibonacci(int[] array) {
        if (array.length < 2) {
            return false;
        }

        for (int i = 2; i < array.length; i++) {
            if (array[i] != array[i - 1] + array[i - 2]) {
                return false;
            }
        }

        return true;
    }
    public static boolean isFibonacci_not_completely(int[] array) {
        if (array.length < 2) {
            return false;
        }
        int k = 0;
        for (int i = 2; i < array.length; i++) {
            if (array[i] == array[i - 1] + array[i - 2]) {
                    k=k+1;
            }
        }
        if (k>=2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Задание номер 2.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хорошо, введите длину массива:");
        int N = scanner.nextInt();
        int[] array = new int[N];
        System.out.println("Давайте заполним этот массив!");
        for (int i=0 ; i<N ; i++){
            System.out.println("Введите "+ (i+1) +" элемент:");
            int b = scanner.nextInt();
            array[i] = b;
        }
        if (isFibonacci(array)) {
            System.out.println("Массив является последовательностью Фибоначчи  =)");
        } else {
            if (isFibonacci(sort(array))) {
                System.out.println("Массив является последовательностью Фибоначчи,но стоят не в том порядке.");
            }
            else{
                if (isFibonacci_not_completely(array) || isFibonacci_not_completely(sort(array))){
                    System.out.println("Процент чисел соответствующих последовательности Фибоначчи.");
                }
                else{
                    System.out.println("Массив не является последовательнсью Фиборначчи.");
                }
            }
        }
    }

}