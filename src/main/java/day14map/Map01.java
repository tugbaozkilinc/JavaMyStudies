package day14map;

import java.util.HashMap;
import java.util.Hashtable;

public class Map01 {

    public static void main(String[] args) {

        // Example 1: Verilen bir String'deki harfleri ve harflerin kacar kez kullanildigini return eden bir method yaziniz.
        // Input: String input = "Can Hoca bir tane";  output: { =3, a=3, b=1, r=1, C=1, c=1, t=1, e=1, H=1, i=1, n=2, o=1}

        String input = "Can Hoca bir tane";
        String arr[] = input.split("");
        HashMap<String, Integer> map = new HashMap<>();

        for(String w : arr){
            if(!map.containsKey(w)){
                map.put(w, 1);
            } else {
                map.put(w, map.get(w)+1);
            }
        }

        System.out.println(map);

        // Example 2:

        Hashtable<Integer, String> hTable = new Hashtable<>();
        hTable.put(100, "Ali");
        hTable.put(101, "B");
        hTable.put(102, "Cem");

        System.out.println(hTable.containsKey(102)); // true
        System.out.println(hTable.containsValue(101)); // false




    }
}
