package loops;

public class LoopRepeatedCharacter {

     /*
        Type code to print repeated characters in a String. For example; accessories ⇒ ces
     */

     public static void main(String[] args) {

     // 1. yol:

         String s = "accessories";
         String result = "";
         String ch;

         for (int i = 0; i<s.length(); i++){
             ch = s.substring(i,i+1);
             if (s.indexOf(ch)!=s.lastIndexOf(ch)){
                 if (!result.contains(ch)){
                     result = result + ch;
                 }
             }
         }
         System.out.println(result);

   }
}
