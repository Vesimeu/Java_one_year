package laba_8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Task_11 {

    public static String path = "C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\Task_11";
    public static void write_massive_data(ArrayList<Double> list){
        try{
            BufferedWriter file = new BufferedWriter(new FileWriter(path,true));
            for (double value:list){
//                file.write(String.format("%." + 4 + "f",value) + " ");
                file.write(String.valueOf(value));
            }
            file.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void write_function() {
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter(path,true));
            String func = "z = Math.pow(Math.abs(Math.pow(x,2) - y , 1/3f)) * Math.sin(y) + 3*x - 4*y";
            String comment_func = "x ∈ [-7;-2] с шагом 0,1. y ∈ [-1;4] с шагом 0,2.";
            file.write(func + "\n");
            file.write(comment_func + "\n");
            file.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        write_function();
        try {
            BufferedWriter file_1 = new BufferedWriter(new FileWriter(path,true));
            double z;
            ArrayList<Double> list_x = new ArrayList<>();
            ArrayList<Double> list_y = new ArrayList<>();
            for (double x = -7.0; x <= -2.0; x = x + 0.1){
                for (double y = -1.0; y <= 4.0; y = y + 0.2){
                    z = Math.pow(Math.abs(Math.pow(x,2) - y) , 1/3f) * Math.sin(y) + 3*x - 4*y;
                    file_1.write(String.format("%." + 4 + "f",z) + " ");
                    list_y.add(y);
                    list_x.add(x);
                }
                file_1.write("\n");
            }
            Set<Double> unique_x = new HashSet<>(list_x);
            ArrayList<Double> list_unique_x = new ArrayList<>(unique_x);
            Set<Double> unique_y = new HashSet<>(list_y);
            ArrayList<Double> list_unique_y = new ArrayList<>(unique_y);
            file_1.write("Массив данных x:");
            for (Double value: list_unique_x){
                file_1.write(String.format("%." + 4 + "f",value) + " ");
            }
            file_1.newLine();
            file_1.write("Массив данных y:");
            for (Double value: list_unique_y){
                file_1.write(String.format("%." + 4 + "f",value) + " ");
            }
            file_1.close();


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
