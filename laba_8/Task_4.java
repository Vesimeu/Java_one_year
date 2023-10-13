import java.io.*;

public class Task_4 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\task_4";
        String[] separators = {" ", "_", ".", ",", ";", ":", "\n", "\t", "!", "?"};

        try (BufferedReader lines = new BufferedReader(new FileReader(fileName))) {
            BufferedWriter file = new BufferedWriter(new FileWriter(fileName,true));
            String line;
            while ((line = lines.readLine()) != null) {
                String[] words = line.split("[\\s_.,;:\\n\\t!?]+");
                for (String word : words) {
                    System.out.println(word);
                    file.write(word + "\n");
                    if (word.matches("\\d+\\p{Alpha}+")) {
                        System.out.println(word);
                        file.write(word + "\n");
                    }
                }
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
