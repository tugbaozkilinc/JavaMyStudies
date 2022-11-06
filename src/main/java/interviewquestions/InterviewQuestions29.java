package interviewquestions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterviewQuestions29 {

    public static void main(String[] args) {

        int arr[] = {11, 6, 5, 2, 1};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> list = new ArrayList<>();

        int n = 0;

        for (int i = 1; i < arr.length; i++){

            n = arr[i]-arr[i-1];

            if (n != 1){

                for (int k = 1; k<n; k++){

                    list.add(arr[i-1]+k);
                }
            }
        }
        System.out.println(list);



    }
}