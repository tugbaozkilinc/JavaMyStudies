package iterators;

import java.util.*;

public class Iterators01 {

    public static void main(String[] args) {

        // Example 1: Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz. 20-40
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 23, 34, 7, 1, 38, 27, 25, 32, 29));
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()){
            Integer el = itr.next();
            if(!(el<40 && el>20)) {
                itr.remove();
            }
        }
        System.out.println(numbers);

        // Example 2: Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdiriniz.
        ListIterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()){
            iterator.next();
        }
        while (iterator.hasPrevious()){
            Integer el = iterator.previous();
            System.out.print(el + " ");
        }
        System.out.println();

        // Bir listedeki ilk 4 elemani iterator kullanarak 5 arttirin.
        System.out.println(numbers);
        while (iterator.hasNext()){
            int el = iterator.next();
            if(numbers.indexOf(el)==4) {
                break;
            }
            iterator.set(el + 5);
        }
        System.out.println(numbers);

        // Example
        List<String> list = new ArrayList<>(Arrays.asList("AB", "CD", "EF"));
        ListIterator<String> it = list.listIterator();
        if(it.previousIndex()==-1) {
            while(it.hasNext()) {
                System.out.print(it.next() + " ");
            }
        }else {
            System.out.print("Good Morn!ng!");
        }
        System.out.println();

        // Example
        List<String> list1 = new ArrayList<>(Arrays.asList("AB", "CD", "EF"));
        ListIterator<String> it1 = list1.listIterator();
        if(it1.nextIndex()!=-1) {
            while(it1.hasNext()) {
                System.out.print(it1.next() + " ");
            }
        }else {
            System.out.print("Good Morning!");
        }
        System.out.println();

        /*
          A) Iterator kullanarak, collection'daki elemanlari okuyabilir ve silebiliriz.
          B) Iterator collection içinde bastan sona dogru ilerleyebilmemize imkan saglar.
          C) Iterator kullandıgımızda index'lerle çalısamayız.
          D) Iterator kullanarak bir collection'a eleman ekleyemeyiz.
        */

        // Example
        List<Integer> list2 = new ArrayList<>(Arrays.asList(12, 13, 14, 15, 16));
        ListIterator<Integer> it2 = list2.listIterator();

        int idx = 0;
        while(it2.hasNext()) {
            Integer el = it2.next();
            if(idx>2) {
                break;
            }
            it2.set(el = el*2);
            System.out.print(el + " ");
            idx++;
        }
        System.out.println();

        // Example
        List<Integer> list3 = new ArrayList<>(Arrays.asList(12, 13, 14, 15, 16));
        ListIterator<Integer> it3 = list3.listIterator();
        while (it3.hasNext()){
            it3.next();
            it3.add(10);
        }
        System.out.println(list3);

    }
}
