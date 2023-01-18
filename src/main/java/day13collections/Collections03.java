package day13collections;

import java.util.*;

public class Collections03 {

    public static void main(String[] args) {


        // Type code to print different characters used in a String. Example: "Mississippi" ==> Misp

        // 1. yol:

        String s = "Mississippi";
        Set<String> set = new LinkedHashSet<>();

        for (int i = 0; i<s.length(); i++){
            set.add(s.substring(i, i+1));
        }

        System.out.println(set);

        // 2. yol:

        String[] arr = s.split("");
        HashSet<String> mySet = new HashSet<>(Arrays.asList(arr));
        System.out.println(mySet);




    }
}
