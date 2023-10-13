package laba_6;

import java.util.Random;

public class Function_Matrica {
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
        public static void main(String[] args) {
            double x = 3;
            double y = 2;
            if ((FigureOne.figureOne(x,y)==0 || FigureOne.figureTwo(x,y)==0 || FigureOne.figureThree(x,y) == 0) || (FigureOne.figureFour(x,y) == 0) || (FigureOne.figureFive(x,y)==0) || (FigureOne.figureSix(x,y)==0) || (FigureOne.figureSeven(x,y)==0) ||
                    (FigureTwo.figureOne(x,y)==0 || FigureTwo.figureTwo(x,y)==0 || FigureTwo.figureThree(x,y) == 0) || (FigureTwo.figureFour(x,y) == 0) || (FigureTwo.figureFive(x,y)==0) || (FigureTwo.figureSix(x,y)==0) || (FigureTwo.figureSeven(x,y)==0)){
                System.out.println("da");
            }
        }


}

