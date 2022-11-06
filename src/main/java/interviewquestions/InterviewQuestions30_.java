package interviewquestions;

import java.util.ArrayList;
import java.util.List;

public class InterviewQuestions30_ {

    public static void main(String[] args) {

       List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(1);

        System.out.println(nonRepeated(list));

    }
    public static List<Character> nonRepeated(List<Integer> list){

        List<Character> unique = new ArrayList<>();

        String s = "";

        for (Integer w : list){
            s = s + w;
        }

        for (int i = 0; i<s.length(); i++){

            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                unique.add(s.charAt(i));
            }
        }
        return unique;
    }


}
