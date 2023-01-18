package iterators;

import java.util.*;

public class Iterators02 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("yellow", "white", "blue", "green", "orange"));
        ListIterator<String> itr = list.listIterator();
        while (itr.hasNext()){
            String el = itr.next();
            if(list.indexOf(el)==0 || list.indexOf(el)== list.size()-1){
                continue;
            }
            System.out.print(el + " ");
        }
        System.out.println();

        // Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım
        List<String> list1 = new ArrayList<>(Arrays.asList("yellow", "white", "blue", "green", "orange"));
        ListIterator<String> itr1 = list1.listIterator();
        while (itr1.hasNext()){
            String el = itr1.next();
            if((list1.indexOf(el)!=0) && ((list1.indexOf(el)!=list1.size()-1))){
                continue;
            }
            System.out.print(el + " ");
        }
        System.out.println();


    }
}
