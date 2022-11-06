package interviewquestions;

import java.util.Arrays;

public class InterviewQuestions25 {

    public static void main(String[] args) {

         /*
          [1, 2, 3, 4, 5]
          [3, 4, 5, 1, 2]
        */

        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        int a;
        for (int k = 0; k<2; k++) { // k nin icerideki dongude olmasina gerek yok. k burada her seferinde 1 artacak ve icerideki dongunun toplam 2 kez yapilmasini saglayacak.
                                    //  Icerideki dongunun kac kez calistigini ogrenmek istersen bu satira System.out.println("k: " + k); yaz.
            a = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i-1] = arr[i];
            }
            arr[arr.length - 1] = a;
                                    // Her seferinde ne oldugunu gormek icin bu satira System.out.println(Arrays.toString(arr)); yaz.
        }
        System.out.println(Arrays.toString(arr));









    }
}
