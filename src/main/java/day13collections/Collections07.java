package day15collections;

import java.util.*;

public class Set06 {

    public static void main(String[] args) {

        /*
          Write a function that returns true if you can partition an array into one element and the rest, such that this element is equal to produce of all other elements excluding itself.
          Example:
          [2, 8, 4, 1] --> True
          [-1, -10, 1, -2, 20] --> false
        */

        int arr[] = {3, 4, 1, 2, 6, 12};
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);

        for(int i = 1; i< arr[arr.length-1]; i++){
            if(arr[arr.length-1]%i==0){
                list.add(i);
            }
        }
        System.out.println(list);

        int count = 0;
        for(int i = 0; i< arr.length-1; i++){
            if(list.contains(arr[i])){
                count++;
            }
        }

        if(count==arr.length-1){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("=================================");

        /*
          Aşağıdaki sıralamaları sağlayan Java Kodunu yazınız.
          [1, 3, 2] --> [1, 2, 3]
          [[1], [3], [2]] --> [[1], [2], [3]]
          [1, [3], 2] --> [1, 2, [3]]
        */

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("1");
        linkedHashSet.add("3");
        linkedHashSet.add("2");
        System.out.println(linkedHashSet);
        TreeSet<String> treeSet = new TreeSet<>(linkedHashSet);
        System.out.println(treeSet);

        LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>();
        linkedHashSet1.add("[1]");
        linkedHashSet1.add("[3]");
        linkedHashSet1.add("[2]");
        System.out.println(linkedHashSet1);
        TreeSet<String > treeSet1 = new TreeSet<>(linkedHashSet1);
        System.out.println(treeSet1);

        LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<>();
        linkedHashSet2.add("1");
        linkedHashSet2.add("[3]");
        linkedHashSet2.add("2");
        System.out.println(linkedHashSet2);
        TreeSet<String > treeSet2 = new TreeSet<>(linkedHashSet2);
        System.out.println(treeSet2);
        System.out.println("=================================");


        // Replace(-314159.2653 --> "-$314,159.21")
        double s = -314159.2653;
        String stringS = String.valueOf(s);
        String newS = stringS.substring(0,1) + "$" + stringS.substring(1, 4) + "," + stringS.substring(4, 9) + "1";
        System.out.println(newS);



    }

}
