package arrays;

import java.util.Arrays;

public class ArrayChangeExcludingFirstAndLast01 {

    public static void main(String[] args) {

        /*
          Each line of input contains one or several words separated with single spaces. Type code to
          reverse the order of words in each line of input, while preserving the words themselves. The
          lines of your output should not have any trailing or leading spaces.
          Example; Kemal Can Kuzu will be converted to Kuzu Can Kemal
        */

        String input = "Ali\n" +
                "Veli Can Han\n" +
                "Kemal Can Tan Kuzu\n" +
                "Kemal Can Tan Han Kuzu\n" +
                "Kemal Can Tan Han Man Kuzu";
        System.out.println(input);

        String[] lines = input.split("\n");

        for(String w : lines) {
            String[] words = w.split(" ");
            // System.out.println(Arrays.toString(words));
            String rev = words[0] + " ";

            for (int i = words.length-2; i >= 1; i--) {
                rev = rev + words[i] + " ";
            }
            rev = rev + words[words.length-1];
            System.out.println(rev);
            rev = "";
        }



    }
}
