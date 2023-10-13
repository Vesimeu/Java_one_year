import java.awt.*;
import javax.swing.*;

public class HomeDrawing extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.BLACK);
        g2d.drawLine(0,500,1000,500);
        //Нарисуем дом
        g2d.setColor(Color.BLACK);
        g2d.drawRect(300,500-100,225,100);
        int[] xPoints_1 = {300, 525, 450, 225};
        int[] yPoints_1 = {400, 400, 300, 300};
        g2d.drawPolygon(xPoints_1,yPoints_1,4);
        int[] xPoints_2 = {300, 300, 150, 150,225};
        int[] yPoints_2 = {400, 500, 500, 400,300};
        g2d.drawPolygon(xPoints_2,yPoints_2,5);
        //Рисуем дверь
        g2d.drawRect(165,420,40,80);
        g2d.drawRect(240,420,40,40);
        //Рисуем окна
        g2d.drawRect(420,420,70,30);
        g2d.drawRect(320,420,70,30);

        //Заборы
        g2d.setColor(Color.BLACK);
        g2d.drawRect(30,425,15,70);
        g2d.drawRect(60,425,15,70);
        g2d.drawRect(90,425,15,70);
        g2d.drawRect(120,425,15,70);
        g2d.drawRect(540,425,15,70);
        g2d.drawRect(570,425,15,70);
        g2d.drawRect(690,425,15,70);
        g2d.drawRect(720,425,15,70);
        g2d.drawRect(750,425,15,70);
        g2d.drawRect(780,425,15,70);
        g2d.drawRect(810,425,15,70);

        //Дерево
        g2d.drawRect(610,390,50,110); //ствол
        g2d.drawOval(560, 320, 75, 75);
        g2d.drawOval(635, 320, 75, 75);
        g2d.drawOval(605, 270, 60, 60);

        g2d.drawOval(615, 295, 13, 13);
        g2d.drawOval(638, 307, 13, 13);
        g2d.drawOval(635, 285, 13, 13);

        g2d.drawOval(570, 340, 13, 13);
        g2d.drawOval(590, 330, 13, 13);
        g2d.drawOval(605, 345, 13, 13);
        g2d.drawOval(610, 365, 13, 13);
        g2d.drawOval(585, 370, 13, 13);

        g2d.drawOval(645, 345, 13, 13);
        g2d.drawOval(660, 335, 13, 13);
        g2d.drawOval(670, 375, 13, 13);
        g2d.drawOval(680, 358, 13, 13);

        //Какая то дичь снизу
        g2d.drawOval(50, 540, 20, 20);
        g2d.drawOval(40, 558, 20, 20);
        g2d.drawOval(31, 536, 20, 20);
        g2d.drawOval(48, 520, 20, 20);
        g2d.drawOval(68, 534, 20, 20);
        g2d.drawOval(63, 556, 20, 20);

        g2d.drawOval(50+80, 540, 20, 20);
        g2d.drawOval(40+80, 558, 20, 20);
        g2d.drawOval(31+80, 536, 20, 20);
        g2d.drawOval(48+80, 520, 20, 20);
        g2d.drawOval(68+80, 534, 20, 20);
        g2d.drawOval(63+80, 556, 20, 20);

        g2d.drawOval(50+160, 540, 20, 20);
        g2d.drawOval(40+160, 558, 20, 20);
        g2d.drawOval(31+160, 536, 20, 20);
        g2d.drawOval(48+160, 520, 20, 20);
        g2d.drawOval(68+160, 534, 20, 20);
        g2d.drawOval(63+160, 556, 20, 20);

        g2d.drawOval(50+240, 540, 20, 20);
        g2d.drawOval(40+240, 558, 20, 20);
        g2d.drawOval(31+240, 536, 20, 20);
        g2d.drawOval(48+240, 520, 20, 20);
        g2d.drawOval(68+240, 534, 20, 20);
        g2d.drawOval(63+240, 556, 20, 20);

        g2d.drawOval(50+320, 540, 20, 20);
        g2d.drawOval(40+320, 558, 20, 20);
        g2d.drawOval(31+320, 536, 20, 20);
        g2d.drawOval(48+320, 520, 20, 20);
        g2d.drawOval(68+320, 534, 20, 20);
        g2d.drawOval(63+320, 556, 20, 20);

        g2d.drawOval(50+400, 540, 20, 20);
        g2d.drawOval(40+400, 558, 20, 20);
        g2d.drawOval(31+400, 536, 20, 20);
        g2d.drawOval(48+400, 520, 20, 20);
        g2d.drawOval(68+400, 534, 20, 20);
        g2d.drawOval(63+400, 556, 20, 20);

        g2d.drawOval(50+480, 540, 20, 20);
        g2d.drawOval(40+480, 558, 20, 20);
        g2d.drawOval(31+480, 536, 20, 20);
        g2d.drawOval(48+480, 520, 20, 20);
        g2d.drawOval(68+480, 534, 20, 20);
        g2d.drawOval(63+480, 556, 20, 20);

        g2d.drawOval(50+560, 540, 20, 20);
        g2d.drawOval(40+560, 558, 20, 20);
        g2d.drawOval(31+560, 536, 20, 20);
        g2d.drawOval(48+560, 520, 20, 20);
        g2d.drawOval(68+560, 534, 20, 20);
        g2d.drawOval(63+560, 556, 20, 20);

        g2d.drawOval(50+640, 540, 20, 20);
        g2d.drawOval(40+640, 558, 20, 20);
        g2d.drawOval(31+640, 536, 20, 20);
        g2d.drawOval(48+640, 520, 20, 20);
        g2d.drawOval(68+640, 534, 20, 20);
        g2d.drawOval(63+640, 556, 20, 20);

        //Какакя то дичь сверху Номер 1
        int[] xPoints_3 = {150, 200, 200};
        int[] yPoints_3 = {200, 230, 200};
        g2d.drawPolygon(xPoints_3, yPoints_3, 3);
        g2d.drawOval(130,180,25,25);
        int[] xPoints_4 = {130, 130, 78};
        int[] yPoints_4 = {187, 159, 159};
        g2d.drawPolygon(xPoints_4, yPoints_4,3);
        int[] xPoints_5 = {135, 135, 110};
        int[] yPoints_5 = {200, 220, 200};
        g2d.drawPolygon(xPoints_5, yPoints_5,3);
        //Рот
        int[] xPoints_6 = {139, 143, 136};
        int[] yPoints_6 = {192, 197, 199};
        g2d.drawPolygon(xPoints_6, yPoints_6,3);
        //Глаза
        g2d.fillOval(140,184,4,4);
        g2d.fillOval(147,192,4,4);

        //Какая то дичь сверху Номер 2
        int[] xPoints_7 = {530, 560, 515};
        int[] yPoints_7 = {140, 170, 185};
        g2d.drawPolygon(xPoints_7, yPoints_7,3);
        int[] xPoints_8 = {515, 470, 505};
        int[] yPoints_8 = {185, 195, 225};
        g2d.drawPolygon(xPoints_8, yPoints_8,3);
        g2d.drawOval(504,173,11,11);
        g2d.drawOval(530,155,14,14);
        g2d.drawOval(490,197,14,14);
        int[] xPoints_9 = {517, 522, 539,535};
        int[] yPoints_9 = {188, 186, 202,205};
        g2d.drawPolygon(xPoints_9, yPoints_9,4);



    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("2D дом");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new HomeDrawing());
        frame.setSize(900, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}