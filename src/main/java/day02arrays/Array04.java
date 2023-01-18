package day02arrays;

public class Array04 {

    public static void main(String[] args) {

        /*
          Each line of input contains one or several words separated with single spaces. Type code to
          reverse the order of words except the first and the last words in each line of input, while
          preserving the words themselves. The lines of your output should not have any trailing or
          leading spaces. EbobEkok.day09specialnumbers.Example; Kemal Can Tan Han Kuzu will be converted to Kemal Han Tan Can Kuzu
        */

        String input = "Ali\r\n" +
                "Veli Can Han\r\n" +
                "Kemal Can Tan Kuzu\r\n" +
                "Kemal Can Tan Han Kuzu\r\n" +
                "Kemal Can Tan Han Man Kuzu";
        System.out.println(input);

        String[] lines = input.split(System.getProperty("line.separator"));

        for(String w : lines) {
            String[] words = w.split(" ");
            // System.out.println(Arrays.toString(words));
            String rev = words[0] + " ";

            for (int i = words.length - 2; i >= 1; i--) {
                rev = rev + words[i] + " ";
            }
            rev = rev + words[words.length-1];
            System.out.println(rev);
            rev = "";
        }



    }
}
