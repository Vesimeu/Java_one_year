package laba_7;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class task_12 {
    public static void main(String[] args) {
        String[] companyInfo = {
                "Количество сотрудник: 1000",
                "Количество цех: 10",
                "Количество отдел: 20",
                "Доход: 1000000 руб.",
                "Расход: 500000 руб.",
        };

        // Создаем регулярное выражение для поиска слов, требующих склонения
        Pattern pattern = Pattern.compile("\\b(сотрудник|цех|отдел)\\b");

        // Проходим по массиву строк и заменяем слова, требующие склонения
        for (String info : companyInfo) {
            Matcher matcher = pattern.matcher(info);
            if (matcher.find()) {
                String word = matcher.group();
                String newWord = getDeclension(word);
                String newInfo = matcher.replaceAll(newWord);
                System.out.println(info + " - Старый текст");
                System.out.println(newInfo +  " - Новый текст");
            }
        }
    }

    // Метод для получения правильного склонения слова в зависимости от числа
    // К сожалению у меня нет фантазии, чтобы сделать это красиво
    public static String getDeclension(String word) {
        return word + "ов";
    }
}
