import java.util.Scanner;
public class Oblast1{
        public static boolean Oblast(double x,double y){
            if (fig1(x,y)){
                if (fig2(x,y)){
                    System.out.println("точка не попала");
                    return false;
                }
                else if (fig3(x,y)) {
                    System.out.println("точка не попала");
                    return false;
                }
                else if (fig5(x,y)) {
                    System.out.println("точка попала");
                    return true;
                }
                else if (fig6(x,y)) {
                    System.out.println("точка попала");
                    return true;
                }
                else if (fig4(x,y)) {
                    System.out.println("точка не попала");
                    return false;
                }
                else{
                    System.out.println("точка попала");
                    return true;
                }
            }
            else{
                System.out.println("Точка не попала");
                return false;
            }

        }

    public static double k(double x1,double y1,double x2,double y2){

        return (y1-y2)/(x1-x2);
    }
    public static double b(double x1,double y1,double x2,double y2){
        return (y1 - x1*k(x1,y1,x2,y2));

    }
    public static boolean fig1(double x , double y){
        if  (y>=0 && (Math.pow(x,2)+Math.pow(y,2)<=Math.pow(6,2))){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean fig2(double x , double y){
        if  (y>=0 && y<=k(-1,0,3,3)*x+b(-1,0,3,3) && y<=k(3,3,4,0)*x+b(3,3,4,0)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean fig3(double x , double y){
        if  (y>=0 && x>=-4 && y<=k(-4,3,-1,0)*x+b(-4,3,-1,0)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean fig4(double x , double y){
        if  ((Math.pow((x+1),2)+Math.pow((y-3),2))<=Math.pow(2,2)){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean fig5(double x , double y){
        if  (Math.pow((x+2),2)+Math.pow((y-3),2)<=Math.pow(1,2)){
            return true;
        }
        else{
            return false;
        }

    }
    public static boolean fig6(double x , double y){
        if  (Math.pow((x),2)+Math.pow((y-3),2)<=Math.pow(1,2)){
            return true;
        }
        else{
            return false;
        }
    }
}