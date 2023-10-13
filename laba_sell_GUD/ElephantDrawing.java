import java.awt.*;
import javax.swing.*;

public class ElephantDrawing extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Нарисовать тело слона
        g2d.setColor(Color.BLACK);
        g2d.drawRect(100,100,125,100);

        // Нарисовать ноги слона
        g2d.setColor(Color.BLACK);
        g2d.drawRect(100, 200, 25, 40);
        g2d.drawRect(125, 200, 25, 40);
        g2d.drawRect(200, 200, 25, 40);
        g2d.drawRect(175, 200, 25, 40);


        // Нарисовать голову слона
        int count = 4;
        int count_1 = 4;
        int[] xPoints = {75, 100-count, 75, 50+count};
        int[] yPoints = {100+count+count_1, 125+count_1, 150-count+count_1, 125+count_1};
        g2d.setColor(Color.black);
        g2d.drawOval(25, 100, 75, 75);
        g2d.drawPolygon(xPoints,yPoints,4);

        // Нарисовать глаз слону блин
        g2d.setColor(Color.BLACK);
        g2d.drawOval(45, 149, 5, 5);



        // Нарисовать нос слона
        g2d.setColor(Color.BLACK);
        g2d.drawOval(31, 171, 30, 30);
        g2d.drawOval(47, 197, 20, 20);
        g2d.drawOval(47, 217, 15, 15);
        g2d.drawOval(37, 225, 13, 13);
        g2d.drawOval(31, 217, 11, 11);
        g2d.drawOval(30, 211, 8, 8);
        g2d.drawOval(24, 210, 6, 6);


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("2D Слон");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ElephantDrawing());
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}