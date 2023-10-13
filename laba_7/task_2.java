import java.util.Scanner;

public class task_2 {
    private static boolean isValid(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!(c >= '0' && c <= '9') && !(c >= 'A' && c <= 'E')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число в 15-й системе счисления: ");
        String input = scanner.nextLine();

        while (!isValid(input)) {
            System.out.print("Неверный ввод. Пожалуйста, введите число в 15-й системе счисления: ");
            input = scanner.nextLine();
        }

        String output = convertTo5thNumeralSystem(input);

        System.out.println("Введите число в 5-й системе счисления:" + output);
    }

    private static String convertTo5thNumeralSystem(String input) {
        int num = Integer.parseInt(input, 15);
        return Integer.toString(num, 5);
    }

}