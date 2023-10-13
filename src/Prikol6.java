import java.util.Scanner;
public class Prikol6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean polzdov = false;
        double x;
        double y;
        int otv;
        do{
            System.out.println("Введите x");
            x = in.nextDouble();
            System.out.println("Введите y");
            y = in.nextDouble();
            Oblast1.Oblast(x,y);
            System.out.println("Хотите продолжить? Введите 1 если да или 2 если нет.");
            otv = in.nextInt();
            switch (otv){
                case (1):
                    polzdov = false;
                    break;
                case (2):
                    polzdov = true;
                    break;
                default:
                    System.out.println("Напишите 1 или 2");
                    break;
            }
        } while (polzdov != true);

    }
}
