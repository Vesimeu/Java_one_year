package Laba_sell_7_max;
import java.util.regex.*;

public class task_nine {
    public static void main(String[] args) {
        String text = "Это пример {текста}, содержащего [комментарии]. " +
                "Надо удалить все комментарии. (Включая скобки).";

        // Шаблон для поиска всех комментариев
        Pattern pattern = Pattern.compile("\\([^\\(\\)]*\\)|\\{[^\\{\\}]*\\}|\\[[^\\[\\]]*\\]");
        Matcher matcher = pattern.matcher(text);

        // Удаляем все комментарии
        String result = matcher.replaceAll("");

        if (result.isEmpty()) {
            System.out.println("Текст не содержит комментариев.");
        } else {
            System.out.println(result);
        }
    }
}
