package day01arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List05 {

    public static void main(String[] args) {

        // Elemanlarini kullanicinin girdigi String list olusturunuz. String lerin tamami rakamlardan olussun. Bu listin elemanlarinin carpimini ekrana yazdiriniz.

        Scanner scan = new Scanner(System.in);
        String s = "";
        List<String> list = new ArrayList<>();
        int product = 1;

        do {
            System.out.println("Rakamlardan olusan String ler giriniz, girisi durdurmak icin X giriniz");
            s = scan.next();
            if (!s.equalsIgnoreCase("X")){
                list.add(s);
                product = product * Integer.valueOf(s);
            }
        } while (!s.equalsIgnoreCase("X"));

        System.out.println(list);
        System.out.println("Product is: " + product);



    }
}
