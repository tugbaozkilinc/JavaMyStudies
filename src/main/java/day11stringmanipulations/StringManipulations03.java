package day11stringmanipulations;

public class StringReplaceAll_3 {


    public static void main(String[] args) {

        /*
         String shirtPrice = ‘$12.99’;
         String bookPrice = ‘$35.99’;
         Type code to find the sum of the shirt and book prices.
         */

        String shirtPrice1 = "$12.99";
        String bookPrice1 = "$35.99";

        String s = shirtPrice1.replaceAll("[$.]","");  // Note: [$.] buradaki nokta bu degeri 100 ile carpti benim anladigim.
        String b = bookPrice1.replaceAll("[$.]","");
        double x = Double.valueOf(s);
        double y = Double.valueOf(b);
        System.out.println("Total price is " + (x+y)/100);

        // Note: String ifadede olan $ ve . karakterleri hiclik ile yer degistirmis. Buradaki amac; ondalikli sayilar bazi bilgisayarlarda . ile ifade edilirken
        // bazilarinda , ile ifade ediliyor. Burada bunun onune gecilmek istenmis. Yukaridaki String ifade $ ve . isaretinden arindirilinca 1299 ve 3599 oluyor.
        // Burada toplama isleminden sonra 100' e bolunmesinin sebebi bu.



    }
}
