
import java.util.Scanner;
public class rd {
    public static String ten(int st,double s,int
            n){
        String m = "0.";
        double g;
        g = st*s;
        for (int i = 0;i<n;i++){
            m = m +
                    String.valueOf((int)Math.floor(g));
            g = (g- (int)Math.floor(g))*st;
        }
        return m;
    }
    public static double ten_resurve(String m,int st,int n){
        n=n+1;
        m = m.replace("0.","");
        double resurve = 0;
        char index;
        for (int i = 0 ; i<n-1;i++){
            index = m.charAt(i);
            resurve = resurve + (index - '0') * Math.pow(st,-(int)(i+1));
        }
        return resurve;
    }
    public static void print(String x){
        System.out.println(x);
    }
    public static void printb(String x){
        System.out.println("\033[0;1m" + x +
                "\u001B[0m");
    }
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        printb("Задание номер 4");
        print("Введите число в десятичной системе счисления , которое меньше 1:");
        double s = scanner.nextDouble();
        if (s>1){
            printb("Ошибка, надо ввести число меньше 1");
        }
        else {
            print("Введите в какую систему счисления перевести:");
            int st = scanner.nextInt();
            print("До какого числа после нуля осуществить перевод:");
            int n = scanner.nextInt();
            String answer = ten(st,s,n);
            double answer_2 = ten_resurve(answer,st,n);
            double error_rate = s-answer_2;
            System.out.println("Ответ:" + answer+"." + "Погрешность:" + (error_rate));
        }
    }
}
