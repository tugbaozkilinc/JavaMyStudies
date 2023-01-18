package day09specialnumbers;

public class SpecialNumbers06 {

    public static void main(String[] args) {

        /*
          Paskal üçgenini yazdıran Java kodunu yazınız.

              1
             1 1
            1 2 1
           1 3 3 1
          1 4 6 4 1

        */

        int s = 5;
        int number = 0;
        for (int i = 0; i<s; i++) {
            for (int k = s; k>i; k--) {
                System.out.print(" ");
            }
            number = 1;
            for (int m = 0; m <= i; m++) {
                System.out.print(number + " ");
                number = number * (i-m) / (m+1);
            }
            System.out.println();
        }




    }
}
