import javax.swing.*;

public class Task_Func_Interface extends JFrame {
    private JTextField inputField1;
    private JTextField inputField2;
    private JTextField inputField3;
    private JTextField inputField4;
    private JButton calculateButton;

    public Task_Func_Interface() {
        setTitle("Посчитать значение функции f(x)");
        setSize(300, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        add(panel);

        JLabel label1 = new JLabel("Введите значение x:");
        panel.add(label1);

        inputField1 = new JTextField(10);
        panel.add(inputField1);

        JLabel label2 = new JLabel("Введите значение b:");
        panel.add(label2);

        inputField2 = new JTextField(10);
        panel.add(inputField2);

        JLabel label3 = new JLabel("Введите значение c:");
        panel.add(label3);

        inputField3 = new JTextField(10);
        panel.add(inputField3);

        JLabel label4 = new JLabel("Введите значение a:");
        panel.add(label4);

        inputField4 = new JTextField(10);
        panel.add(inputField4);

        calculateButton = new JButton("Вычислить");
        panel.add(calculateButton);

        calculateButton.addActionListener(e -> {
            double x = Double.parseDouble(inputField1.getText());
            double b = Double.parseDouble(inputField2.getText());
            double c = Double.parseDouble(inputField3.getText());
            double a = Double.parseDouble(inputField3.getText());
            double result = calculate(x,b,c,a);

            String message = String.format("При x =  %f , b = %f , c = %f , a = %f. Ответ = %f", x, b, c,a, result);
            JOptionPane.showMessageDialog(this, message,"Результат = )",JOptionPane.INFORMATION_MESSAGE);
        });
    }

    private double calculate(double x, double b,double c,double a) {
        return Math.pow(x,a) + Math.pow(b*x,1/3f)/(c*x+a);
    }

    public static void main(String[] args) {
        Task_Func_Interface calculator = new Task_Func_Interface();
        calculator.setVisible(true);
    }
}
