package day14map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Map04 {

    public static void main(String[] args) {

        // Verilen Map te istenen programlama dilini bilen kisileri list olarak donduren bir method yaziniz.

        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Ali, Can, Java");
        map.put(102, "Veli, Yan, Java");
        map.put(103, "Ali, Yan, C#");

        String programmingLanguage = "Java";

        List<String> result = printNames(map, programmingLanguage);
        System.out.println(result);


    }

    public static List<String> printNames(HashMap<Integer, String> maps, String programmingLanguages){

        List<String> list = new ArrayList<>();

        for(String w : maps.values()){
            String arr[] = w.split(", ");
            if(arr[2].equalsIgnoreCase(programmingLanguages)){
                list.add(arr[0]);
            }
        }
        return list;

    }





}
