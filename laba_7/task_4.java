package laba_7;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class task_4 {
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
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
        int args_tg;
        int args_two;
        int args_three;
        String left_str="";
        for (int i = list.indexOf("g")+1;i<list.indexOf("-");i++){ // Поиск аргумента tg
            left_str = left_str + list.get(i);
        }
        args_tg = Integer.parseInt(left_str);
        left_str="";
        for (int i = list.indexOf("-")+1;i<list.indexOf("=");i++){
            left_str=left_str + list.get(i);
        }
        args_two = Integer.parseInt(left_str);
        left_str="";
        for (int i = list.indexOf("=")+1;i<list.size();i++){
            left_str=left_str + list.get(i);
        }
        args_three=Integer.parseInt(left_str);
        if (Math.tan(args_tg) - args_two == args_three){
            System.out.println("Это верно!");
        }

        else {
            double answer = Math.tan(args_tg) - args_two;
            System.out.println("Это не верно, вот переделанная строка:");
            list.set(list.indexOf("=")+1,String.valueOf(answer));
            System.out.println(list);

        }
    }
    public static void main(String[] args) {
        // задаем матрицу символов
        char[][] matrix = {
                {'t', 'g', '3', '4', '-', '1', '=', 't'},
                {'5', '6', 't', 'g', '2', '4', '-', 'g'},
                {'7', '8', '1', '2', '3', '4', '5', '3'},
                {'-', '3', '2', 't', 'g', '6', '7', '-'},
                {'4', 't', 'g', '2', '-', '1', '=', '0'},
                {'6', '7', '8', '9', '-', '3', 't', '='},
                {'t', 'g', '-', '-', '2', '=', '7', '2'},
        };
        System.out.println("Исходная матрица:");
        print_full_matrix(matrix);

        // поиск выражений по строкам
        String left_int = "";
        ArrayList<String> False_line = new ArrayList<>();
        ArrayList<String> True_line = new ArrayList<>();
        int countCorrectRows = 0;
        Pattern pattern = Pattern.compile("tg\\d+-\\d+\\=\\d+");
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
