package interviewquestions;

public class InterviewQuestions34 {

    /*
 		Type a program to print the integers from 0 to 100 without using any integer
    */

    public static void main(String[] args) {

        // 1. yol:

        for (char c = '\0'; c < 'e'; c++) {  // octal 0'in degeri null yani decimal degeri 0 olan char dir, octal 0'in decimaldeki karsiligi da 0 dir.

            System.out.print((int)c + " "); // Bir sayinin octal degeri \ ile aliniyor.
        }

        System.out.println();

        // 2. yol:

        int b = 'A' - 'A'; // integer bir islemde char lar decimal degeri ile isleme girer, ayni decimal degere sahip olan 2 char degiskeni isleme sokarak 0 rakamini elde ettik.

        for (int c = b ; c <'e'; c++){ // Burda char yerine int data type ni kullandigimiz icin asagida (int) yazmamiza gerek kalmadi.

            System.out.print(c + " ");
        }

        System.out.println();

        // Another information:

        for(int i = 65; i < 68 ; i++){
            System.out.print((char)i);
        }



    }
}

