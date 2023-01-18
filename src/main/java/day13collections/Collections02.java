package day15collections;

import java.util.*;

public class Set01 {

    public static void main(String[] args) {

        /*
          Type the code that shows how many different elements there are in a list.
          day09specialnumbers.Example: {10, 31, 15, 7, 15, 7, 7} ==> 4
        */

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 31, 15, 7, 15, 7, 7));

        Set<Integer> mySet = new HashSet<>(list);
        System.out.println(mySet);
        System.out.println(mySet.size());



    }
}
