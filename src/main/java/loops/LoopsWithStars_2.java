package loops;

public class LoopsWithStars_2 {

    public static void main(String[] args) {

        /*

         *********
          *******
           *****
            ***
             *

         */

        int s = 5;

        for (int i = 1; i<=s; i++){
            for (int b = 2; b<=i; b++){
                System.out.print(" ");
            }
            for (int y = 0; y<=2*(s-i); y++){
                System.out.print("*");
            }
            System.out.println();

        }
















    }
}
