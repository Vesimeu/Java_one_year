package Laba_sell_7_max;
import java.util.Arrays;
public class task_eleven {
    public static void main(String[] args) {
        String[] strings = {"  Hello, world!  ","  How are you?  ", "  I'm fine, thank you.  "};

        // Удаление пробелов в начале и конце строк
        String[] formatted1 = Arrays.stream(strings)
                .map(s -> s.trim())
                .toArray(String[]::new);
        System.out.println(Arrays.toString(formatted1));

        // Замена всех букв на заглавные
        String[] formatted2 = Arrays.stream(strings)
                .map(s -> s.toUpperCase())
                .toArray(String[]::new);
        System.out.println(Arrays.toString(formatted2));

        // Удаление знаков препинания
        String[] formatted3 = Arrays.stream(strings)
                .map(s -> s.replaceAll("\\p{Punct}", ""))
                .toArray(String[]::new);
        System.out.println(Arrays.toString(formatted3));
    }
}
