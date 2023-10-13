package laba_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task_3 {
    public static void main(String[] args){
        String word = " ";
        try (FileReader file = new FileReader("C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\task_3")){
            BufferedReader in = new BufferedReader(file);
            word = in.readLine();

        for (String line:word.split(" ")) {
            char[] Syblols = line.toCharArray();
            for (int i = 0; i < Syblols.length - 1; i++) {
                if (Math.abs(Character.getNumericValue(Syblols[i]) - Character.getNumericValue(Syblols[i + 1])) == 1) {

                }
            }
        }
        }
        catch (IOException e){
            System.out.println("opana, chto-to ne tak ((");
            e.printStackTrace();
        }
    }
}
