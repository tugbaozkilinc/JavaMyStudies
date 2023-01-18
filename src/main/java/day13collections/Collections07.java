package day13collections;

import java.util.*;

public class Collections07 {

    public static void main(String[] args) {

        /*
          Aşağıdaki sıralamaları sağlayan Java Kodunu yazınız.
          [1, 3, 2] --> [1, 2, 3]
          [[1], [3], [2]] --> [[1], [2], [3]]
          [1, [3], 2] --> [1, 2, [3]]
        */

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        System.out.println(linkedHashSet);
        TreeSet<Integer> treeSet = new TreeSet<>(linkedHashSet);
        System.out.println(treeSet);

        LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>();
        linkedHashSet1.add("[1]");
        linkedHashSet1.add("[3]");
        linkedHashSet1.add("[2]");
        System.out.println(linkedHashSet1);
        TreeSet<String> treeSet1 = new TreeSet<>(linkedHashSet1);
        System.out.println(treeSet1);

        LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<>();
        linkedHashSet2.add("1");
        linkedHashSet2.add("[3]");
        linkedHashSet2.add("2");
        System.out.println(linkedHashSet2);
        TreeSet<String> treeSet2 = new TreeSet<>(linkedHashSet2);
        System.out.println(treeSet2);




    }
}
