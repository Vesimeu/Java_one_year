package laba_7;
import java.util.Arrays;
public class task_11 {
    public static void print_massive(String[] massive){
        String text = "";
        for (int i = 0;i<massive.length;i++){
            text = text + massive[i] + "|";
        }
        System.out.println(text);
    }
    public static void main(String[] args) {
        String[] strings = {"apple123", "orange456", "banana789", "grape12"};
        print_massive(strings);

        // пример 1: замена всех цифр на знак "-"
        String[] formattedStrings1 = formatStrings(strings, "\\d", "-");
        System.out.println(Arrays.toString(formattedStrings1));

        // пример 2: добавление символа "*" после каждой буквы
        String[] formattedStrings2 = formatStrings(strings, "[a-zA-Z]", "*$0");
        System.out.println(Arrays.toString(formattedStrings2));

        // пример 3: удаление всех гласных букв
        String[] formattedStrings3 = formatStrings(strings, "[aeiouAEIOU]", "");
        System.out.println(Arrays.toString(formattedStrings3));
    }

    public static String[] formatStrings(String[] strings, String regex, String replacement) {
        String[] formattedStrings = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            formattedStrings[i] = strings[i].replaceAll(regex, replacement);
        }
        return formattedStrings;
    }
}
