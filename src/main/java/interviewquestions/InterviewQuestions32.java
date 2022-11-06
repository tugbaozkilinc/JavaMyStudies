package interviewquestions;

import java.util.Arrays;

public class InterviewQuestions32 {

    /*
	 	Print just non-repeated elements from an array
	*/

    public static void main(String[] args) {

        newArray(new int[] {1, 2, 4, 3, 2, 1, 1, 6});

    }
    public static void newArray(int arr[]){

        Arrays.sort(arr);
        for (int i = 0; i<arr.length; i++){
            if (i== arr.length-1){
                if (arr[i]!=arr[i-1]){
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
            if (i==0){
                if (arr[i]!=arr[i+1]){
                    System.out.print(arr[i] + " ");
                }
            } else if (arr[i]!=arr[i-1] && arr[i]!=arr[i+1]){
                System.out.print(arr[i] + " ");
            }
        }
    }


}
