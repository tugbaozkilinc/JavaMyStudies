package day02arrays;

import java.util.Arrays;

public class Array01 {

    public static void main(String[] args) {

        // Kullanicidan bir String aliniz. String de var olan her character in sayisini ekrana yazdiriniz. Orn: alacan ==> a=3, l=1, c=1, n=1

        String s = "alacan";
        String arr[] = s.split("");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int count = 0;

        for (int i = 1; i< arr.length; i++){
            if (arr[i-1].equals(arr[i])){
                count++;
            } else {
                System.out.println(arr[i-1] + " 'in sayisi: " + (count+1));
                count = 0;
            }
            if (i==s.length()-1){
                System.out.println(arr[i] + " 'in sayisi: " + (count+1));
            }
        }




    }
}
