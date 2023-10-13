package laba_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_12 {
    public static String path = "C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\Task_12";
    public static void main(String[] args) {
        int count = 0;
        try {
            BufferedReader file_1 = new BufferedReader(new FileReader(path));
            String line;
            while ((line = file_1.readLine()) != null){
                count++;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        String[] companyInfo = new String[count];
        int i = 0;
        try {
            BufferedReader file_2 = new BufferedReader(new FileReader(path));
            String lines;
            while ((lines = file_2.readLine()) != null){
                companyInfo[i++] = lines;
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        // Создаем регулярное выражение для поиска слов, требующих склонения
        Pattern pattern = Pattern.compile("\\b(сотрудник|цех|отдел)\\b");

        // Проходим по массиву строк и заменяем слова, требующие склонения
        try {
            FileWriter file = new FileWriter(path);
            for (String info : companyInfo) {
                Matcher matcher = pattern.matcher(info);
                if (matcher.find()) {
                    String word = matcher.group();
                    String newWord = getDeclension(word);
                    String newInfo = matcher.replaceAll(newWord);
                    file.write(newInfo+ "\n");
                }
                else {
                    file.write(info + "\n");
                }
            }
            file.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static String getDeclension(String word) {
        return word + "ов";
   }
}

