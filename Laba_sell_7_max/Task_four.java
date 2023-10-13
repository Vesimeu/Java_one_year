package laba_7;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task_four {
    public static int convertDoubleToInt(double number) {
        char nums = String.valueOf(number).charAt(String.valueOf(number).length()-1);
        if (nums == '0') {
            return (int) number;
        } else {
            return -1; // если число не заканчивается на 0, вернуть -1
        }
    }
    public static void print_full_matrix(char[][] matrix){
        for (int i = 0;i<matrix.length;i++){
            for (int g = 0 ;g<matrix[1].length;g++){
                System.out.print(matrix[i][g]);
            }
            System.out.println("");
        }
    }
    public static void True_or_False_line(ArrayList<String> list){
        int args_one;
        int args_two;
        int args_three;
        int args_four;
        String sign;
        String left_str="";
        if (list.contains("+")){ //Если в выражении плюс
            sign = "+";
        }
        else{
            sign = "-";
        }
        for (int i=0;i<list.indexOf(sign);i++){ // поиск первого числа
            left_str = left_str + list.get(i);
        }
        args_one = Integer.parseInt(left_str);
        left_str = "";
        for (int i=list.indexOf("(")+1;i<list.indexOf("/");i++){ // поиск второго числа
            left_str = left_str + list.get(i);
        }
        args_two = Integer.parseInt(left_str);
        left_str = "";
        for (int i=list.indexOf("/")+1;i<list.indexOf(")");i++){ // find three number
            left_str = left_str + list.get(i);
        }
        args_three = Integer.parseInt(left_str);
        left_str = "";
        for (int i=list.indexOf("=")+1;i<list.size();i++){
            left_str = left_str + list.get(i);
        }
        args_four = Integer.parseInt(left_str);
        left_str = "";
        double answer;
        if (sign.equals("+")){
            answer = args_one + (args_two/args_three);
            System.out.println(convertDoubleToInt(answer));
            if (convertDoubleToInt(answer) != -1){
                if (args_four == convertDoubleToInt(answer)){
                    System.out.println("Выражение:" + args_one +"+" + "(" + args_two +"/" + args_three + ")" + "=" + args_four + " - Верное!");
                }
                else{
                    System.out.println("Выражение:" + args_one +"+" + "(" + args_two +"/" + args_three + ")" + "=" + args_four + " - НЕ верное!");
                    System.out.println("Вот исправленное выражение:" + args_one +"+" + "(" + args_two +"/" + args_three + ")" + "=" + answer);
                }
            }
        }
        if (sign.equals("-")){
            answer = args_one - (args_two/args_three);
            System.out.println(convertDoubleToInt(answer));
            if (convertDoubleToInt(answer) != -1){
                if (args_four == convertDoubleToInt(answer)){
                    System.out.println("Выражение:" + args_one +"-" + "(" + args_two +"/" + args_three + ")" + "=" + args_four + " - Верное!");
                }
                else{
                    System.out.println("Выражение:" + args_one +"-" + "(" + args_two +"/" + args_three + ")" + "=" + args_four + " - НЕ верное!");
                    System.out.println("Вот исправленное выражение:" + args_one +"-" + "(" + args_two +"/" + args_three + ")" + "=" + answer);
                }
            }
        }
    }
    public static void main(String[] args) {
        // задаем матрицу символов
        char[][] matrix = {
                {'2', '-', '(', '4', '/', '2', ')', '=', '1'},
                {'6', '+', '(', '4', '/', '2', ')', '=', '8'},
                {'3', '-', '(', '4', '/', '2', ')', '=', '3'},
                {'1', '+', '(', '4', '/', '2', ')', '=', '4'},
                {'7', '-', '(', '4', '/', '2', ')', '=', '5'},
                {'9', '-', '(', '4', '/', '2', ')', '=', '7'},
        };
        System.out.println("Исходная матрица:");
        print_full_matrix(matrix);

        // поиск выражений по строкам
        String left_int = "";
        ArrayList<String> False_line = new ArrayList<>();
        ArrayList<String> True_line = new ArrayList<>();
        int countCorrectRows = 0;
        Pattern pattern = Pattern.compile("\\d+\\s*[-+]\\s*\\(\\s*\\d+\\s*/\\s*\\d+\\s*\\)\\s*=\\s*\\d+"
        );
        for(int i = 0;i<matrix.length;i++){
            String stroka = "";
            for(int g =0;g<matrix[0].length;g++){
                stroka = stroka + matrix[i][g];
            }
            Matcher matcher = pattern.matcher(stroka);
            if (matcher.find()){
                for (int chars = 0;chars < stroka.length();chars++){
                    False_line.add(Character.toString(stroka.charAt(chars)));
                }
                True_or_False_line(False_line);
                False_line.clear();
            }
        }
        // поиск выражений по cтолбцам
        String stroka = "";
        for(int i = 0;i<matrix[0].length;i++){
            stroka = "";
            for (int g = 0;g<matrix.length;g++){
                stroka = stroka + matrix[g][i];
            }
            Matcher matcher = pattern.matcher(stroka);
            if (matcher.find()){
                for (int chars = 0;chars < stroka.length();chars++){
                    False_line.add(Character.toString(stroka.charAt(chars)));
                }
                True_or_False_line(False_line);
                False_line.clear();
            }
        }

    }
}
