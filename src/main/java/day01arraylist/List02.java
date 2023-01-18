package day01arraylist;

import java.util.ArrayList;
import java.util.List;

public class List02 {

    public static void main(String[] args) {

        /*
          If a list has 15 or 13, remove them.
          EbobEkok.day09specialnumbers.Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)
        */

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(20);
        list.add(15);
        list.add(54);

        if (!list.contains(13) && !list.contains(15)){
            System.out.println("The list doesn't contain 13 and 15");
        } else {
            for (int i = 0; i< list.size(); i++){
                if (list.get(i)==15) {
                    int idx15 = list.indexOf(15);
                    list.remove(idx15);
                    i--;
                }
                if (list.get(i)==13){
                    int idx13 = list.indexOf(13);
                    list.remove(idx13);
                    i--;
                }
            }
            System.out.println(list);
        }


    }
}
