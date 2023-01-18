package day09specialnumbers;

public class SumOfTwoBinaries {

    public static void main(String[] args) {

        // Iki binary sayiyi toplayan Java kodunu yazınız; 100010 + 110010 = 1010100

        String firstBinary = "100010";
        String secondBinary = "110010";

        int a = Integer.parseInt(firstBinary, 2);
        int b = Integer.parseInt(secondBinary, 2);
        int c = a + b;

        System.out.println(Integer.toBinaryString(c));






    }
}
