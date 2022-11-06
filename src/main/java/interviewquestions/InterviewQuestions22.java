package interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InterviewQuestions22 {
    /*
	 	Ebay Interview Questions
	 	Get a String and a character from user
	 	Count the number of characters between the first occurrence and the last occurrence of the given character in the String
	 	Do not count the space characters
	 	If the character which user selected is displayed just once in the String return -1
	 	If the character which user selected does not exist in the String return -1
	 	For example; "Java is easy" - 'a' ==> 5
	 	             "Java is easy" - 'w' ==> -1
	 	             "Java is easy" - 'e' ==> -1
	 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine().replace(" ", "");
        System.out.println("Enter a character");
        String ch = scan.next().substring(0,1);

        String arr[] = str.split("");
        List<String> list = Arrays.asList(arr);
        System.out.println(list);

        int count = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals(ch)){
                count++;
            }
        }
        if (count == 1){
            System.out.println(-1);
        } else {
            if (list.contains(ch)) {
                System.out.println(list.lastIndexOf(ch) - list.indexOf(ch) - 1);
            } else {
                System.out.println(-1);
            }
        }




    }
}
