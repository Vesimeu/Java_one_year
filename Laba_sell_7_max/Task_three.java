package Laba_sell_7_max;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
public class Task_three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите массив символов: ");
        String input = scanner.nextLine();
        char[] characters = input.toCharArray();

        int russianLowerCaseCount = 0;
        for (int i = 0; i < characters.length; i++) {
            if (Character.isLowerCase(characters[i]) && Character.UnicodeBlock.of(characters[i]) == Character.UnicodeBlock.CYRILLIC) {
                russianLowerCaseCount++;
            }
        }
        System.out.println("Количество прописных букв русского языка: " + russianLowerCaseCount);

        System.out.print("Введите знак препинания для поиска: ");
        char punctuationChar = scanner.nextLine().charAt(0);
        boolean containsPunctuationChar = false;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == punctuationChar) {
                containsPunctuationChar = true;
                break;
            }
        }
        System.out.println("Знак препинания " + (containsPunctuationChar ? "" : "не ") + "входит в последовательность");

        System.out.print("Введите слово для поиска: ");
        String word = scanner.nextLine();
        boolean containsTwoWordCharacters = false;
        for (int i = 0; i < characters.length - 1; i++) {
            if (characters[i] == word.charAt(0) && characters[i + 1] == word.charAt(1)) {
                containsTwoWordCharacters = true;
                break;
            }
        }
        System.out.println("Символы \"" + word.charAt(0) + "\" и \"" + word.charAt(1) + "\" " + (containsTwoWordCharacters ? "" : "не ") + "входят в последовательность");

        boolean containsToOrOt = false;
        for (int i = 0; i < characters.length - 1; i++) {
            if ((characters[i] == 'т' && characters[i + 1] == 'о') || (characters[i] == 'о' && characters[i + 1] == 'т')) {
                containsToOrOt = true;
                break;
            }
        }
        System.out.println("Пара соседних букв \"то\" или \"от\" " + (containsToOrOt ? "" : "не ") + "имеется в последовательности");

        // Поиск трех подряд идущих одинаковых символов
        boolean containsThreeInARow = false;
        for (int i = 0; i < characters.length - 2; i++) {
            if (characters[i] == characters[i + 1] && characters[i + 1] == characters[i + 2]) {
                containsThreeInARow = true;
            }
        }
        if (containsThreeInARow == true){
            System.out.println("Три подряд идущих одинаковых символа имеются");
        }
        else{
            System.out.println("Три подряд идущих одинаковых символа не найдены");
        }
        // Проверка
        boolean one_condition = false;
        boolean two_conditon = false;
        for (int j = characters.length / 2 + 1;j<characters.length-1;j++) {
            for (int i = characters.length / 2; i < j; i++) {
                if (Character.isDigit(characters[i]) && Character.isDigit(characters[i+1])){
                    if (Math.abs(characters[i]) == Math.abs(characters[i+1])){
                        one_condition = true;
                    }
                }
                if (!Character.isDigit(characters[j]) && !Character.isDigit(characters[j+1])) {
                    if (Character.toString(characters[j]).equals(Character.toString(characters[j + 1]))) {
                        two_conditon = true;
                    }
                }
            }
        }
        if (one_condition == true){
            System.out.println("Цифры s^i и s^i+1 равны по модулю!");
        }
        else{
            System.out.println("Условие s^i и s^i+1 цифры и равны по модулю не выполнено!");
        }
        if (two_conditon == true){
            System.out.println("s^j и s^j+1 - это одинаковые буквы!");
        }
        else{
            System.out.println("s^j и s^j+1 - это не одинаковые буквы!");
        }
    }
}
