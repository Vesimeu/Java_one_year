package laba_7;
import java.util.ArrayList;
import java.util.Scanner;

public class task_6 {
    public static final int criteria = 13;
    public static void print_option(int i){
        if (i == 0){
            System.out.println("район города:");
        }
        if (i == 1){
            System.out.println("Номер/Название школы:");
        }
        if (i == 2){
            System.out.println("тип школы:");
        }
        if (i == 3){
            System.out.println("число работников:");
        }
        if (i == 4){
            System.out.println("количетсво кандидатов наук:");
        }
        if (i == 5){
            System.out.println("количество докторов наук:");
        }
        if (i == 6){
            System.out.println("количество учителей со званием 'заслужанный учитель':");
        }
        if (i == 7){
            System.out.println("число обучающихся:");
        }
        if (i == 8){
            System.out.println("количество классов:");
        }
        if (i == 9){
            System.out.println("колиество аудиторий:");
        }
        if (i == 10){
            System.out.println("количество компьютерных классов:");
        }
        if (i == 11){
            System.out.println("количество спортивных залов:");
        }
        if (i == 12){
            System.out.println("общую стоимость оборудование школы:");
        }

    }
    public static void enter_reglam(int count_school){
        Scanner scanner = new Scanner(System.in);
        String inform;
        System.out.println("Регламентированный ввод");
        String[][] massive = new String[criteria][count_school];
        for (int i = 0;i<count_school;i++){
            System.out.println("Вы вводите информацию о "+ (i+1) + " школе!");
            for (int g=0;g<criteria;g++){
                System.out.print("Введите ");
                print_option(g);
                inform = scanner.nextLine();
                massive[g][i] = inform;
            }
        }
        information_about_the_shool(massive);
    }
    public static void enter_not_reglam(int count_school){
        System.out.println("Нерегламентированный ввод");
        Scanner scanner = new Scanner(System.in);
        String inform;
        String[][] massive = new String[criteria][count_school];
        ArrayList<Integer> massive_exception = new ArrayList<Integer>();
        int crit;
        int count = count_school * criteria;
        System.out.println("Вам нужно ввести номер критерия, который хотите ввести!");
        for (int b = 0;b<criteria;b++){
            System.out.print(b+1 + ")");
            print_option(b);
        }
        for (int i = 0;i<count_school;i++){
            System.out.println("Вы вводите информацию о "+ (i+1) + " школе!");
            while (count != 0){
                System.out.println("Введите номер критерия:");
                crit = scanner.nextInt()-1;
                if (!massive_exception.contains(crit)) {
                    massive_exception.add(crit);
                    System.out.print("Введите ");
                    print_option(crit);
                    inform = scanner.next();
                    massive[crit][i] = inform;
                    count = count - 1;
                }
                else{
                    System.out.println("Вы ввелите критерий который ранее заполнили!");
                }
            }
        }
        information_about_the_shool(massive);
    }
    public static void information_about_the_shool(String[][] massive){
        int count_school_1 = 0;
        int count_school_2 = 0;
        for (int i = 0;i<massive[0].length;i++){
            int number_personal = Integer.parseInt(massive[3][i]);
            int number_students = Integer.parseInt(massive[7][i]);
            long summ_money = Integer.parseInt(massive[12][i]);
            int candidate_sciences = Integer.parseInt(massive[4][i]);
            int doctor_sciences = Integer.parseInt(massive[5][i]);
            int number_computer_class = Integer.parseInt(massive[10][i]);
            int number_sport_class = Integer.parseInt(massive[11][i]);
            double kof = (double)number_students/number_personal;
            if (kof >= 0.005 && summ_money <= 5000000){
                count_school_1 = count_school_1+1;
            }
            if (candidate_sciences >= 1 && doctor_sciences >= 1 && number_computer_class == 2 && number_sport_class == 0){
                count_school_2=count_school_2+1;
            }

        }
        System.out.println("Количество школ по первому описанию:" + count_school_1);
        System.out.println("Количество школ по второму описанию:" + count_school_2);

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count_school;
        int option;
        System.out.println("Введите количество школ:");
        count_school = scanner.nextInt();
        System.out.println("Выберите тип ввода:1)Регламентированный  2)Нерагламентированный");
            option = scanner.nextInt();
            if (option == 1){
                enter_reglam(count_school);
                scanner.close();

            }
            if (option == 2){
                enter_not_reglam(count_school);
            }
            else{
                System.out.println("У вас всего два выбора!");
            }


    }
}
