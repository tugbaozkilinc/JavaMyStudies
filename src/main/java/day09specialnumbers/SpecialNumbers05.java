package day09specialnumbers;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

       /*
         Ask the user to enter an integer to check if it is a prime number or not. EbobEkok.day09specialnumbers.Example: If user
         enters 43 output will be “43 is a prime number”, if user enters 120 output will be “120 is not a
         prime number”, if user enters negative integers output will be “Enter a positive integer”
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        int count = 0;

        if (number>0){
            if (number==1){
                System.out.println(number + " is not a prime number");
            } else {
                for (int i = 2; i<number; i++){
                    if (number%i==0){
                        count++;
                    }
                }
                if (count==0){
                    System.out.println(number + " is a prime number");
                } else {
                    System.out.println(number + " is not a prime number");
                }
            }

        } else {
            System.out.println("Enter a positive integer");
        }

   scan.close();


    }
}

