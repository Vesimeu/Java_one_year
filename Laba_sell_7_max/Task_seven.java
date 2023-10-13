package Laba_sell_7_max;
import java.util.HashMap;
import java.util.Map;

public class Task_seven {
    public static void main(String[] args) {
        String str = "Hello, world!";
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                charMap.put(c, charMap.getOrDefault(c, 0) + 1);
            }
        }
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }
        System.out.println("Number of distinct characters: " + charMap.size());
        System.out.println("Resulting string: " + result.toString());
    }
}
