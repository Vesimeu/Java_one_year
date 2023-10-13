package laba_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_number_1 {
    public static ArrayList<String> from_8_to_10(ArrayList<Integer> list){
        ArrayList<String> massive_10 = new ArrayList<>();
        int summ = 0;
        for (int i=0;i<list.size();i++){
            int num = list.get(i)*(int)Math.pow(8,(list.size()-(i+1)));
            summ = summ + num;
        }
        String array_elements_convert = String.valueOf(summ);
        for (int i=0;i<array_elements_convert.length();i++){
            massive_10.add(String.valueOf(array_elements_convert.charAt(i)));
        }

        return massive_10;
    }
    public static void main(String[] args){
        ArrayList<Integer> massive_8 = new ArrayList<>();
        ArrayList<Integer> massive_10 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Это задание номер 1. Введите длину массива:");
        int N = scanner.nextInt();
        int count = 1;
        while (N != 0){
            System.out.println("Введите " + count + " число в 8-ой системе счисления:");
            int number = scanner.nextInt();
            if (number<=7 && number>=0){
                massive_8.add(number);
                N=N-1;
                count=count+1;
            }
            else{
                System.out.println("Неверно введино число, попробуйте ещё раз!");
            }
        }
        System.out.println("Успешно!Возращаю массив:");
        System.out.println("Ваш массив до конвертации:");
        System.out.println(massive_8);
        System.out.println("Ваш массив после конвертации:");
        System.out.println(from_8_to_10(massive_8));
    }
}
