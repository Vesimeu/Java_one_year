//import javax.swing.*;
//import java.awt.*;
//
//public class Task_5 extends JFrame {
//    public Task_5 (String s) {
//        super (s);
//        setSize(500, 500);
//        setVisible(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//
//    public void paint(Graphics g){
//        super.paint(g);
//        g.setFont(new Font("Serif", Font.ROMAN_BASELINE, 30));
//        g.setColor(Color.BLACK);
//        g.drawLine(50,45,50,405);
//        g.drawLine(45,50,455,50);
//        // верт
//        g.drawLine(100,50,100,405);
//        g.drawLine(150,50,150,405);
//        g.drawLine(200,50,200,405);
//        g.drawLine(250,50,250,405);
//        g.drawLine(300,50,300,405);
//        g.drawLine(350,50,350,405);
//        g.drawLine(400,50,400,405);
//        g.drawLine(450,45,450,405);
//        //Это получается горизонатль
//        g.drawLine(50,75,450,75);
//        g.drawLine(50,100,450,100);
//        g.drawLine(50,125,450,125);
//        g.drawLine(50,150,450,150);
//        g.drawLine(50,175,450,175);
//        g.drawLine(50,200,450,200);
//        g.drawLine(50,225,450,225);
//        g.drawLine(50,250,450,250);
//        g.drawLine(50,275,450,275);
//        g.drawLine(50,300,450,300);
//        g.drawLine(50,325,450,325);
//        g.drawLine(50,350,450,350);
//        g.drawLine(50,375,450,375);
//        g.drawLine(45,400,455,400);
//
//
//        //Первая фигура
//        g.setColor(Color.GREEN);
//        g.drawArc(75,75,100,100,100,180);
//        g.drawLine(125,75,225,100);
//        g.drawLine(125,175,200,150);
//        g.drawLine(200,150,225,100);
//
//
//
//        //Вторая фигура
//        g.drawLine(200,175,225,200);
//        g.drawArc(225,150,100,100,180,180);
//        g.drawLine(325,200,200,175);
//
//
//        g.setFont(new Font("Serif", Font.ROMAN_BASELINE, 12));
//        g.setColor(Color.BLACK);
//        g.drawString("-8", 50, 415); // Подписи X
//        g.drawString("-6", 100, 415);
//        g.drawString("-4",150 , 415);
//        g.drawString("-2", 200, 415);
//        g.drawString("0", 250, 415);
//        g.drawString("2", 300, 415);
//        g.drawString("4", 350, 415);
//        g.drawString("6", 400, 415);
//        g.drawString("8", 450, 415);
//
//        g.drawString("-8", 27, 403); //Y
//        g.drawString("-6", 27, 353);
//        g.drawString("-4", 27, 303);
//        g.drawString("-2", 27, 253);
//        g.drawString("0", 27, 203);
//        g.drawString("2", 27, 153);
//        g.drawString("4", 27, 103);
//        g.drawString("6", 27, 53);
//
//
//
//        g.setColor(Color.blue);
//    }
//    public static void main(String args[]) {
//        new Task_5("фигурка");
//    }
//}
