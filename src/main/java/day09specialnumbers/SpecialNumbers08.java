package day09specialnumbers;

import java.util.Arrays;

public class SpecialNumbers08 {

    public static void main(String[] args) {

        /*
          Ask the user how many fibonacci numbers he wants to see. Then write the code that prints
          these fibonacci numbers. if user enters 6 output will be 1 1 2 3 5 8
        */

        // 1. yol:
        int number = 10;

        int arr[] = new int[number];

        for (int i = 0; i<arr.length; i++){
            if (i==0){
                arr[i] = 1;
            } else if (i==1){
                arr[i] = 1;
            } else {
                arr[i] = arr[i-1] + arr[i-2];
            }
        }

        System.out.println(Arrays.toString(arr));

        // 2. yol:
        int fibonacci1 = 1;
        int fibonacci2 = 1;
        System.out.print(fibonacci1 + " ");
        System.out.print(fibonacci2 + " ");

        for (int i = 1; i<number-1; i++) {
            int fibonacciSum = fibonacci1 + fibonacci2;
            fibonacci1 = fibonacci2;
            fibonacci2 = fibonacciSum;
            System.out.print(fibonacciSum + " ");
        }



    }
}
