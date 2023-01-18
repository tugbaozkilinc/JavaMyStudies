package day01arraylist;

import java.util.*;

public class List03 {

    public static void main(String[] args) {

        // int num[] = {1, 2, 4, 5, 6, 8, 9, 11}; num Array inde olmayan rakamları yazdıran kodu yazınız.

        // 1. yol:
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 8, 9, 11));
        Set<Integer> listNew = new HashSet<>();
        for (int i = 0; i< list.size(); i++){
            for (int k = 0; k<10; k++){
                if(!list.contains(k)){
                    listNew.add(k);
                }
            }
        }

        System.out.println(listNew);





    }
}
