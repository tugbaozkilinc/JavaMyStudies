package interviewquestions;

import java.util.Scanner;

public class InterviewQuestions18 {
	/*
	  	Ask user to enter the number of lines of a pyramid.
	  	Type a program to create the pyramid.
	  	For example if the number of lines is 5, the pyramid will be like;          *
																			      * * *
																			    * * * * *
																			  * * * * * * *
																			* * * * * * * * *
	*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of lines of a pyramid");
        int line = scan.nextInt();

        for (int i = line; i >= 1; i--) {
            for (int j = 2; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= (line - i) * 2; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}