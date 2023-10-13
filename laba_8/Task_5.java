//import java.io.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class Task_5 {
//    public static void main(String[] args) {
//        String filename1 = "C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\task_5_1";
//        String filename2 = "C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\task_5_2";
//
//        try {
//            BufferedReader reader1 = new BufferedReader(new FileReader(filename1));
//            BufferedReader reader2 = new BufferedReader(new FileReader(filename2));
//            BufferedWriter writer2 = new BufferedWriter(new FileWriter(filename2, true));
//            String line;
//            String regex_rus = "[а-яёА-ЯЁ]+";
//            String regex_eng = "[a-zA-Z]+\\.?";
//            Pattern pattern_rus = Pattern.compile(regex_rus);
//            Pattern pattern_eng = Pattern.compile(regex_eng);
//
//            // Флаг для отслеживания, включены ли все буквы алфавита в предложении
//            boolean hasAllLetters = true;
//            boolean hasAllLetterRus = true;
//
//            // Алфавит
//            String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя,?";
//
//            while ((line = reader1.readLine()) != null) {
//                Matcher m_rus = pattern_rus.matcher(line);
//                Matcher m_eng = pattern_eng.matcher(line);
//                hasAllLetterRus = false;
//                if (m_eng.find()){
//                    hasAllLetters = false;
//                }
//                else {
//                    if (m_rus.find()){
//                        hasAllLetterRus = true;
//                    }
//                }
//
//                // Если предложение содержит все буквы алфавита, добавляем его во второй файл
//                if (hasAllLetters&&hasAllLetterRus) {
//                    writer2.newLine();
//                    writer2.write(line);
//                }
//
//                // Сбрасываем флаг
//                hasAllLetters = true;
//            }
//
//            // Закрываем все потоки
//            reader1.close();
//            reader2.close();
//            writer2.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
