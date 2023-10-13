package Laba_GUI_maxim;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task_3 extends JFrame {
    private JTextField startField;

    public Task_3() {
        setTitle("График функции");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        // Создание компонентов GUI
        JLabel startLabel = new JLabel("Введите диапазон(Например 1,6):");
        startField = new JTextField(10);;
        JButton plotButton = new JButton("Построить график");

        // Расположение компонентов в окне
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(startLabel);
        inputPanel.add(startField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(plotButton);

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        // Обработчик нажатия кнопки
        plotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] coords = new String[2];
                coords = startField.getText().split(",");

                double start = Double.parseDouble(coords[0]);
                double end = Double.parseDouble(coords[1]);
                plotGraph(start, end);
            }
        });
    }

    private void plotGraph(double start, double end) {
        // Создание и заполнение данных для графика
        XYSeries series = new XYSeries("Функция");
        double step = 0.1; // Шаг для построения графика
        for (double x = start; x <= end; x += step) {
            double y = Math.log10(Math.abs(x)) + Math.tan(Math.pow(x,2)); // funcitonbly
            series.add(x, y);
        }

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        // Создание графика
        JFreeChart chart = ChartFactory.createXYLineChart(
                "График функции", // Заголовок графика
                "X", // Ось X
                "Y", // Ось Y
                dataset, // Данные для графика
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        // Отображение графика
        ChartFrame frame = new ChartFrame("График функции", chart);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Task_3().setVisible(true);
            }
        });
    }
}
