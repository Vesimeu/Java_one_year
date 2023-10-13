package laba_7;

public class task_10 {
    public static final int number_data = 6;


    public static void find_tigr(String massive[][]){
        int count_zoo = 0;
        for (int i=0;i<massive.length;i++){
            double count_animal = Double.parseDouble(massive[i][4]);
            double count_worker = Double.parseDouble(massive[i][5]);
            double kof = (count_worker/count_animal);
            if (kof == 0.06){
                count_zoo = count_zoo+1;
            }
            if (massive[i][1].equals("уссурийский тигр")){
                System.out.println("Данные о зоопарках с тигром:");
                for (int g = 0;g<number_data;g++){
                    System.out.println(massive[i][g]);
                }
            }
        }
        System.out.print("Колиество зоопарков где на каждого животного 0,06 рабочих:" + count_zoo);
    }

    public static void main(String[] args){
        String text = "Европа;уссурийский тигр;2;Адрес там какой-то;100;6.Добрянка;уссурийский слон;4;Адрес там какой-то;12;4";
        System.out.println("Исходные данные:");
        System.out.println(text);
        String object ;
        int count_zoo = text.split("\\.").length;
        int i = -1;
        int g;
        String massive[][] = new String[count_zoo][number_data];
        for (String line: text.split("\\.")){ //Разделяет объекты
            g = 0;
            i = i+1;
            for (String data : line.split(";")){ //Разделяет данные объекта
                massive[i][g] = data;
                g=g+1;
            }
        }
        find_tigr(massive);
    }
}
