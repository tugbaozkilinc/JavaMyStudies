package day15collections;

import java.util.*;

public class Set02 {

    public static void main(String[] args) {

        /*
          Type code to print different characters used in a String. day09specialnumbers.Example: "Mississippi" ==> Misp
        */

        String s = "Mississippi";
        Set<String> set = new LinkedHashSet<>();

        for (int i = 0; i<s.length(); i++){
            set.add(s.substring(i, i+1));
        }

        System.out.println(set);




    }
}
