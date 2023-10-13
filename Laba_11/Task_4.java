package Laba_11;
import org.jfree.chart.ui.HorizontalAlignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class Task_4 {
    public static void main(String[] args) {
        // Создание окна
        JFrame frame = new JFrame("Генератор случайных чисел");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Создание текстового поля для вывода чисел
        JTextField[] textFields = new JTextField[7];
        for (int i = 0; i < 7; i++) {
            textFields[i] = new JTextField(10);
            textFields[i].setEditable(false); // Поле ввода неизменяемое для пользователя
            textFields[i].setHorizontalAlignment(SwingConstants.CENTER);
            frame.add(textFields[i]);
        }

        // Создание кнопки
        JButton button = new JButton("Генерировать");
        frame.add(button);

        // Обработчик события нажатия на кнопку
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Генерация 7 случайных чисел
                Random random = new Random();
                for (int i = 0; i < 7; i++) {
                    int randomNumber = random.nextInt(100);
                    textFields[i].setText(Integer.toString(randomNumber));
                }
            }
        });

        // Отображение окна
        frame.setVisible(true);
    }
}
