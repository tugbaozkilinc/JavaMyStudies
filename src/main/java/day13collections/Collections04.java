package day15collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set03 {

    public static void main(String[] args) {

        // Type code to print the common elements between a Set and a List

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(13);
        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(7);
        mySet.add(35);
        mySet.add(13);

        // 1. yol:
        for (Integer w : myList){
            if (mySet.contains(w)){
                System.out.print(w + " ");
            }
        }

        System.out.println();

        // 2. yol:
        mySet.retainAll(myList);
        System.out.println(mySet);





    }
}
