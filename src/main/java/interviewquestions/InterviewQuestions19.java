package interviewquestions;

import java.util.Scanner;

public class InterviewQuestions19 {
    /*
              Ask user to enter the number of lines of an inverted pyramid.
              Type a program to create the inverted pyramid.
              For example; if the number of lines is 5, the pyramid will be like;* * * * * * * * *
                                                                                   * * * * * * *
                                                                                     * * * * *
                                                                                       * * *
                                                                                         *
            */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of lines of an inverted pyramid");
        int line = scan.nextInt();

        for (int i = 1; i <= line; i++) {
            for (int j = 2; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * (line - i); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}