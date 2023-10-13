package laba_8;
import java.awt.*;
import java.io.*;

public class Task_15 {
    //TODO @Vesimeu
    public static String path_file_1 = "C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\Task_15_1";
    public static String path_file_2 = "C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\Task_15_2";
    public static String path_file_3 = "C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\Task_15_3";

    public static double getPercent(double B, double S) {
        return S / B * 100;
    }

    //формула Герона
    public static double getQuadrilateralArea(Point[] points) {
        double a = points[0].distance(points[1]);
        double b = points[1].distance(points[2]);
        double c = points[2].distance(points[3]);
        double d = points[3].distance(points[0]);
        double p1 = (a + b + c) / 2;
        double p2 = (c + d + a) / 2;
        double s1 = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
        double s2 = Math.sqrt(p2 * (p2 - c) * (p2 - d) * (p2 - a));
        double area = s1 + s2;
        return area;
    }

    public static boolean isSmallRectangleInsideBigRectangle(Point[] bigRect, Point[] smallRect) {
        // Проверяем, что все вершины маленького четырехугольника находятся внутри большого четырехугольника
        for (Point p : smallRect) {
            if (!isPointInsideRectangle(p, bigRect)) {
                return false;
            }
        }
        // Если все вершины маленького четырехугольника находятся внутри большого, значит, он лежит внутри
        return true;
    }

    public static boolean isPointInsideRectangle(Point p, Point[] rect) {
        // Проверяем, что точка лежит внутри четырехугольника, используя теорему о принадлежности точки многоугольнику
        int n = rect.length;
        boolean inside = false;
        for (int i = 0, j = n - 1; i < n; j = i++) {
            if (((rect[i].y > p.y) != (rect[j].y > p.y)) &&
                    (p.x < (rect[j].x - rect[i].x) * (p.y - rect[i].y) / (rect[j].y - rect[i].y) + rect[i].x)) {
                inside = !inside;
            }
        }
        return inside;
    }

    public static boolean isCircleInsideQuadrilateral(Point[] quadrilateral, Point circleCenter, double radius) {
        double centerX = (quadrilateral[0].getX() + quadrilateral[1].getX() + quadrilateral[2].getX() + quadrilateral[3].getX()) / 4;
        double centerY = (quadrilateral[0].getY() + quadrilateral[1].getY() + quadrilateral[2].getY() + quadrilateral[3].getY()) / 4;
        boolean isCenterInside = rayCasting(centerX, centerY, quadrilateral);
        if (!isCenterInside) {
            return false;
        }
        for (int i = 0; i < 360; i++) {
            double x = circleCenter.getX() + radius * Math.cos(Math.toRadians(i));
            double y = circleCenter.getY() + radius * Math.sin(Math.toRadians(i));
            boolean isPointInside = rayCasting(x, y, quadrilateral);
            if (!isPointInside) {
                return false;
            }
        }
        return true;
    }

    private static boolean rayCasting(double x, double y, Point[] vertices) {
        boolean inside = false;
        for (int i = 0, j = vertices.length - 1; i < vertices.length; j = i++) {
            double xi = vertices[i].getX();
            double yi = vertices[i].getY();
            double xj = vertices[j].getX();
            double yj = vertices[j].getY();
            boolean intersect = ((yi > y) != (yj > y))
                    && (x < (xj - xi) * (y - yi) / (yj - yi) + xi);
            if (intersect) {
                inside = !inside;
            }
        }
        return inside;
    }

    public static double getCircleArea(double radius) {
        double pi = Math.PI;
        double area = pi * Math.pow(radius, 2);
        return area;
    }


    public static void main(String[] args) {
        String line = "";
        try {
            BufferedReader file_1 = new BufferedReader(new FileReader(path_file_1));
            BufferedReader file_2 = new BufferedReader(new FileReader(path_file_2));
            int count_object;
            int count_water;
            double sq_water;
            int count_key;
            double sq_key;
            int number_region = 0;
            Point[] bigRect = new Point[4];
            int count = 0;
            while ((line = file_1.readLine()) != null) {
                count_object = 0;
                number_region++;
                count_water = 0;
                sq_key = 0;
                count_key = 0;
                sq_water = 0;
                for (String l : line.split(" ")) {
                    int x = Integer.parseInt(l.split(";")[0]);
                    int y = Integer.parseInt(l.split(";")[1]);
                    bigRect[count] = new Point(x, y);
                    count = count + 1;
                }

                int left_count;
                Point[] smallRect = new Point[4];
                count = 0;
                while ((line = file_2.readLine()) != null) { //1-Участок, 2-ЛЭП, 3-Скважина, 4-Дом, 5-Баня 6 - водоём 7 - ключ
                    for (String l : line.split(" ")) {
                        count = 0;
                        if (String.valueOf(l.charAt(0)).equals("6") || String.valueOf(l.charAt(0)).equals("7")) {// Если круглые объекты
                            if (String.valueOf(l.charAt(0)).equals("6")) {
                                String[] coords = l.substring(2).split(";");
                                Point point = new Point(Integer.parseInt(coords[0]), Integer.parseInt(coords[1]));
                                double Radius = Double.valueOf(coords[2]);
                                if (isCircleInsideQuadrilateral(bigRect, point, Radius)) {
                                    count_water++;
                                    sq_water = sq_water + getCircleArea(Radius);
                                }
                            }
                            if (String.valueOf(l.charAt(0)).equals("7")) {
                                String[] coords = l.substring(2).split(";");
                                Point point = new Point(Integer.parseInt(coords[0]), Integer.parseInt(coords[1]));
                                double Radius = Double.valueOf(coords[2]);
                                if (isCircleInsideQuadrilateral(bigRect, point, Radius)) {
                                    count_key++;
                                    sq_key = sq_key + getCircleArea(Radius);
                                }
                            }

                        } else {
                            String[] parts = l.substring(2).split(";");
                            for (int i = 0, j = 0; i < parts.length; i += 2, j++) {
                                int x = Integer.parseInt(parts[i]);
                                int y = Integer.parseInt(parts[i + 1]);
                                smallRect[count] = new Point(x, y);
                                count++;
                            }
                            if (isSmallRectangleInsideBigRectangle(bigRect, smallRect)) {
                                count_object++;
                            }
                        }
                    }
                    count = 0;

                }
                Region r = new Region(number_region, getQuadrilateralArea(bigRect), (count_object + count_water + count_key), getPercent(getQuadrilateralArea(bigRect), sq_water), getPercent(getQuadrilateralArea(bigRect), sq_key));
                try {
                    BufferedWriter file_3 = new BufferedWriter(new FileWriter(path_file_3, true));
                    file_3.write("Ответ:" + '\n');
                    file_3.write("Номер региона:" + r.getNumber()+ '\n');
                    file_3.write("Площадь участка" + r.getSquare_region()+ '\n');
                    file_3.write("Кол-во объектов в участке:" + r.getCount_object()+ '\n');
                    file_3.write("Процент площади участка, которую занимает водоём:" + r.getSquare_water()+ '\n');
                    file_3.write("Площадь участка, который занимает ключ:" + r.getSquare_key()+ '\n');
                    file_3.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        class Region {
            public int number;
            public double square_region;
            public int count_object;
            public double square_water;
            public double square_key;

            public Region(int number, double square_region, int count_object, double square_water, double square_key) {
                this.number = number;
                this.square_region = square_region;
                this.count_object = count_object;
                this.square_water = square_water;
                this.square_key = square_key;
            }

            public void getFull() {
                System.out.print(number + "\n");
                System.out.print(square_region + "\n");
                System.out.print(count_object + "\n");
                System.out.print(square_water + "\n");
                System.out.print(square_key + "\n");
            }

            public int getNumber() {
                return number;
            }

            public double getSquare_region() {
                return square_region;
            }

            public int getCount_object() {
                return count_object;
            }

            public double getSquare_water() {
                return square_water;
            }

            public double getSquare_key() {
                return square_key;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            public void setSquare_region(double square_region) {
                this.square_region = square_region;
            }

            public void setCount_object(int count_object) {
                this.count_object = count_object;
            }

            public void setSquare_water(double square_water) {
                this.square_water = square_water;
            }

            public void setSquare_key(double square_key) {
                this.square_key = square_key;
            }
        }
    }
}