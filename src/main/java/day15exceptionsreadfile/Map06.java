package day15exceptionsreadfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map06 {

    public static void main(String[] args) {

        // Example: Bir csv file i okuyup icerigi map e ceviren bir method yaziniz.

        Map<String, String> map = convertCsvToMap();
        System.out.println("Map is: " + map);


    }

    public static Map<String, String> convertCsvToMap(){

        Map<String, String> map = new HashMap<>();
        List<String> lineList = new ArrayList<>();

        try{
            BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\day15exceptionsreadfile\\File.txt"));
            String line = br.readLine();
            while (line != null){
                lineList.add(line);
                line = br.readLine();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        for(String w : lineList){
            String arr[] = w.split(", ");
            map.put(arr[0], arr[1]);
        }
        return map;

    }








}
