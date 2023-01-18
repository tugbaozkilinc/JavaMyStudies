package oraclecertifiedquestions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Oracle02 {

    public static void main(String[] args) {

        // Example 1:
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long)s1+s2; // (long) yazmayinca CTE veriyor

        // Example 2:
        int[] numbers;
        numbers = new int[2];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers = new int[4];
        numbers[2] = 30;
        numbers[3] = 40;
        System.out.println(Arrays.toString(numbers));

        // Example 3:
        for(int x = 0; x<3; ++x){ // x++ ile ayni sonucu veriyor
            System.out.println("Welcome " + x);
        }
        int x = 100;
        do {
            ++x;
            System.out.println("Welcome " + x);
        }while (x<100); // Welcome 101

        // Example 4:
        int z;
        // z++; // CTE verir
        int a;
        int y = 1;
        while(y<3){
            // a++; // CTE verir
            a = 10;
            y++;
        }
        // System.out.println(a); // CTE verir

        // Example 4:
        int x1 = 1;
        int y1 = 1;

        if (x1++ <++y1){
            System.out.println("Hello");
        } else {
            System.out.println("Welcome");
        }
        System.out.println("Log " + x1 + ": " + y1);

        // Example 5:
        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
        for (int i = 0; i< arr.length; i++){
            for (int k = 0; k<arr[i].length; k++){
                System.out.print(arr[i][k] + " ");
                continue;
            }
            continue;
        } // A B C D E

        int ab = 2;
        float cv = (float)ab;
        float acv = (float)1.23;

        // Example 6:
        System.out.println();
        System.out.println("Hello " + new StringBuilder("Java Se 8")); // Hello Java Se 8
        System.out.println("Hello " + new Book("Java Se 8")); // Hello oraclecertifiedquestions.Book@47f6473 ==> toString() olmadan

        // Example 7:
        float v1 = (12.34501 <= 12.4500) ? 12.456f : 124.5602f; // ikisinde de f olmali, true ya da false ne olursa olsun
        float v2 = v1 + 1024;
        System.out.println(v2); // 1036.456

        // Example 8:
        LocalDate date = LocalDate.of(2012, 1, 30);
        date.plusDays(10);
        System.out.println(date); // 2012-01-30 atama yapmadigin icin degisiklik gerceklesmez.




    }
}
