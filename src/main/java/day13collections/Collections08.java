package day13collections;

import java.util.HashSet;

public class Collections08 {

    public static void main(String[] args) {

        /*
          Main method altinda bir double hashSet olusturunuz ve bu seti, adi setOlustur ve return tipi hashSet double olan ayri bir metod altinda
          3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun. Adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul edecek
          ayri bir method olusturarak hashSetin degerlerinin toplamini alacaksiniz.
          Çıktı--> sonuc = 44.69
        */

        HashSet<Double> set = new HashSet<>();

        System.out.println(crateASet(set));


    }

    public static HashSet<Double> crateASet(HashSet<Double> mySet){

        mySet.add(3.23);
        mySet.add(3.10);
        mySet.add(5.12);
        mySet.add(10.12);
        mySet.add(23.12);

        double sum = 0;
        for (Double w : mySet){
            sum += w;
        }
        System.out.println("Sum is: " + sum);

        return mySet;
    }



}
