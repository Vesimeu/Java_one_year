package Laba_sell_7_max;
import java.util.Scanner;
public class Task_two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] binaryNumber = new char[0];
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Введите двоичное число: ");
            String input = scanner.nextLine();
            binaryNumber = input.toCharArray();

            boolean invalidInput = false;
            for (int i = 0; i < binaryNumber.length; i++) {
                if (binaryNumber[i] != '0' && binaryNumber[i] != '1') {
                    invalidInput = true;
                    break;
                }
            }

            if (invalidInput) {
                System.out.println("Ошибка ввода. Введите только символы '0' и '1'.");
            } else {
                validInput = true;
            }
        }

        StringBuilder octalNumberBuilder = new StringBuilder();
        int decimalNumber = Integer.parseInt(new String(binaryNumber), 2);
        while (decimalNumber != 0) {
            int remainder = decimalNumber % 8;
            octalNumberBuilder.insert(0, remainder);
            decimalNumber /= 8;
        }
        char[] octalNumber = octalNumberBuilder.toString().toCharArray();

        // Выводим восьмеричное число
        System.out.print("Восьмеричное число: ");
        for (int i = 0; i < octalNumber.length; i++) {
            System.out.print(octalNumber[i]);
        }
    }
}
