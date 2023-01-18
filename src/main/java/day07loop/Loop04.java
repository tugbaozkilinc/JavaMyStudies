package day07loop;

public class Loop04 {

    public static void main(String[] args) {

        /*
               *
              ***
             *****
            *******
           *********
          ***********
         *************
          ***********
           *********
            *******
             *****
              ***
               *
        */

        int s = 7;

        for (int i = 1; i<=s; i++){
            for(int b = s; b>i; b--){
                System.out.print(" ");
            }
            for(int y = 1; y<=2*i-1; y++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i<s; i++){
            for(int b = 1; b<=i; b++){
                System.out.print(" ");
            }
            for(int y = 2*(s-i); y>1; y--){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
