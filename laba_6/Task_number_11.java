package laba_6;

import java.util.Scanner;

public class Task_number_11 {
    public static int isInscribed(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        if (isCyclic(x1, y1, x2, y2, x3, y3, x4, y4)) {
            return 1;
        }
        return -1;
    }

    public static boolean isCyclic(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        double diagonal1 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double diagonal2 = Math.sqrt(Math.pow(x4 - x2, 2) + Math.pow(y4 - y2, 2));

        if (isPerpendicular(x1, y1, x3, y3, x2, y2, x4, y4) && diagonal1 == diagonal2) {
            return true;
        }
        return false;
    }

    public static boolean isPerpendicular(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        double slope1 = (y2 - y1) / (x2 - x1);
        double slope2 = (y4 - y3) / (x4 - x3);

        if (slope1 * slope2 == -1) {
            return true;
        }
        return false;
    }

    public static double getArea(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        double triangle1 = getTriangleArea(x1, y1, x2, y2, x3, y3);
        double triangle2 = getTriangleArea(x1, y1, x3, y3, x4, y4);

        return triangle1 + triangle2;
    }

    public static double getTriangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        double semiperimeter = (side1 + side2 + side3) / 2;

        return Math.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));
    }

    public static int classification_figure(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        if (isRectangle(x1, y1, x2, y2, x3, y3, x4, y4)) {
            return 1;
        }

        if (isSquare(x1, y1, x2, y2, x3, y3, x4, y4)) {
            return 2;
        }

        if (isRhombus(x1, y1, x2, y2, x3, y3, x4, y4)) {
            return 3;
        }

        if (isTrapezoid(x1, y1, x2, y2, x3, y3, x4, y4)) {
            return 4;
        }
        return 5;
    }

    public static int Existence(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        double vector_1_x = (x2 - x1);
        double vector_1_y = (y2 - y1);
        double vector_2_x = (x3 - x2);
        double vector_2_y = (y3 - y2);
        double vector_3_x = (x4 - x3);
        double vector_3_y = (y4 - y3);
        double vector_4_x = (x1 - x4);
        double vector_4_y = (y1 - y4);
        double corner_1 = (vector_1_x * vector_2_x + vector_1_y * vector_2_y) / ((Math.pow((Math.pow(vector_1_x, 2) + Math.pow(vector_1_y, 2)), 1 / 2f)) * (Math.pow((Math.pow(vector_2_x, 2) + Math.pow(vector_2_y, 2)), 1 / 2f)));
        double corner_2 = (vector_2_x * vector_3_x + vector_2_y * vector_3_y) / ((Math.pow(Math.pow(vector_2_x, 2) + Math.pow(vector_2_y, 2), 1 / 2f)) * (Math.pow(Math.pow(vector_3_x, 2) + Math.pow(vector_3_y, 2), 1 / 2f)));
        double corner_3 = (vector_3_x * vector_4_x + vector_3_y * vector_4_y) / ((Math.pow(Math.pow(vector_3_x, 2) + Math.pow(vector_3_y, 2), 1 / 2f)) * (Math.pow(Math.pow(vector_4_x, 2) + Math.pow(vector_4_y, 2), 1 / 2f)));
        double corner_4 = (vector_1_x * vector_4_x + vector_1_y * vector_4_y) / ((Math.pow(Math.pow(vector_1_x, 2) + Math.pow(vector_1_y, 2), 1 / 2f)) * (Math.pow(Math.pow(vector_4_x, 2) + Math.pow(vector_4_y, 2), 1 / 2f)));
        double corner = Math.acos(corner_1)*180/Math.PI + Math.acos(corner_2)*180/Math.PI + Math.acos(corner_3)*180/Math.PI + Math.acos(corner_4)*180/Math.PI;
        if (corner == 360.0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean isRectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        // Check if the quadrilateral has four right angles
        if (isRightAngle(x1, y1, x2, y2, x3, y3) && isRightAngle(x2, y2, x3, y3, x4, y4) &&
                isRightAngle(x3, y3, x4, y4, x1, y1) && isRightAngle(x4, y4, x1, y1, x2, y2)) {
            return true;
        }
        return false;
    }

    public static boolean isSquare(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        if (isRectangle(x1, y1, x2, y2, x3, y3, x4, y4) &&
                isDiagonalEqualLength(x1, y1, x2, y2, x3, y3, x4, y4)) {
            return true;
        }
        return false;
    }

    public static boolean isDiagonalEqualLength(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        double diagonal1 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double diagonal2 = Math.sqrt(Math.pow(x4 - x2, 2) + Math.pow(y4 - y2, 2));

        if (diagonal1 == diagonal2) {
            return true;
        }
        return false;
    }

    public static boolean isRhombus(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        if (isSideEqualLength(x1, y1, x2, y2, x3, y3, x4, y4) &&
                isOppositeAngleEqual(x1, y1, x2, y2, x3, y3, x4, y4)) {
            return true;
        }
        return false;
    }
    public static boolean isOppositeAngleEqual(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        double angle1 = getAngle(x1, y1, x2, y2, x4, y4);
        double angle2 = getAngle(x2, y2, x3, y3, x1, y1);
        double angle3 = getAngle(x3, y3, x4, y4, x2, y2);
        double angle4 = getAngle(x4, y4, x1, y1, x3, y3);

        if (angle1 == angle3 && angle2 == angle4) {
            return true;
        }
        return false;
    }
    public static boolean isTrapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        if (isParallel_1(x1, y1, x2, y2, x3, y3, x4, y4)) {
            return true;
        }
        return false;
    }

    public static boolean isRightAngle(double x1, double y1, double x2, double y2, double x3, double y3) {
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)) {
            return true;
        }
        return false;
    }

    public static boolean isSideEqualLength(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        double side4 = Math.sqrt(Math.pow(x1 - x4, 2) + Math.pow(y1 - y4, 2));

        if (side1 == side2 && side2 == side3 && side3 == side4) {
            return true;
        }
        return false;
    }


    public static boolean isAngleEqual(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        double angle1 = getAngle(x1, y1, x2, y2, x4, y4);
        double angle2 = getAngle(x2, y2, x3, y3, x1, y1);
        double angle3 = getAngle(x3, y3, x4, y4, x2, y2);
        double angle4 = getAngle(x4, y4, x1, y1, x3, y3);

        if (angle1 == angle2 && angle2 == angle3 && angle3 == angle4) {
            return true;
        }
        return false;

    }


    public static double getAngle(double x1, double y1, double x2, double y2, double x3, double y3) {
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        double cosine = (Math.pow(side1, 2) + Math.pow(side2, 2) - Math.pow(side3, 2)) / (2 * side1 * side2);
        return Math.toDegrees(Math.acos(cosine));

    }

    public static boolean isParallel_1(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        if (isParallel(x1, y1, x2, y2, x3, y3, x4, y4)) {
            return true;
        }
        if (isParallel(x2, y2, x3, y3, x4, y4, x1, y1)) {
            return true;
        }
        return false;
    }

    public static boolean isParallel(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        double slope1 = (y2 - y1) / (x2 - x1);
        double slope2 = (y4 - y3) / (x4 - x3);

        if (slope1 == slope2) {
            return true;
        }
        return false;

    }
    public static void printb(String x){
        System.out.println("\033[0;1m" + x + "\u001B[0m");
    }

    public static void print_matric(int[][] matric) {
        for (int i = 0; i < matric.length; i++) {
            for (int g = 0; g < matric[0].length; g++) {
                System.out.print(matric[i][g] + " ");
            }
            System.out.println();
        }
    }
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            printb("11 задание!");
            System.out.println("Введите количество четырёхугольников:");
            int N = scanner.nextInt();
            double[][] massive = new double[2][N * 4];
            int index = 0;
            for (int i = 0 ; i<N;i++) {
                System.out.println("Введите координаты вершин " + (i+1)  + " четырёхугольника:");
                System.out.println("Введите точку A по x и y");
                double A_x = scanner.nextDouble();
                double A_y = scanner.nextDouble();
                massive[0][index] = A_x;
                massive[1][index] = A_y;
                index = index + 1;
                System.out.println("Введите точку B по x и y");
                double B_x = scanner.nextDouble();
                double B_y = scanner.nextDouble();
                massive[0][index] = B_x;
                massive[1][index] = B_y;
                index = index + 1;
                System.out.println("Введите точку C по x и y");
                double C_x = scanner.nextDouble();
                double C_y = scanner.nextDouble();
                massive[0][index] = C_x;
                massive[1][index] = C_y;
                index = index + 1;
                System.out.println("Введите точку D по x и y");
                double D_x = scanner.nextDouble();
                double D_y = scanner.nextDouble();
                massive[0][index] = D_x;
                massive[1][index] = D_y;
                index=index+1;
            }
            int index_answer = 0;
            int[][] massive_answer = new int[4][N];
            if (N == 1) {
                if (Existence(massive[0][(0)],massive[1][(0)],massive[0][1],massive[1][1],massive[0][2],massive[1][2],massive[0][3],massive[1][3]) == 1) {
                    massive_answer[0][index_answer] = 1;
                    massive_answer[1][index_answer] = classification_figure(massive[0][0],massive[1][0],massive[0][1],massive[1][1],massive[0][2],massive[1][2],massive[0][3],massive[1][3]);
                    massive_answer[2][index_answer] = (int) Math.ceil(getArea(massive[0][0],massive[1][0],massive[0][1],massive[1][1],massive[0][2],massive[1][2],massive[0][3],massive[1][3]));
                    if (classification_figure(massive[0][0],massive[1][0],massive[0][1],massive[1][1],massive[0][2],massive[1][2],massive[0][3],massive[1][3]) == 1){
                        massive_answer[3][index_answer] = 1;
                    }
                    else {
                        massive_answer[3][index_answer] = isInscribed(massive[0][0], massive[1][0 ], massive[0][1 ], massive[1][1 ], massive[0][2 ], massive[1][2], massive[0][3], massive[1][3]);
                    }

                }
                else{
                    System.out.println("Такого четырёхугольника нету!");
                }
            }
            else{
            for (int i = 0 ;i < N + 4;i=i+4) {
                if (Existence(massive[0][(0 + i)], massive[1][(0 + i)], massive[0][1 + i], massive[1][1 + i], massive[0][2 + i], massive[1][2 + i], massive[0][3 + i], massive[1][3 + i]) == 1) {
                    massive_answer[0][index_answer] = 1;
                    massive_answer[1][index_answer] = classification_figure(massive[0][0 + i], massive[1][0 + i], massive[0][1 + i], massive[1][1 + i], massive[0][2 + i], massive[1][2 + i], massive[0][3 + i], massive[1][3 + i]);
                    massive_answer[2][index_answer] = (int) Math.ceil(getArea(massive[0][0 + i], massive[1][0 + i], massive[0][1 + i], massive[1][1 + i], massive[0][2 + i], massive[1][2 + i], massive[0][3 + i], massive[1][3 + i]));
                    if (classification_figure(massive[0][0 + i], massive[1][0 + i], massive[0][1 + i], massive[1][1 + i], massive[0][2 + i], massive[1][2 + i], massive[0][3 + i], massive[1][3 + i]) == 1) {
                        massive_answer[3][index_answer] = 1;
                    } else {
                        massive_answer[3][index_answer] = isInscribed(massive[0][0 + i], massive[1][0 + i], massive[0][1 + i], massive[1][1 + i], massive[0][2 + i], massive[1][2 + i], massive[0][3 + i], massive[1][3 + i]);
                    }
                    index_answer = index_answer + 1;

                } else {
                    System.out.println("Такого четырёхугольника нету!");
                }
            }
            }
            System.out.println("Массив ответов : ");
            print_matric(massive_answer);

        }
}
