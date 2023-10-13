package laba_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Task_8 {
    public static String path = "C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\Task_8";

        public static double k(double x1, double y1, double x2, double y2) {
            return (y1 - y2) / (x1 - x2);
        }

        public static double b(double x1, double y1, double x2, double y2) {
            return y1 - x1 * k(x1, y1, x2, y2);
        }

        public static class FigureOne {
            public static int figureOne(double x, double y) {
                if (y > k(-4, -6, -6, -4) * x + b(-4, -6, -6, -4) && y < k(-6, -4, -4, -2) * x + b(-6, -4, -4, -2) && x <= -4) {
                    return 1;
                }
                if ((y == k(-4, -6, -6, -4) * x + b(-4, -6, -6, -4) || y == k(-6, -4, -4, -2) * x + b(-6, -4, -4, -2)) && x <= -4 && x >= -6) {
                    return 0;
                }
                return -1;
            }

            public static int figureTwo(double x, double y) {
                if (x >= -4 && y <= -2 && y > k(-4, -6, -2, -2) * x + b(-4, -6, -2, -2)) {
                    return 1;
                }
                if (x >= -4 && y <= -2 && y == k(-4, -6, -2, -2) * x + b(-4, -6, -2, -2)) {
                    return 0;
                }
                return -1;
            }

            public static int figureThree(double x, double y) {
                if (y < k(-4, -2, -2, 0) * x + b(-4, -2, -2, 0) && x <= -2 && y >= -2) {
                    return 1;
                }
                if (y == k(-4, -2, -2, 0) * x + b(-4, -2, -2, 0) && x <= -2 && x >= -4) {
                    return 0;
                }
                return -1;
            }

            public static int figureFour(double x, double y) {
                if (y > k(0, 1, -2, -2) * x + b(0, 1, -2, -2) && x >= -2 && y < k(-2, 2, 0, 1) * x + b(-2, 2, 0, 1)) {
                    return 1;
                }
                if ((y == k(0, 1, -2, -2) * x + b(0, 1, -2, -2) || y == k(-2, 2, 0, 1) * x + b(-2, 2, 0, 1)) && x >= -2 && x <= 0) {
                    return 0;
                }
                return -1;
            }

            public static int figureFive(double x, double y) {
                if (y > k(-2, 0, -6, 4) * x + b(-2, 0, -6, 4) && x <= -2 && y < k(-6, 4, -2, 2) * x + b(-6, 4, -2, 2)) {
                    return 1;
                }
                if (y == k(-2, 0, -6, 4) * x + b(-2, 0, -6, 4) && x >= -6 && x <= -2) {
                    return 0;
                }
                return -1;
            }

            public static int figureSix(double x, double y) {
                if (y > k(-2, 2, -6, 4) * x + b(-2, 2, -6, 4) && y <= 4 && y < k(-3, 4, -2, 2) * x + b(-3, 4, -2, 2)) {
                    return 1;
                }
                if (y <= k(-3, 4, -2, 2) * x + b(-3, 4, -2, 2) && x < -2 && x >= -3) {
                    return 0;

                }
                return -1;
            }

            public static int figureSeven(double x, double y) {
                if (y > k(-6, 4, -7, 5) * x + b(-6, 4, -7, 5) && y >= 4 && y < k(-7, 5, -3, 4) * x + b(-7, 5, -3, 4)) {
                    return 1;
                }
                if ((y == k(-6, 4, -7, 5) * x + b(-6, 4, -7, 5) || y == k(-7, 5, -3, 4) * x + b(-7, 5, -3, 4) && x <= -3 && x >= -7)) {
                    return 0;
                }
                return -1;
            }
        }
        public static class FigureTwo {
            public static int figureOne(double x, double y) {
                if (y > k(0, -6, -1, -2) * x + b(0, -6, -1, -2) && y <= -2 && y > k(0, -6, 1, -2) * x + b(0, -6, 1, -2)) {
                    return 1;
                }
                if (y == k(0, -6, -1, -2) * x + b(0, -6, -1, -2) && x >= -1 && x<=0){
                    return 0;
                }
                return -1 ;
            }

            public static int figureTwo(double x, double y) {
                if (y <= k(0, -6, 1, -2) * x + b(0, -6, 1, -2) && x <= 1 && y >= k(1, -7, 0, -6) * x + b(1, -7, 0, -6)) {
                    return 1;
                }
                if (x>=0 && x <= 1 && y == k(1, -7, 0, -6) * x + b(1, -7, 0, -6)){
                    return 0;
                }
                return -1;
            }

            public static int figureThree(double x, double y) {
                if (y <= k(1, -2, 5, 2) * x + b(1, -2, 5, 2) && x >= 1 && y >= k(1, -7, 5, 2) * x + b(1, -7, 5, 2)) {
                    return 1;
                }
                return -1;
            }

            public static int figureFour(double x, double y) {
                if (y <= k(1, -7, 5, 2) * x + b(1, -7, 5, 2) && y >= k(5, 2, 4, -6) * x + b(5, 2, 4, -6) && y > k(4, -6, 1, -7) * x + b(4, -6, 1, -7)) {
                    return 1;
                }
                if (y == k(4, -6, 1, -7) * x + b(4, -6, 1, -7) && x>=1 && x<=4){
                    return 0;
                }
                return -1;
            }

            public static int figureFive(double x, double y) {
                if (y <= k(4, -6, 5, 2) * x + b(4, -6, 5, 2) && y <= k(5, 2, 6, -3) * x + b(5, 2, 6, -3) && y > k(4, -6, 6, -3) * x + b(4, -6, 6, -3)) {
                    return 1;
                }
                if (y == k(4, -6, 6, -3) * x + b(4, -6, 6, -3) && x>=4 && x<=6){
                    return 0;
                }
                return -1;
            }

            public static int figureSix(double x, double y) {
                if (y < k(5, 2, 7, 4) * x + b(5, 2, 7, 4) && y > k(7, 4, 6, -3) * x + b(7,4,6,-3) && y >= k(6,-3,5,2) * x + b(6,-3,5,2)) {
                    return 1;
                }
                if ((y == k(5, 2, 7, 4) * x + b(5, 2, 7, 4) && y == k(7, 4, 6, -3) * x + b(7,4,6,-3)) && x>=5 && x<=7) {
                    return 0;
                }
                return -1;
            }

            public static int figureSeven(double x, double y) {
                if (y >= k(1, -2, 5, 2) * x + b(1, -2, 5, 2) && y < k(1, -2, 4, 4) * x + b(1, -2, 4, 4) && y < k(4, 4, 5, 2) * x + b(4, 4, 5, 2)) {
                    return 1;
                }
                if ((y == k(1, -2, 4, 4) * x + b(1, -2, 4, 4) || y == k(4, 4, 5, 2) * x + b(4, 4, 5, 2)) && x>=1 && x<=4){
                    return 0;
                }
                return -1;
            }

        }
        public static void main(String[] args){
            try {
                BufferedReader file_r = new BufferedReader(new FileReader(path));
                BufferedWriter file_w = new BufferedWriter(new FileWriter(path,true));
                String line;
                file_w.write('\n' + "Стилиризованный ответ:" + '\n');
                while ((line = file_r.readLine()) != null) {
                    if (line.startsWith("Массив точек:")) {
                        // Извлекаем строку с массивом точек
                        String pointsLine = line.substring(line.indexOf(":") + 1).trim();

                        // Разбиваем строку на отдельные точки
                        String[] points = pointsLine.split(" ");

                        // Выводим каждую точку в требуемом формате
                        for (String point : points) {
                            String[] coordinates = point.split(",");
                            int pointNumber = Integer.parseInt(coordinates[0].trim());
                            double x = Double.parseDouble(coordinates[1].trim());
                            double y = Double.parseDouble(coordinates[2].trim());
                            if (FigureOne.figureOne(x,y) == 1 || FigureOne.figureTwo(x,y) == 1 || FigureOne.figureThree(x,y) == 1 ||
                            FigureOne.figureFour(x,y) == 1 || FigureOne.figureFive(x,y) == 1 || FigureOne.figureSix(x,y) == 1 || FigureOne.figureSeven(x,y) == 1){
                                System.out.println("Точка номер " + pointNumber + "попала в область");
                                file_w.write("Точка номер " + pointNumber + " попала в 1 область" + '\n');
                                continue;
                            }
                            else if (FigureOne.figureOne(x,y) == 0 || FigureOne.figureTwo(x,y) == 0 || FigureOne.figureThree(x,y) == 0 ||
                                    FigureOne.figureFour(x,y) == 0 || FigureOne.figureFive(x,y) == 0 || FigureOne.figureSix(x,y) == 0 || FigureOne.figureSeven(x,y) == 0) {
                                System.out.println("Точка номер " + pointNumber + "попала на границу области");
                                file_w.write("Точка номер " + pointNumber + " попала на границу в 1 область" + '\n');
                                continue;
                            }
                            if (FigureTwo.figureOne(x,y) == 1 || FigureTwo.figureTwo(x,y) == 1 || FigureTwo.figureThree(x,y) == 1 || FigureTwo.figureFour(x,y) == 1 ||
                            FigureTwo.figureFive(x,y) == 1 || FigureTwo.figureSix(x,y) == 1 || FigureTwo.figureSeven(x,y) == 1){
                                System.out.println("Точка номер " + pointNumber + "попала в область");
                                file_w.write("Точка номер " + pointNumber + " попала в 2 область" + '\n');
                                continue;
                            } else if (FigureTwo.figureOne(x,y) == 0 || FigureTwo.figureTwo(x,y) == 0 || FigureTwo.figureThree(x,y) == 0 || FigureTwo.figureFour(x,y) == 0 ||
                                    FigureTwo.figureFive(x,y) == 0 || FigureTwo.figureSix(x,y) == 0 || FigureTwo.figureSeven(x,y) == 0) {
                                System.out.println("Точка номер " + pointNumber + " попала на границу области");
                                file_w.write("Точка номер " + pointNumber + " попала на границу в 2 область" + '\n');
                                continue;
                            }
                            else{
                                System.out.println("Точка номер " + pointNumber + " не попала");
                                file_w.write("Точка номер " + pointNumber + " не попала в область" + '\n');
                            }
                        }
                    }
                }
                file_w.close();
            }

            catch (Exception e){
                e.printStackTrace();
            }
        }
}
