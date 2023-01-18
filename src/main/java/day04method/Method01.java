package day08method;

public class Method01 {

    public static void main(String[] args) {

        /*
          Type a program to print the integers from 1 to 100 without using any loop.
        */

            printNumbers(100);

        }
        static void printNumbers(int n) {
            if(n > 0) {
                printNumbers(n - 1);
                System.out.print(n + " ");
            }
        }



}
