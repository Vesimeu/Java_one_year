package laba_7;

public class task_7 {
    public static void main(String[] args) {
        String inputString = "Hello!!! How are you doing today?!";
        System.out.println("Исходный текст:");
        System.out.println(inputString);
        int exclamationCount = 0;
        StringBuilder outputString = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '!') {
                exclamationCount++;
                outputString.append(exclamationCount);
            } else {
                outputString.append(inputString.charAt(i));
            }
        }

        System.out.println(outputString);
    }
}
