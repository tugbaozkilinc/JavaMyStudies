package interviewquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterviewQuestions30 {

    //Create a method which returns non-repeated elements from a list

    public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    list.add(4);
    list.add(4);
    list.add(4);
    list.add(1);
    list.add(5);
    list.add(5);
    newList(list);

    }
    public static void newList(List<Integer> list){

        Collections.sort(list);

        for (int i = 0; i<list.size(); i++){
            if (i == list.size()-1){
                if (list.get(i)!= list.get(i-1)){
                    System.out.print(list.get(i));
                    break;
                }
            }
            if (i == 0){
                if (list.get(i)!= list.get(i+1)) {
                    System.out.print(list.get(i) + " ");
                }
            } else if (list.get(i)!=list.get(i-1) && list.get(i)!= list.get(i+1)){
                System.out.print(list.get(i) + " ");
            }
        }
    }


}
