import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomNumberGenerator extends JFrame {
    private JPanel panel;
    private JTextField[] textFields;

    public RandomNumberGenerator() {
        setTitle("Random Number Generator version 3.3 ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        add(panel, BorderLayout.CENTER);

        JButton generateButton = new JButton("Да прибудит с нами цифры!");
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateRandomNumbers();
            }
        });
        add(generateButton, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    private void generateRandomNumbers() {
        Random random = new Random();

        if (textFields != null) {
            for (JTextField textField : textFields) {
                int randomNumber = random.nextInt(100);
                textField.setText(String.valueOf(randomNumber));
            }
        } else {
            textFields = new JTextField[7];
            for (int i = 0; i < 7; i++) {
                JTextField textField = new JTextField(10);
                textField.setEditable(false);
                int randomNumber = random.nextInt(100);
                textField.setText(String.valueOf(randomNumber));
                panel.add(textField);
                textFields[i] = textField;
            }
            pack();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RandomNumberGenerator();
            }
        });
    }
}
