package interviewquestions;

import java.util.ArrayList;
import java.util.List;

public class InterviewQuestions21 {
    /*
	 	Ebay Interview Question
	 	Put all zeros to end in an integer array
	 	{3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
	 	{0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
	*/

    public static void main(String[] args) {
        newArray(new int[] {6, 0, 0, 0, 4, 2, 0});
    }
    public static void newArray(int arr[]){
        List<Integer> list = new ArrayList<>();
        for (int w: arr){
            list.add(w);
        }
        System.out.println(list);
        int count = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == 0){
                list.remove(i);
                count++;
            }
        }
        for (int i = 1; i<=count; i++){
            list.add(0);
        }

        List<Integer> list1 = new ArrayList<>();
        for (Integer w : list){
            list1.add(w);
        }
        count = 0;
        for (int i = 0; i < list1.size(); i++){
            if (list1.get(i) == 0){
                list1.remove(i);
                count++;
            }
        }
        for (int i = 1; i<=count; i++){
            list1.add(0);
        }
        System.out.println(list1);

        // Note: Remove methodu ilkini kaldirir.

    }

}
