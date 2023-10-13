package Laba_GUI_maxim;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Task_1 extends JFrame {
    private JTextField textField1, textField2;
    private JButton button;

    public Task_1() {
        setTitle("Запись данных в файл");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        // Создание компонентов
        textField1 = new JTextField(25);
        textField2 = new JTextField(25);
        button = new JButton("Записать в файл");

        // Обработчик нажатия на кнопку
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = textField1.getText();
                String filePath = textField2.getText();

                try {
                    // Создание объекта FileWriter для записи в файл
                    FileWriter writer = new FileWriter(filePath);

                    // Запись данных из поля ввода в файл
                    writer.write(inputText);

                    // Закрытие файла
                    writer.close();

                    JOptionPane.showMessageDialog(Task_1.this, "Данные успешно записаны в файл.");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(Task_1.this, "Ошибка при записи данных в файл.", "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Создание панели с компонентами и установка компоновщика
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(new JLabel("Текст (макс. 25 символов):"));
        panel.add(textField1);
        panel.add(new JLabel("Путь к файлу:"));
        panel.add(textField2);
        panel.add(button);

        // Добавление панели на фрейм
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Task_1();
            }
        });
    }
}
