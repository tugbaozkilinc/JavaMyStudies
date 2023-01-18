package day14map;

import java.util.*;

public class Map05 {

    public static void main(String[] args) {

        // Verilen bir listedeki tekrar etmeyen elemanlari veren method u yaziniz.

        String s = "Mississippi";
        HashMap<String, Integer> map = new HashMap<>();
        String arr[] = s.split("");

        for (String w : arr){
            Integer appearance = map.get(w);
            if(appearance==null){
                map.put(w, 1);
            } else {
                map.put(w, appearance+1);
            }
        }
        System.out.println(map);
        Set<String> set = map.keySet();
        for (String w : set){
            if(map.get(w)==1){
                System.out.print(w + " ");
            }
        }

        // How to check the number of repeated elements in a List

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);
        Map<Integer, Integer> myMap = new HashMap<>();

        for(Integer w : myList){
            Integer occurrence = myMap.get(w);
            if(occurrence==null){
                myMap.put(w, 1);
            } else {
                myMap.put(w, occurrence+1);
            }
        }
        System.out.println(myMap);





    }
}
