package day09specialnumbers;

import java.util.Scanner;

public class SpecialNumbers02 {

    public static void main(String[] args) {

        /*
          Girilen bir sayının ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
          Sayı sisteminde, ugly number sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır.
          İlk 10 ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an ugly number or not");
        int s = scan.nextInt();

        // 1. yol:
        int count = 0;
        if(s<=0){
            System.out.println("An ugly number should be positive");
        } else if(s==1) {
            System.out.println("1 is an ugly number");
        } else {
            for (int i = 2; i<=s; i++){
                if(s%2==0 || s%3==0 || s%5==0){
                    count++;
                }
            }
            if (count==0) {
                System.out.println(s + " is not an ugly number");
            } else {
                System.out.println(s + " is an ugly number");
            }
        }

        // 2. yol:
        int temp2 = 0;
        if (s<=0) {
            System.out.println("An ugly number should be positive");
        } else {
            int temp = s;
            while (true) {
                if (temp%2 == 0) {
                    temp /= 2;
                } else if (temp%3 == 0) {
                    temp /= 3;
                } else if (temp%5 == 0) {
                    temp /= 5;
                } else {
                    temp2 = temp;
                    break;
                }
            }
            if (temp2 == 1) {
                System.out.println(s + " is an ugly number");
            } else {
                System.out.println(s + " is an ugly number");
            }
        }




    }
}
