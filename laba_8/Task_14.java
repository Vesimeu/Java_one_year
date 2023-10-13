package laba_8;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task_14 {

    private static List<Double> getColumnValues(String filename, int columnIndex) {
        List<Double> columnValues = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean foundColumn = false;

            while ((line = reader.readLine()) != null) { //скипаем лишние
                if (line.startsWith("    NODE")) {
                    foundColumn = true;
                    continue;
                }

                if (foundColumn && line.trim().isEmpty()) {
                    break;
                }

                if (foundColumn) {
                    String[] values = line.trim().split("\\s+");
                    if (values.length > columnIndex) {
                        String sanitizedValue = values[columnIndex].replaceAll("[^\\d.E-]", "");
                        double value = Double.parseDouble(sanitizedValue);
                        columnValues.add(value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return columnValues;
    }

    private static double findMinValue(List<Double> values) {
        double min = Double.MAX_VALUE;
        for (double value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    private static double findMaxValue(List<Double> values) {
        double max = Double.MIN_VALUE;
        for (double value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private static double findAverage(List<Double> values) {
        double sum = 0.0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.size();
    }

    public static void main(String[] args) {
        String filename = "C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\Variant_4,14.txt"; // Имя файла с результатами исследования
        List<Double> columnValues = getColumnValues(filename, 2); // Передаем индекс столбца, с которым хотим работать (например, 2 для EPTOX)
 try{
     BufferedWriter file = new BufferedWriter(new FileWriter(filename,true));
        if (!columnValues.isEmpty()) {
            double min = findMinValue(columnValues);
            double max = findMaxValue(columnValues);
            double average = findAverage(columnValues);

            System.out.println("Минимальное значение: " + min);
            System.out.println("Максимальное значение: " + max);
            System.out.println("Среднее значение: " + average);
            file.newLine();
            file.write("Минимальное значение: " + min + "\n");
            file.write("Максимальное значение: " + max + "\n");
            file.write("Среднее значение: " + average + "\n");

            System.out.println("Отклонение от среднего значения:");
            file.write("Отклонение от среднего значения:" + "\n");
            for (double value : columnValues) {
                double deviation = value - average;
                System.out.println(deviation);
                file.write(String.valueOf(deviation) + " ");
            }
            file.newLine();
        }
        file.close();
        }
 catch (Exception e){
     e.printStackTrace();
 }
    }
}