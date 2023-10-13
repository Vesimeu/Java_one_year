package Laba_11;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;

public class FunctionGraph {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Введите диапазон",
                "Окошко для ввода диапазона", JOptionPane.INFORMATION_MESSAGE);
        String[] range = input.split(",");
        double from = Double.parseDouble(range[0]);
        double to = Double.parseDouble(range[1]);
        if (from < to) {

            XYSeries series = new XYSeries("Функция");
            for (double x = from; x <= to; x += 0.1) {
                double y = calculateFunction(x); // значение y
                series.add(x, y);
            }
            XYDataset dataset = new XYSeriesCollection(series);

            // Создание объекта графика
            JFreeChart chart = ChartFactory.createXYLineChart(
                    "График функции", // Заголовок графика
                    "X", // Метка оси X
                    "Y", // Метка оси Y
                    dataset, // Набор данных для графика
                    PlotOrientation.VERTICAL, // Ориентация графика (вертикальная)
                    true, // Легенда
                    true, // Подсказки
                    false // URL-ссылки
            );

            // Создание окна с графиком
            ChartFrame frame = new ChartFrame("График функции", chart);
            frame.pack();
            frame.setVisible(true);
        }
        else {
            System.out.println("НЕ НАДО ТАК");
        }
    }

    // Функция для расчета значения функции
    private static double calculateFunction(double x) {
        // Здесь надо не забыть функцию вставить
        return x*Math.cos(x)*Math.pow(Math.sin(x),2)+6;
    }
}
