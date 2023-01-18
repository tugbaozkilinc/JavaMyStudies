package day09specialnumbers;

public class SpecialNumbers03 {

    public static void main(String[] args) {

         /*
          Type a code that prints all prime numbers less than a given number. Example: if user enters
          20 output will be 2, 3, 5, 7, 11, 13, 17, 19
        */

        int n = 20;
        printPrime(n);
    }

    private static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i = 2; i<n; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int n){
        for (int i = 2; i<n; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }








}

