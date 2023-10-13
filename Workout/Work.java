import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;
import java.io.*;
import static java.lang.Math.*;
import java.lang.*;
import java.util.*;
import java.lang.Math;
import java.util.Scanner;
public class Work {
    public static void print(String x){
        System.out.println(x);

    }
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static String delete_number(String st,String num){
        st = st.replace(num," ");
        return st;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String revers = in.nextLine();
        System.out.println(reverseString(revers));
//        HashMap<String,Integer> sets = new HashMap<>();
//        String ist_22 = "ИСТ-22-2б";
//        sets.put(ist_22,80);
//        System.out.print("Введите номер своей группы:");
//        String group = in.nextLine();
////        String group_str = String.valueOf(group); 14
////        System.out.println(ist_22.getClass().getSimpleName());
//        System.out.println(group + group.getClass().getSimpleName());
//        System.out.println(group + " " + ist_22);
//        if (group.equals(ist_22)){
//            System.out.println(sets.get(ist_22));
        }


    }
