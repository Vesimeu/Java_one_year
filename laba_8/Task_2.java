package laba_8;
import java.io.FileWriter;
import java.io.IOException;

public class Task_2 {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\task_2",true);
            int[] pif = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            for (int q : pif) {
                for (int w : pif) {
                    file.write(q + " x " + w + " = " + q * w + " \t" + "\t");
                }
                file.write("\n");
            }
            file.close();
        }
        catch (IOException e){
            System.out.println("opa-na.");
            e.printStackTrace();
        }
    }
}
