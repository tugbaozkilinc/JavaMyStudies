package interviewquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class InterviewQuestions08 {
       /*
	 	Create a list by getting the list elements from user
	 	If there is duplicated elements remove them from the list
	   */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String s = "";

        do {
            System.out.println("Enter list elements, to stop entrance press '*'");
            s = scan.next();
            if (!s.equals("*")){
                list.add(s);
            }
        } while (!s.equals("*"));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        List<String> list1 = new ArrayList<>();
        for (int i = 1; i < list.size(); i++){
            if (i==1){
                list1.add(list.get(i-1));
            }
            if (list.get(i-1).equals(list.get(i))){
                list1.add(list.get(i));
                list1.remove(list.get(i-1));
            }
            else {
                list1.add(list.get(i));
            }
        }
        System.out.println(list1);

    }
}
