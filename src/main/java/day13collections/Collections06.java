package day15collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set05 {

    public static void main(String[] args) {

        // Type code to check if a List has repeated elements or not

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(13);

        Set<Integer> set = new HashSet<>(myList);

        if (myList.size()== set.size()){
            System.out.println("There is no repeated elements");
        } else {
            System.out.println("There is repeated elements");
        }







    }
}
