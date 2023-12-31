package laba_8;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Task_1 {
    private static boolean containsChar(char[] array, char ch) {
        for (char element : array) {
            if (element == ch) {
                return true;
            }
        }
        return false;
    }
    public static void print_massive(char[] massive){
        String stroka = "";
        for (int i = 0;i<massive.length;i++){
            stroka = stroka + Character.toString(massive[i]);
        }
        System.out.println(stroka);
    }
    public static void main(String[] args){
        String line;
        File file = new File("C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\task_1");

        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            line = "";
        }
        int len = line.split(",").length;
        char[] characters = new char[len];
        characters = line.toCharArray();
        boolean increasing_sequence = false;
        boolean decreasing_sequence = false;
        System.out.println("Исходный массив:");
        print_massive(characters);

        int digitCount = 0;
        for (char ch : characters) {
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
        int[] massive_number = new int[digitCount];
        System.out.println("Количество цифр: " + digitCount);
        int g = 0;
        for (char ch: characters) {
            if (Character.isDigit(ch)){
                massive_number[g] = ch - 48;
                g=g+1;
            }
        }
        for (int i=0;i<massive_number.length-3;i++){
            for (int k = i+1;k<massive_number.length -2 ; k++){
                for (int j=k+1;j<massive_number.length-1;j++){
                    if (massive_number[i] < massive_number[i+1]){
                        increasing_sequence = true;
                    }
                    if (massive_number[j] > massive_number[j+1]) {
                        decreasing_sequence = true;
                    }

                }
            }
        }


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ для поиска: ");
        char searchChar = scanner.nextLine().charAt(0);
        int searchCount = 0;
        for (char ch : characters) {
            if (ch == searchChar) {
                searchCount++;
            }
        }
        System.out.println("Количество символов поиска: " + searchCount);


        System.out.print("Введите номер для поиска: ");
        String searchNumber = scanner.nextLine();
        boolean allDigitsFound = true;
        for (char digit : searchNumber.toCharArray()) {
            if (!containsChar(characters, digit)) {
                allDigitsFound = false;
                break;
            }
        }
        System.out.println("Все найденные цифры: " + allDigitsFound);
        System.out.println("Возрастающая последовательность:" + increasing_sequence);
        System.out.println("Убывающая последовательность:" + decreasing_sequence);


        String brackets = "(){}[]";
        boolean closedPairsFound = false;
        for (int i = 0; i < characters.length - 1; i++) {
            String pair = "" + characters[i] + characters[i+1];
            if (brackets.contains(pair)) {
                if (pair.equals("()") || pair.equals("{}") || pair.equals("[]")) {
                    closedPairsFound = true;
                }
            }
        }
        System.out.println("Найдены замкнутые пары различных комбинаций скобок: " + closedPairsFound);


        String punctuation = ".,:;!?";
        boolean adjacentIdenticalFound = false;
        for (int i = 0; i < characters.length - 1; i++) {
            if (punctuation.contains("" + characters[i]) && punctuation.contains("" + characters[i+1])) {
                if (characters[i] == characters[i+1]) {
                    adjacentIdenticalFound = true;
                }
            }
        }
        System.out.println("Соседние идентичные символы, относящиеся к найденным знакам препинания: " + adjacentIdenticalFound);
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\task_1",true);
            writer.write("\n" +"Все найденные цифры: " + allDigitsFound + "\n");
            writer.write("Возрастающая последовательность:" + increasing_sequence+ "\n");
            writer.write("Убывающая последовательность:" + decreasing_sequence+ "\n");
            writer.write("Найдены замкнутые пары различных комбинаций скобок: " + closedPairsFound+ "\n");
            writer.write("Соседние идентичные символы, относящиеся к найденным знакам препинания: " + adjacentIdenticalFound+ "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
