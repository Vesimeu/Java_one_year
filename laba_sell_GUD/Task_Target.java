import javax.swing.*;
import java.awt.*;

public class Task_Target extends JFrame {
    private final int WIDTH = 400;
    private final int HEIGHT = 400;

    public Task_Target() {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static int p(int A){
        if (A==1){
            return 10;
        }
        if (A==10){
            return 1;
        }
        else{
            return 10-A+1;
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        int centerX = WIDTH / 2;
        int centerY = HEIGHT / 2;
        int radius = 150;



        for (int i = 10; i >= 1; i--) {
            if (i % 2 == 0) {
                g.setColor(Color.YELLOW);

            } else {
                g.setColor(Color.WHITE);
            }
            g.fillRect(centerX - (i * radius / 10), centerY - (i * radius / 10), i * 2 * radius / 10, i * 2 * radius / 10);
            g.setColor(Color.BLACK);
            // нарисуем цифры на верхней стороне квадрата
//            g.drawString(Integer.toString(i), centerX - (radius / 10)+10  , centerY - (i * radius / 10)+15);
//            g.drawString(Integer.toString(i), (radius / 10)*i + 40  , 210);
        }
        for (int i = 1;i<=10;i++){
            g.setColor(Color.BLACK);
            g.drawString(Integer.toString(i), (radius / 10)*i + 40  , 205);
            if (i==10){
                g.drawString(Integer.toString(p(i)), centerX - (radius / 10)+10  , centerY - (i * radius / 10)+15);
                g.drawString(Integer.toString(p(i)), (radius / 10)*i + 190  , 205);
            }
            else{
                g.drawString(Integer.toString(i), centerX - (radius / 10)+10  , centerY - (i * radius / 10)+160);
            }
            if (p(i)==10){
                continue;
            }
            else{
                g.drawString(Integer.toString(p(i)), centerX - (radius / 10)+10  , centerY - (i * radius / 10)+15);
                g.drawString(Integer.toString(p(i)), (radius / 10)*i + 190  , 205);
            }
        }
        g.setColor(Color.BLACK);
        g.drawLine(centerX+15,centerY+15,350,350);
        g.drawLine(centerX-15,centerY-15,50,50);
        g.drawLine(centerX-15,centerY+15,50,350);
        g.drawLine(centerX+15,centerY-15,350,50);
    }

    public static void main(String[] args) {
        Task_Target main = new Task_Target();

    }
}
