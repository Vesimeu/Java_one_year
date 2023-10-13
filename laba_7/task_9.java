import java.util.Scanner;

public class task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст с комментариями:");

        String text = scanner.nextLine();
        String withoutComments = removeComments(text);

        if (text.equals(withoutComments)) {
            System.out.println("Нет комментариев в тексте.");
        } else {
            System.out.println("Есть контакт!Вот текст без комментариев:");
            System.out.println(withoutComments);
        }
    }

    private static String removeComments(String text) {
        String withoutStarComments = text.replaceAll("\\*[^*]*\\*", ""); // удаление комментариев вида *...*
        String withoutTildeComments = withoutStarComments.replaceAll("~.*?~", ""); // удаление комментариев вида ~...~
        String withoutMixedComments = withoutTildeComments.replaceAll("\\*.*?~", ""); // удаление комментариев вида *...~

        return withoutMixedComments;
    }
}
