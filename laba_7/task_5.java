package laba_7;
import java.util.regex.*;
import  java.lang.*;
public class task_5 {
    public static void main(String[] args){
        String text = "ThrEe piLLars, a birCh tree, 10 slabs, is That it?";
        System.out.println("Исходный текст:");
        System.out.println(text);
        String[] text_input = text.split(" ");
        String[] text_output = new String[text_input.length];
        text = "";
        String regEx = "[A-Z]\\w*";
        for (String line:text_input){
            Pattern word = Pattern.compile(regEx);
            Matcher wordMatcher = word.matcher(line);
            if (wordMatcher.find() == true){
                System.out.println("Слово с большой буквой:" + line);
                if (Character.isUpperCase(line.charAt(0))){
                    text = text + (line.charAt(0) + (line.substring(1,line.length()).toLowerCase()) + " ");
                }
                else{
                    text = text + line.toLowerCase() + " " ;
                }
            }
            else{
                text = text + line + " " ;
            }
        }
        System.out.println(text);


    }
}
