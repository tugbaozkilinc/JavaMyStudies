package day07loops;

public class Loop05 {
    public static void main(String[] args) {

        /*
          Create a program checks if a String is palindrome or not.
	 	  If a word, phrase, or sequence that reads the same backward as forward then it is called "Palindrome",
	      For example, "madam" or "nurses run".
        */

        String s = "Nurses run";
        String t = s.replace(" ","").toLowerCase();
        String result = "";

        for (int i = t.length()-1; i>=0; i--){
            result = result + t.charAt(i);
        }

        String isPalindrome = t.equals(result) ? s + ": is palindrome" : s + ": is not palindrome";
        System.out.println(isPalindrome);







    }
}
