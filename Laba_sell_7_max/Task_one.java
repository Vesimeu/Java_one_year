package Laba_sell_7_max;
import java.util.Arrays;
public class Task_one {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', '1', '2', '3', 'd', 'e', 'f', '4', '5', '6'};

        for (int i = 0; i < array.length; i++) {
            if (Character.isDigit(array[i])) {
                array[i] = '!';
            }
        }

        System.out.println(Arrays.toString(array));
    }
}

