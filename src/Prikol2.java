import java.util.Scanner;

public class Prikol2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Введите кол-во членов ряда");
        Integer n =in.nextInt();
        System.out.println("Введите x");
        Integer x =in.nextInt();
        System.out.println("Введите M");
        Integer M =in.nextInt();
        double S = (n-1)*Math.pow(x,3)+(n-2)*Math.pow(x,5)+(n-3)*Math.pow(x,7);
        while (n!=0){
            n-=1;



        }
    }
}
