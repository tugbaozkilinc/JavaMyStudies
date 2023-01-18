package day01arraylist;

import java.util.ArrayList;
import java.util.List;

public class List01 {

    public static void main(String[] args) {

        /*
          Check if all elements are unique in an integer List by using loops.
        */

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(23);

        int count = 0;

        for (int w : myList){
            for (int k : myList){
                if (w==k){
                    count++;
                    System.out.println("w:" + w); // 1. w 15 e gore k list te 2 tane 15 buluyor. Sonra w a 2. 15 ataniyor k yine calisiyor ve listteki her elemani
                    System.out.println("k:" + k); // 2. 15 ile bir daha karsilastiriyor ve 2 tane 15 buluyor.
                }
            }
        }

        if (count==myList.size()){
            System.out.println("There is no repeated element");
        } else {
            System.out.println("At least one element was repeated");
        }



    }
}
