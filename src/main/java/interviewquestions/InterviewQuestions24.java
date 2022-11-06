package interviewquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterviewQuestions24 {

    /*
         We are organizing a horse race with horses having distinct strengths.
         The strength of the horses is represented by an array of integers.
         In order to make the race competitive, your program should find out the pair of horses with similar strengths:

         For example: {3, 67, 9, 46, 55, 48}

         Output: 46, 48
    */
    public static void main(String[] args) {
        int arr[] = {3, 67, 9, 46, 55, 48};
        newArray(arr);


    }

    public static void newArray(int arr[]) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] > arr[k]) {
                    list.add(arr[i] - arr[k]);
                } else {
                    list.add(arr[k] - arr[i]);
                }
            }
        }
        Collections.sort(list);

        for (int i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] - arr[i] == list.get(0)) {
                    System.out.println(arr[i] + " " + arr[k]);
                } else if (arr[i] - arr[k] == list.get(0)) {
                    System.out.println(arr[i] + " " + arr[k]);
                }
            }
        }


    }
}


