package day02arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array06 {

    public static void main(String[] args) {

        int arr[] = {10, 11, 12};
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);

        changeArray(arr);
        System.out.println(Arrays.toString(arr));
        changeList(list);
        System.out.println(list);
    }
    public static void changeArray(int[] arr){

        arr = new int[5];
        System.out.println(Arrays.toString(arr));
    }
    public static void changeList(List<Integer> list){
        list = new ArrayList<>();
        list.add(40);
        System.out.println(list);
    }



}
