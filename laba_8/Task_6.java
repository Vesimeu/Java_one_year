package laba_8;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.FileReader;

public class Task_6 {
    private static boolean check(String[] arr, String toCheckValue)
    {
        for (String element : arr) {
            if (element.equals(toCheckValue)) {
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args){
        String line;
        Map<String, ArrayList<City>> information = new HashMap<>();
        String[] massive_month = {"январь","февраль","март"};
        try {
            String filename1 = "C:\\Users\\Пётр\\IdeaProjects\\Function\\src\\laba_8\\task_6";
            BufferedReader reader1 = new BufferedReader(new FileReader(filename1));
            while ((line = reader1.readLine()) != null){
                String[] info = line.split(" ");
                String name_city = info[0];
                String month = info[1];
                int temperature = Integer.parseInt(info[2]);
                int rainfall = Integer.parseInt(info[3]);
                ArrayList<City> New_city = information.get(name_city); // null

                City city = new City(month,temperature,rainfall);
                try{
                    New_city = information.get(info[0]);
                    New_city.add(city);
                    information.put(info[0],New_city);
                } catch (Exception exception){
                    New_city = new ArrayList<City>();
                    New_city.add(city);
                    information.put(info[0],New_city);
                }

            }
            for (String name_city:information.keySet()){ //Пробегаемся по городам
//                System.out.println("Город:" + name_city + " Значение:" + information.get(name_city));
                ArrayList<City> list = information.get(name_city);
                int count = 0;
                int temperature = 0;
                int rainfall = 0;
                for (int i = 0;i<list.size();i++){ //Пробегаемся по инофрмации о городах
                    if (check(massive_month,list.get(i).toString().split(" ")[0])){ //проверка на нужные месяца
                        temperature = temperature + Integer.parseInt(list.get(i).toString().split(" ")[1]);
                        rainfall = rainfall + Integer.parseInt(list.get(i).toString().split(" ")[2]);
                        count = count + 1;
                    }

                }
                double mid_temp = temperature / count;
                double mid_rainfall = rainfall/count;
                System.out.println("Город:" + name_city + " || средняя темература: " + mid_temp + " || среднее кол-во осадков " + mid_rainfall );
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
class City{
    public String toString() {
        return name + " " + temperature + " " + rainfall;
    }
    public City(String Name, int temp, int rain) {
        this.name = Name;
        this.temperature = temp;
        this.rainfall = rain;
    }
    String name;
    int temperature;
    int rainfall;

    public void setName(String name) {
        this.name = name;
    }
}