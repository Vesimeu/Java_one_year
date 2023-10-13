package Laba_sell_7_max;
import java.util.HashMap;
import java.util.Scanner;
public class Task_five {
    public static void main(String[] args) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        String[] words = text.split("\\s+");
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
            if (word.length() > 0) {
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }
        }
        System.out.println("Слова в тексте и количество их повторений:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}
