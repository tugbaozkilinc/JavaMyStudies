package day02arrays;

public class Array02 {

    public static void main(String[] args) {

        /*
          From a given array find all pairs whose sum is a given number.
          If the array is {4, 6, 5, -10, 8, 5, 20} and the number is 10 then output will be
          4+6=10, 5+5=10, -10+20=10
        */

        int arr[] = {4, 6, 5, -10, 8, 5, 20};
        int number = 10;
        int sum = 0;

        for (int i = 0; i< arr.length; i++){
            for (int k = i+1; k< arr.length; k++){
                sum = arr[i] + arr[k];
                if (number==sum){
                    System.out.println(arr[i] + " + " + arr[k] + " = " + sum);
                }
            }
        }




    }
}
