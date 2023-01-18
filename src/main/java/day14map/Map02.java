package day14map;

import java.util.*;

public class Map02 {

    public static void main(String[] args) {

        // There is a Map which contains product names as key and number of the products as value.
        // Type code to find the total number of products.

        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);

        Collection<Integer> values = product.values();
        int sum = 0;

        for(Integer w : values){
            sum += w;
        }

        System.out.println(sum);

        // There is a Map which contains product names as key and number of the products as value.
        // Type code to check if ‘Laptop’ is among the products.

        // 1. yol:
        Set<String> set = product.keySet();
        int count = 0;

        for(String w : set){
            if(w.equalsIgnoreCase("Laptop")){
                count++;
            }
        }

        if(count>0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // 2. yol:
        String expectedProduct = "Laptop";
        if(product.containsKey(expectedProduct)){
            System.out.println(expectedProduct + " exists");
        }else{
            System.out.println(expectedProduct + " does not exist");
        }





    }
}
