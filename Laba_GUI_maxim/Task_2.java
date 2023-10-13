//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.io.*;
//
//public class Task_2 extends JFrame {
//    public static String path = "C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\Laba_GUI_maxim\\task_2";
//    private JTextField firstNameField;
//    private JTextField lastNameField;
//    private JTextField middleNameField;
//    private JTextField birthDateField;
//    private JTextField groupField;
//
//    public Task_2() {
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setTitle("User Form");
//        setSize(300, 250);
//        setLayout(new GridLayout(6, 2));
//
//        JLabel firstNameLabel = new JLabel("First Name:");
//        firstNameField = new JTextField();
//        JLabel lastNameLabel = new JLabel("Last Name:");
//        lastNameField = new JTextField();
//        JLabel middleNameLabel = new JLabel("Middle Name:");
//        middleNameField = new JTextField();
//        JLabel birthDateLabel = new JLabel("Birth Date:");
//        birthDateField = new JTextField();
//        JLabel groupLabel = new JLabel("Group:");
//        groupField = new JTextField();
//
//        JButton saveButton = new JButton("Save");
//        saveButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                saveDataToFile();
//            }
//        });
//
//        JButton loadButton = new JButton("Load");
//        loadButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                loadDataFromFile();
//            }
//        });
//
//        add(firstNameLabel);
//        add(firstNameField);
//        add(lastNameLabel);
//        add(lastNameField);
//        add(middleNameLabel);
//        add(middleNameField);
//        add(birthDateLabel);
//        add(birthDateField);
//        add(groupLabel);
//        add(groupField);
//        add(saveButton);
//        add(loadButton);
//    }
//
//    private void saveDataToFile() {
//        try {
//            FileWriter writer = new FileWriter(path);
//            writer.write(firstNameField.getText() + "\n");
//            writer.write(lastNameField.getText() + "\n");
//            writer.write(middleNameField.getText() + "\n");
//            writer.write(birthDateField.getText() + "\n");
//            writer.write(groupField.getText() + "\n");
//            writer.close();
//            JOptionPane.showMessageDialog(this, "Data saved successfully!");
//        } catch (IOException ex) {
//            ex.printStackTrace();
//            JOptionPane.showMessageDialog(this, "Error occurred while saving data!");
//        }
//    }
//
//    private void loadDataFromFile() {
//        try {
//            FileReader reader = new FileReader(path);
//            BufferedReader bufferedReader = new BufferedReader(reader);
//            firstNameField.setText(bufferedReader.readLine());
//            lastNameField.setText(bufferedReader.readLine());
//            middleNameField.setText(bufferedReader.readLine());
//            birthDateField.setText(bufferedReader.readLine());
//            groupField.setText(bufferedReader.readLine());
//            reader.close();
//            JOptionPane.showMessageDialog(this, "Data loaded successfully!");
//        } catch (IOException ex) {
//            ex.printStackTrace();
//            JOptionPane.showMessageDialog(this, "Error occurred while loading data!");
//        }
//    }
//
//    public static void main(String[] args) {
//        Task_2 userForm = new Task_2();
//        userForm.setVisible(true);
//    }
//}
