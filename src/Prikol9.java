import java.util.Scanner;
public class Prikol9 {
    public static double s =Stepen();
    public static double p =Podkor();
    public static void main(String[] args) {
        double y0 = Y0();
        double pogr1 = 0.01;
        double pogr2 = 0.001;
        double pogr3 = 0.0001;
        double pogr4 = 0.00001;
        double pogr5 = 0.000001;
        Iter(y0,p,pogr1);
        Iter(y0,p,pogr2);
        Iter(y0,p,pogr3);
        Iter(y0,p,pogr4);
        Iter(y0,p,pogr5);

    }
    public static void Iter(double y0,double x,double pogr){
        boolean usl = false;
        double y1 = 100;
        double a = y0;
        double t=0;
        for(int n = 0;n!=10000;n++){
            y1 =((1/s)*(((s-1)*a)+(x/(Math.pow(a,(s-1))))));
            double r = (Math.abs(y1-a));
            if (r<=pogr){
                System.out.println("Точность:" + " "+ Math.abs(y1-a) + " " +"Корень:" + " " + a + " "+ "Кол-во итераций:" + " "+ t);
                break;
            }
            t++;
            a = y1;
        }

    }
    public static boolean Pogresh(double y1,double y0,double pogr){
        boolean a = false;
        if (Math.abs(y1-y0)<=pogr){
            a= true;
        }
        return a;
    }
    public static double Y0(){
        double y=0;
        double e = Math.exp((Math.log((p*(s+1))))/s);
        Scanner in = new Scanner (System.in);
        boolean h = false;
        while (h!= true) {
            System.out.println("Введите y0<"+e);
            y = in.nextDouble();
            if (y>=e) {
                System.out.println("Вы ввели неправильное значение");
                h = false;
            } else {
                h = true;
            }
        }
        return y;
    }
    public static double Stepen(){
        double s=0;
        Scanner in = new Scanner (System.in);
        boolean h = false;
        while (h!= true) {
            System.out.println("Введите степень p не равную 0");
            s = in.nextDouble();
            if (s==0) {
                System.out.println("Вы ввели неправильное значение");
                h = false;
            } else {
                h = true;
            }
        }
        return s;
    }
    public static double Podkor(){
        double p=0;
        Scanner in = new Scanner (System.in);
        boolean h = false;
        while (h!= true) {
            System.out.println("Введите подкоренное значение");
            p = in.nextDouble();
            if ((s%2==0)& p<0){
                System.out.println("Вы ввели неправильное значение при четной степени p подкоренное не может быть <0");
                h = false;
            }
            else {
                h = true;
            }
        }
        return p;
    }

}
