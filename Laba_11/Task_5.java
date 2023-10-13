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
//        g.drawLine(50,45,50,405); //Левая, сниз вверх
//        g.drawLine(45,50,455,50); //Верхняя
//        // Это получается вертикаль
//        g.drawLine(100,50,100,405);
//        g.drawLine(150,50,150,405);
//        g.drawLine(200,50,200,405);
//        g.drawLine(250,50,250,405);
//        g.drawLine(300,50,300,405);
//        g.drawLine(350,50,350,405);
//        g.drawLine(400,50,400,405);
//        g.drawLine(450,45,450,405); // правая
//        //Это получается горизонатль
//        g.drawLine(50,100,450,100);
//        g.drawLine(50,150,450,150);
//        g.drawLine(50,200,450,200);
//        g.drawLine(50,250,450,250);
//        g.drawLine(50,300,450,300);
//        g.drawLine(50,350,450,350);
//        g.drawLine(45,400,455,400); // Заключающая
//
//
//        //Первая фигура
//        g.setColor(Color.orange);
//        g.drawLine(75,75,175,100);
//        g.drawLine(75,75,200,200);
//        g.drawLine(100,300,200,200);
//        g.drawLine(100,300,150,350);
//        g.drawLine(150,350,200,250);
//        g.drawLine(200,250,250,225);
//        g.drawLine(250,225,175,100);
//
//
//        //Вторая фигура
//        g.drawLine(225,250,275,250);
//        g.drawLine(275,250,350,100);
//        g.drawLine(350,100,375,150);
//        g.drawLine(375,150,425,100);
//        g.drawLine(425,100,400,275);
//        g.drawLine(400,275,350,350);
//        g.drawLine(350,350,275,375);
//        g.drawLine(275,375,250,350);
//        g.drawLine(250,350,225,250);
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
//        g.drawString("Пётр Поляков",50, 450);
//    }
//    public static void main(String args[]) {
//        new Task_5("Жёсткая фигура");
//    }
//}
