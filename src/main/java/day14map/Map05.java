package day16map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

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






    }
}
