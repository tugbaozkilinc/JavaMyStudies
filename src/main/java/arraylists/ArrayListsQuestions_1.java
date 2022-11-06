package arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListsQuestions_1 {
    static int studentNo = 1000;

    public static void main(String[] args) {

       // Giris yili + Ad ve soyadin ilk harfleri + Sira numarasi seklinde ogrenci numarasi olusturan programi yaziniz.

        Scanner scan = new Scanner(System.in);
        String s = "";
        List<String> list = new ArrayList<>();

        do {
            System.out.println("Isim ve soyisim giriniz, isim girisini durdurmak icin X e basiniz.");
            s = scan.nextLine();
            if (!s.equalsIgnoreCase("X")){
                list.add(s);
            }
        }while (!s.equalsIgnoreCase("X"));

        for (String w: list){
            System.out.println(w + " 'in id: " + "" + 22 + w.charAt(0) + w.charAt(w.indexOf(" ")+1) + studentNo );
            studentNo++;
        }



    }
}
