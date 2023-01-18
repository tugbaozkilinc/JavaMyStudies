package day01arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class List04 {

    public static void main(String[] args) {

        /*
          Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)
          input :
          Learning java is easy
          output:
          maximum occurring character is : a
        */

        Scanner input = new Scanner(System.in);
        System.out.print("String: ");
        String str = input.nextLine().trim();
        String[] strArr = str.replace(" ", "").split("");
        List<String> list = new ArrayList<>();
        list.addAll(List.of(strArr));
        Collections.sort(list);
        List<String> copyList = new ArrayList<>(list);
        List<String> repeatedList = new ArrayList<>();
        List<Integer> repeatedCount = new ArrayList<>();
        int count2 = 2;
        for (String w : list){
            int count = 0;
            for (String y : copyList){
                if (w.equalsIgnoreCase(y)){
                    count++;
                }
            }
            if (count>=count2 && !repeatedList.contains(w)){
                count2 = count;
                repeatedList.add(w);
                repeatedCount.add(count2);
            }
        }
        int maxRepeat= repeatedCount.get(repeatedCount.size()-1);
        for (int i = 0;i<repeatedList.size();i++){
            if (maxRepeat==repeatedCount.get(i)){
                System.out.print("maximum occurring character is : " + repeatedList.get(i) + " ");
            }
        }





    }
}
