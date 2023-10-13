import java.util.Scanner;
public class Prikol1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Сколько лаб осталось сдать?");
        Integer k =in.nextInt();
        System.out.println("C какого раза студент сдает работу?");
        Integer n =in.nextInt();
        System.out.println("Сколько раз в месяц студент приходит на консультации?");
        Integer p =in.nextInt();
        Integer q = (k*n)/p;
        System.out.println("Столько месяцев понадобиться-" + q);

    }
}
