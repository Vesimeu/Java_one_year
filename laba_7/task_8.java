package laba_7;

public class task_8 {
    public static void main(String[] args){
        String text = "Hello wo!ld, my name i! @rody!!";
        System.out.println("INPUT TEXT:");
        System.out.println(text);
        for (int i = 0;i<text.length();i++){
            if (text.charAt(i) == '!'){
                text = text.replace(text.charAt(i) , 'a');
            }
            if (text.charAt(i) == '@'){
                text = text.replace(text.charAt(i) , 'b');
            }
            if (text.charAt(i) == '#'){
                text = text.replace(text.charAt(i) , 'a');
            }
            if (text.charAt(i) == '$'){
                text = text.replace(text.charAt(i) , 'd');
            }
            if (text.charAt(i) == '%'){
                text = text.replace(text.charAt(i) , 'e');
            }
            if (text.charAt(i) == '^'){
                text = text.replace(text.charAt(i) , 'g');
            }
        }
        System.out.println(text);
    }
}
