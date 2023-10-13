package Laba_sell_7_max;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class task_twelve {
    public static void main(String[] args) {
        // исходный массив строк
        String[] months = {"январь - 20 учеников, 15 двойок",
                "февраль - 18 учеников, 13 двойок",
                "март - 22 ученика, 10 двойок",
                "апрель - 23 ученика, 9 двоек",
                "май - 24 ученика, 6 двойок",
                "июнь - 21 ученик, 8 двоек",
                "июль - 19 учеников, 11 двойк",
                "август - 25 учеников, 7 двоек",
            };

        // регулярные выражения для автозамены
        String[][] regexps = {{"(\\d+) \\ученик\\b", "$1 ученика"}, // склонение "ученик"
                {"(\\d+) дво(йк|ек|йки|йок)", "$1 двоек"}, // склонение "двойка"
                {"(\\d+) два", "$1 двое"}}; // склонение "два"

        // цикл по массиву строк
        for (int i = 0; i < months.length; i++) {
            // исходная строка
            String original = months[i];
            // измененная строка после автозамены
            String corrected = original;
            // цикл по регулярным выражениям
            for (String[] regexp : regexps) {
                // замена с использованием регулярного выражения
                corrected = corrected.replaceAll(regexp[0], regexp[1]);
            }
            // вывод исходной и измененной строки
            System.out.println(original);
            System.out.println(corrected);
        }
    }
}
