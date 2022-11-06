package interviewquestions;


import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestions21_ {
     /*
	 	Ebay Interview Question
	 	Put all zeros to end in an integer array
	 	{3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
	 	{0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
	 */

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the length of an array");
         int length = scan.nextInt();
         System.out.println("Enter the elements of an array");
         int arr1[] = new int[length];

         for (int i = 0; i < arr1.length; i++){
             arr1[i] = scan.nextInt();
         }
         System.out.println(Arrays.toString(arr1));

         int arr2[] = new int[length];
         int index = 0;
         for (int i = 0; i < length; i++){
             if (arr1[i] != 0) {
                 arr2[index] = arr1[i];
                 index++;
             }
         }
         System.out.println(Arrays.toString(arr2));




    }
}
