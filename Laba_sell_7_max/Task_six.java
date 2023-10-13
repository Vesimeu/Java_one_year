package laba_7;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_six {
    public static final int criteria = 16;
    public static void print_option(int i){
        if (i == 0){
            System.out.println("факультет:");
        }
        if (i == 1){
            System.out.println("кафедру:");
        }
        if (i == 2){
            System.out.println("ФИО руководителя:");
        }
        if (i == 3){
            System.out.println("количество членов исследовательской группы:");
        }
        if (i == 4){
            System.out.println("количество членов исследовательской группы младше 39 лет:");
        }
        if (i == 5){
            System.out.println("количество студентов:");
        }
        if (i == 6){
            System.out.println("количество аспирантов:");
        }
        if (i == 7){
            System.out.println("сумма финансирования:");
        }
        if (i == 8){
            System.out.println("наличие лабороторго оборудования(0 или 1):");
        }
        if (i == 9){
            System.out.println("общая стоимость оборудования:");
        }
        if (i == 10){
            System.out.println("количество компьютерных классов:");
        }
        if (i == 11){
            System.out.println("наличие вычислительных станций:");
        }
        if (i == 12){
            System.out.println("количество ПК:");
        }
        if (i == 13){
            System.out.println("количество серверных платформ:");
        }
        if (i == 14){
            System.out.println("нормативное количество статей,которые должны издаваться за год:");
        }
        if (i == 15){
            System.out.println("текущее количество изданных статей за текущий год:");
        }


    }
    public static void enter_reglam(int count_project){
        Scanner scanner = new Scanner(System.in);
        String inform;
        System.out.println("Регламентированный ввод");
        String[][] massive = new String[criteria][count_project];
        for (int i = 0;i<count_project;i++){
            System.out.println("Вы вводите информацию о "+ (i+1) + " проекте!");
            for (int g=0;g<criteria;g++){
                System.out.print("Введите ");
                print_option(g);
                inform = scanner.nextLine();
                massive[g][i] = inform;
            }
        }
        information_about_the_shool(massive);
    }
    public static void enter_not_reglam(int count_project){
        System.out.println("Нерегламентированный ввод");
        Scanner scanner = new Scanner(System.in);
        String inform;
        String[][] massive = new String[criteria][count_project];
        ArrayList<Integer> massive_exception = new ArrayList<Integer>();
        int crit;
        int count = count_project * criteria;
        System.out.println("Вам нужно ввести номер критерия, который хотите ввести!");
        for (int b = 0;b<criteria;b++){
            System.out.print(b+1 + ")");
            print_option(b);
        }
        for (int i = 0;i<count_project;i++){
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
        int count_project_1 = 0;
        int count_project_2 = 0;
        for (int i = 0;i<massive[0].length;i++){
            long summ_money = Integer.parseInt(massive[7][i]);
            int candidate_group= Integer.parseInt(massive[3][i]);
            int candidate_group_39 = Integer.parseInt(massive[4][i]);
            int count_aspirt = Integer.parseInt(massive[6][i]);
            int count_students = Integer.parseInt(massive[5][i]);
            if ((summ_money == 1000000) && (candidate_group >=5) && (candidate_group_39 >= 1)){
                count_project_1 = count_project_1 + 1;
            }
            if (count_aspirt >= 1 && count_students >= 2){
                count_project_2 = count_project_2 + 1;
            }

        }
        System.out.println("Количество проектов по первому описанию:" + count_project_1);
        System.out.println("Количество проектов по второму описанию:" + count_project_2);

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count_school;
        int option;
        System.out.println("Введите количество проектов:");
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
            scanner.close();
        }


    }
}
