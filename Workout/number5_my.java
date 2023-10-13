import java.util.Scanner;

public class number5_my {
    public static void printb(String x){
        System.out.println("\033[0;1m" + x + "\u001B[0m");
    }
    public static void print(String x){
        System.out.println(x);
    }
    public static String proect(double x1, double y1, double z1, double x2, double y2, double z2,double x,double y,double z)
    {
        String ret;
        for (double xx = 0;xx<100;xx++){
            for (double yy = 0 ; yy<100;yy++){
                for (double zz=0;zz<100;zz++){
                    if ((((((xx - x1)/(x2-x1)) == (yy - y1)/(y2-y1)) & (((yy - y1)/(y2-y1)) == ((zz - z1)/(z2-z1))) &((xx - x1)/(x2-x1)) == (zz - z1)/(z2-z1))) & (((x - xx)*(x2-x1) + (y-yy)*(y2-y1) + (z - zz) * (z2-z1)) == 0)){
                        ret = "x:"+Double.toString(xx) + " " + "y:"+ Double.toString(yy) + " " + "z:"+ Double.toString(zz);
                        return ret;
                    }
                }
            }
        }
        return "Произошла ошибка.Не удалось найти проекцию!";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printb("\u001B[45m" + "Задание номер 5 ");
        printb("Введите координаты первой точки прямой:");
        print("Введите координату по оси x первой точки прямой:");
        double x1 = in.nextDouble();
        print("Введите координату по оси y первой точки прямой:");
        double y1 = in.nextDouble();
        print("Введите координату по оси z первой точки прямой:");
        double z1 = in.nextDouble();
        printb("Введите координаты второй точки прямой.");
        print("Введите координату по оси x первой точки прямой:");
        double x2 = in.nextDouble();
        print("Введите координату по оси y первой точки прямой:");
        double y2 = in.nextDouble();
        print("Введите координату по оси z первой точки прямой:");
        double z2 = in.nextDouble();
        printb("Введите координа точки.");
        print("Введите координату точки по оси x:");
        double x = in.nextDouble();
        print("Введите координату точки по оси y:");
        double y = in.nextDouble();
        print("Введите координату точки по оси z:");
        double z = in.nextDouble();
        printb("Проекция:" + proect(x1,y1,z1,x2,y2,z2,x,y,z));
    }
}
