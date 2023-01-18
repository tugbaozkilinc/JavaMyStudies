package day14map;

import java.util.*;

public class Map03 {

    public static void main(String[] args) {

        // There is a Map which contains product names as key and number of the products as value.
        // Print the prices in ascending order.

        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);

        Object[] productPrices = product.values().toArray();
        Arrays.sort(productPrices);
        System.out.println(Arrays.toString(productPrices));

        // There is a Map which contains product names as key and number of the products as value.
        // Print the product names in alphabetical order.

        Set<String> set = product.keySet();
        TreeSet<String> sortedSet = new TreeSet<>(set);
        System.out.println(sortedSet);

        // Type code to count the number of occurrences of the words in a String. (Case insensitive)

        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";
        s = s.replaceAll("\\p{Punct}", "").toLowerCase();
        String arr[] = s.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String w : arr){
            Integer occurrence = map.get(w);
            if(occurrence==null){
                map.put(w, 1);
            } else {
                map.put(w, occurrence+1);
            }
        }
        System.out.println(map);





    }
}
