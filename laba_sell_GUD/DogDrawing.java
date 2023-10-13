import java.awt.*;
import javax.swing.*;

public class DogDrawing extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Нарисовать тело собаки
        g2d.setColor(Color.BLACK);
        int[] xPoints = {200, 250, 150};
        int[] yPoints = {120, 250, 250};
        int nPoints = 3;
        g2d.drawPolygon(xPoints, yPoints, nPoints);
        int[] xPoints_1 = {182, 150+2, 100};
        int[] yPoints_1 = {166, 250-5, 200};
        int nPoints_1 = 3;
        g2d.drawPolygon(xPoints_1, yPoints_1, nPoints_1);
        int[] xPoints_2 = {219, 248, 300};
        int[] yPoints_2 = {166, 250-5, 200};
        int nPoints_2 = 3;
        g2d.drawPolygon(xPoints_2, yPoints_2, nPoints_2);

        // Нарисовать голову собаки
        g2d.setColor(Color.BLACK);
        g2d.drawRect(200-45,120-28,45*2,30);
        g2d.drawLine(200,120,200,92);
        g2d.drawRect(200-30,120-28-27,90-30,27);
        int kof1 = 3;
        int[] xPoints_3 = {230, 250-kof1, 290-kof1, 270};
        int[] yPoints_3 = {65, 55+kof1, 100+kof1, 110};
        g2d.drawPolygon(xPoints_3,yPoints_3,4);
        int kof2 = 3;
        int[] xPoints_4 = {200-30, 150+kof1, 110+kof1, 130};
        int[] yPoints_4 = {120-28-27, 55+kof1, 100+kof1, 110};
        g2d.drawPolygon(xPoints_4,yPoints_4,4);
        //two glaza
        g2d.fillOval(178, 83, 5, 5);
        g2d.fillOval(218, 83, 5, 5);

        //Нижняя часть
        g2d.setColor(Color.BLACK);
        g2d.drawRect(150,250,25,8);
        g2d.drawRect(225,250,25,8);
        int[] xPoints_5 = {135, 140, 100};
        int[] yPoints_5 = {230, 258, 258};
        g2d.drawPolygon(xPoints_5,yPoints_5,3);
        int kof3 = 130;
        int[] xPoints_6 = {135+kof3, 140 + kof3-10, 100 + kof3+72};
        int[] yPoints_6 = {230, 258, 258};
        g2d.drawPolygon(xPoints_6,yPoints_6,3);


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("2D Собака");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DogDrawing());
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}