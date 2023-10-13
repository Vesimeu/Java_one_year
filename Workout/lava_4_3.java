public class lava_4_3 {


    public static void main(String[] args){
        float x = -3;
        while (x != 3){
            if (x>=0){
                double f = Math.sin(x)*Math.cos(x);
                System.out.println(f);
            }
            else{
                double f1 = Math.sin(x) + Math.cos(x);
                System.out.println(f1);
            }
            x=x+0.5f;
        }
    }
}
