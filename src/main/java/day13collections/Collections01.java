package day15collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {

        //  Bir LinkedList olusturunuz ve ilk eleman ile 4. elemanin yerini degistiren kodu yazınız.

        LinkedList<String> colors = new LinkedList<>(Arrays.asList("mavi", "kirmizi", "beyaz", "siyah", "yesil", "turuncu"));
        System.out.println(colors);
        Collections.swap(colors, 0, 3);
        System.out.println(colors);





    }
}
