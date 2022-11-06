package interviewquestions;

import java.util.Arrays;

public class InterviewQuestions27 {

    public static void main(String[] args) {

      String str = "aaabbccccaaaa";
      String arr[] = str.split("");
      System.out.println(Arrays.toString(arr));

      int count = 0;
      for (int i = 1; i < arr.length; i++){
          if (arr[i-1].equals(arr[i])){
              count++;
          } else {
              System.out.print(arr[i-1] + (count + 1));
              count= 0;
          }
          if (i == arr.length-1){
              System.out.print(arr[i] + (count + 1));
          }

      }






    }

}
