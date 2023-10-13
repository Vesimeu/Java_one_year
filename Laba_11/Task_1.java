//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import javax.swing.text.AttributeSet;
//import javax.swing.text.BadLocationException;
//import javax.swing.text.PlainDocument;
//import java.io.*;
//import Laba_11.*;
//public class Task_1 extends JFrame {
//    private JTextField textField1;
//    private JTextField textField2;
//    private JButton button;
//
//    public Task_1() {
//        setTitle("Запиши мне пару строк");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(new GridBagLayout());
//
//        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        gbc.anchor = GridBagConstraints.WEST;
//        gbc.insets = new Insets(5, 5, 5, 5);
//
//        // Метка и поле ввода для первого поля
//        JLabel label1 = new JLabel("Текст (макс. 25 символов):");
//        add(label1, gbc);
//
//        gbc.gridy++; // делаем правее
//        textField1 = new JTextField(25);
//        textField1.setDocument(new JTextFieldLimit(25));
//        add(textField1, gbc);
//
//        // Метка и поле ввода для второго поля
//        gbc.gridy++; // Делаем ещё правее
//        JLabel label2 = new JLabel("Путь к файлу:");
//        add(label2, gbc);
//
//        gbc.gridy++;
//        textField2 = new JTextField(25);
//        add(textField2, gbc);
//
//        // Кнопка
//        gbc.gridy++;
//        gbc.anchor = GridBagConstraints.CENTER;
//        button = new JButton("Записать в файл");
//        add(button, gbc);
//
//        // Обработчик события нажатия на кнопку
//        button.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                String data = textField1.getText();
//                String filePath = textField2.getText();
//
//                try {
//                    FileWriter writer = new FileWriter(filePath);
//                    writer.write(data);
//                    writer.close();
//                    JOptionPane.showMessageDialog(null, "Данные успешно записаны в файл.");
//                } catch (IOException ex) {
//                    JOptionPane.showMessageDialog(null, "Ошибка при записи в файл: " + ex.getMessage());
//                }
//            }
//        });
//
//        pack();
//        setVisible(true);
//    }
//
//    // Класс для ограничения количества символов в поле ввода
//    class JTextFieldLimit extends PlainDocument {
//        private int limit;
//
//
//        JTextFieldLimit(int limit) {
//            super();
//            this.limit = limit;
//        }
//
//        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
//            if (str == null)
//                return;
//
//            if ((getLength() + str.length()) <= limit) {
//                super.insertString(offset, str, attr);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                new Task_1();
//            }
//        });
//    }
//}
