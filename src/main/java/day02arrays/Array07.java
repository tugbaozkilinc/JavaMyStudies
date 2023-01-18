package day02arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array07 {

    public static void main(String[] args) {

        /*
          Write a function that returns true if you can partition an array into one element and the rest, such that this element is equal to produce of all other elements excluding itself.
          Example:
          [2, 8, 4, 1] --> True
          [-1, -10, 1, -2, 20] --> false
        */

        int[] arr = {3, 4, 1, 2, 6, 12};
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




    }
}
