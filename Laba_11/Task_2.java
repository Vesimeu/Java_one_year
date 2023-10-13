package Laba_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Task_2 extends JFrame {
    public static String path_1 = "C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\Laba_11\\Task_2";
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField middleNameField;
    private JTextField birthDateField;
    private JTextField groupField;

    public Task_2() {
        setTitle("Data Form App");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 2, 10, 10));

        JLabel firstNameLabel = new JLabel("Имя:");
        firstNameField = new JTextField();
        JLabel lastNameLabel = new JLabel("Фамилия:");
        lastNameField = new JTextField();
        JLabel middleNameLabel = new JLabel("Отчество:");
        middleNameField = new JTextField();
        JLabel birthDateLabel = new JLabel("Дата рождения:");
        birthDateField = new JTextField();
        JLabel groupLabel = new JLabel("Учебная группа:");
        groupField = new JTextField();

        JButton saveButton = new JButton("Записать");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveDataToFile();
            }
        });

        JButton loadButton = new JButton("Загрузить");
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadDataFromFile();
            }
        });

        mainPanel.add(firstNameLabel);
        mainPanel.add(firstNameField);
        mainPanel.add(lastNameLabel);
        mainPanel.add(lastNameField);
        mainPanel.add(middleNameLabel);
        mainPanel.add(middleNameField);
        mainPanel.add(birthDateLabel);
        mainPanel.add(birthDateField);
        mainPanel.add(groupLabel);
        mainPanel.add(groupField);
        mainPanel.add(saveButton);
        mainPanel.add(loadButton);

        add(mainPanel);
    }

    private void saveDataToFile() {
        try {
            FileWriter writer = new FileWriter(path_1);
            writer.write(firstNameField.getText() + "\n");
            writer.write(lastNameField.getText() + "\n");
            writer.write(middleNameField.getText() + "\n");
            writer.write(birthDateField.getText() + "\n");
            writer.write(groupField.getText() + "\n");
            writer.close();
            JOptionPane.showMessageDialog(this, "Данные сохранены в файл");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Ошибка при сохранении данных в файл");
        }
    }

    private void loadDataFromFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path_1));
            firstNameField.setText(reader.readLine());
            lastNameField.setText(reader.readLine());
            middleNameField.setText(reader.readLine());
            birthDateField.setText(reader.readLine());
            groupField.setText(reader.readLine());
            reader.close();
            JOptionPane.showMessageDialog(this, "Данные загружены из файла");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Ошибка при загрузке данных из файла");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Task_2 app = new Task_2();
                app.setVisible(true);
            }
        });
    }
}

