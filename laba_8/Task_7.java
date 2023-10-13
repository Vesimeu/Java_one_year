package laba_8;

import java.io.*;

public class Task_7 {
    public static void main(String[] args) {
        String line = "x";
        boolean name_func_1 = true;
        boolean name_func_2 = true;
        try (BufferedWriter file = new BufferedWriter(new FileWriter("C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\task_7",true))) {
            float x = -3;
            while (x != 3.5) {
                if (x >= 0) {
                    if (name_func_1){
                        file.write("Func1 = Math.sin(x) * Math.cos(x) || x >= 0" + "\n");
                        name_func_1 = false;
                    }
                    double f = Math.sin(x) * Math.cos(x);
                    System.out.println("x = " + x + " f = " + f);
                    line = "x = " + x + " f = " + f;
                    file.write(line + "\n");
                } else {
                    if (name_func_2){
                        file.write("Func2 = Math.sin(x) + Math.cos(x) || x < 0" + "\n");
                        name_func_2 = false;
                    }
                    double f1 = Math.sin(x) + Math.cos(x);
                    System.out.println("x = " + x + " f = " + f1);
                    line = "x = " + x + " f = " + f1;
                    file.write(line + "\n");
                }
                x = x + 0.5f;
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}