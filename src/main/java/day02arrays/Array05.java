package day02arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Array05 {

    public static void main(String[] args) {

        /*
          Find the elements whose length is the smallest in a String Array
          EbobEkok.day09specialnumbers.Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
        */

        // 1. yol:
        String arr[] = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int minLength = arr[0].length();

        for (String w : arr){
            minLength = Math.min(w.length(), minLength);
        }

        for (String w : arr){
            if (w.length()==minLength){
                System.out.print(w + " ");
            }
        }

        System.out.println();

        // 2. yol:

        Arrays.sort(arr, Comparator.comparingInt(String::length));

        for (String w : arr){
            if (w.length()==arr[0].length()){
                System.out.print(w + " ");
            }
        }


    }
}