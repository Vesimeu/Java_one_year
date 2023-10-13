package Laba_sell_7_max;
import java.util.ArrayList;
public class task_ten {
    public static void main(String[] args) {
        String text = "Баскетболист: Иванов; Иван; Иванович; М; Русский; 210; 100; 1985, 05, 15; +79001234567; КСК; 7; Центровой; 200; 25."
                + " Баскетболист: Петров; Петр; Петрович; М; Украинец; 220; 95; 1990, 12, 25; +79001112233; КСК; 10; Форвард; 180; 30."
                + " Баскетболист: Сидорова; Елена; Ивановна; Ж; Русская; 200; 110; 1995, 03, 01; +79003334455; ДКС; 13; Центровой; 250; 30."
                + " Баскетболист: Кузнецова; Анна; Сергеевна; Ж; Русская; 195; 85; 1998, 11, 11; +79007778899; КСК; 3; Защитник; 120н; 20."
                + " Баскетболист: Смирнов; Александр; Владимирович; М; Русский; 205; 100; 1993, 07, 07; +79005556677; КСК; 5; Форвард; 180; 30.";

        // разбиение текста на массив объектов
        String[] objects = text.split("\\.");

        // создание списка для хранения подходящих игроков
        ArrayList<String> suitablePlayers = new ArrayList<String>();

        // перебор всех объектов и подсчет количества подходящих игроков
        int count = 0;
        for (String object : objects) {
            String[] data = object.split(";");
            int height = Integer.parseInt(data[5].trim());
            int weight = Integer.parseInt(data[6].trim());
            int points = Integer.parseInt(data[12].trim());
            if (height >= 200 && height <= 220 && weight >= 90 && weight <= 110) {
                count++;
            }
            if (points > 150) {
                suitablePlayers.add(object);
            }
        }

        // вывод результатов
        System.out.println("Количество игроков с ростом от 200 до 220 см и весом от 90 до 110 кг: " + count);
        System.out.println("Информация о баскетболистах, которые забросили за свою команду больше 150 очков:");
        for (String player : suitablePlayers) {
            System.out.println(player);
        }
    }

}
