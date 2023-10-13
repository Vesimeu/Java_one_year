package laba_7;

import java.util.ArrayList;
import java.util.Scanner;

public class task_1 {
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    static void printMatrix(double[][] grid) {
        for(int r=0; r<grid.length; r++) {
            for(int c=0; c<grid[r].length; c++)
                System.out.print(grid[r][c] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args){
        ArrayList<String> massive = new ArrayList<String>();
        System.out.println("Введите длину массива:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String element;
        scanner.nextLine();
        for (int i = 0;i<n;i++){
            System.out.println("Введите" + " " +(i+1) + " элемент массива:");
            element = scanner.nextLine();
            massive.add(element);
            System.out.println(massive);
        }
        System.out.println("Поиск координат точек:");
        ArrayList<Integer> coords_full = new ArrayList<Integer>();
        int count_x  = 0;
        int count_y = 0;
        int i = 0;
        int index_x=0;
        int index_y=0;
        while (i != massive.size()){
                if (massive.get(i).equals("x") || massive.get(i).equals("y")) {
                    if ((massive.get(i).equals("x")) && massive.size() >= (i+1)){
                        if (isNumeric(massive.get(i+1)) == true) {
                            count_x = count_x + 1;
                            index_x = (i + 1);
                        }
                    }
                    if ((massive.get(i).equals("y")) && massive.size() >= (i+1)){
                        if (isNumeric(massive.get(i+1)) == true) {
                            count_y = count_y + 1;
                            index_y = (i + 1);
                        }
                    }
                    if ((count_y == count_x) && (count_x !=0)){
                        coords_full.add((index_x));
                        coords_full.add((index_y));
                    }
                }

            i=i+1;
        }
        System.out.println("Индексы полных координат: "+ coords_full);
        double[][] answer = new double[2][coords_full.size()/2];
        int index = 0;
        for (int b = 0 ; b<coords_full.size()/2;b++){
                answer[0][b] = Math.floor(Double.valueOf(massive.get(coords_full.get(index))));
            index=index+1;
                answer[1][b] = Math.floor(Double.valueOf(massive.get(coords_full.get(index))));
            index=index+1;
            }
        System.out.println("Окончательные данные:");
        System.out.println("Количество координат x: " + count_x);
        System.out.println("Количество координат y: " + count_y);
        System.out.println("Количество полных координат: " + coords_full.size()/2);
        System.out.println("Координаты из двухмерного массива:");

        printMatrix(answer);
        }
    }

