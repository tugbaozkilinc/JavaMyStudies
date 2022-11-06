package interviewquestions;

import java.util.Scanner;

public class InterviewQuestions20 {
    /*
    Type code to draw isosceles right triangle whose side length will be given by user.
    For example; if the side is 5 triangle will be like;   *
                                                           * *
                                                           *   *
                                                           *     *
                                                           * * * * *
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int line = scan.nextInt();

        for (int i = 1; i <= line; i++) {
            if (i <= 2) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else if (i >= 3 && i < line) {
                System.out.print("* ");
                for (int k = 2; k < i; k++) {
                    System.out.print("  ");
                }
                for (int n = 1; n < 2; n++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else if (i == line) {
                for (int m = 1; m <= line; m++) {
                    System.out.print("* ");
                }
            }
        }
    }
}