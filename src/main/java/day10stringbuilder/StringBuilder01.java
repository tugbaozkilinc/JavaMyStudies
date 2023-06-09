package day10stringbuilder;

public class StringBuilder01 {

    public static void main(String[] args) {

        // Example 1:
        // Knowledge: append(char[] ch) is used to append the String representation of the char argument to
        // the given sequence. The char argument is appended to the contents of this StringBuilder
        // sequence.

        StringBuilder stb = new StringBuilder("Learn ");
        char[] ch = new char[] { 'J', 'A', 'V', 'A' };
        stb.append(ch);
        System.out.println(stb); // Learn JAVA
        stb.delete(0, 2);
        System.out.println(stb); // arn JAVA

        // Example 2:
        StringBuilder sb3 = new StringBuilder("Learn"); // Buraya parantez icine "Learn" yazarsan append() methodunu kullanmadan, bunu capacity nin ustune ekliyor.
        System.out.println("Before trim: " + sb3.capacity()); // 21 (16+5)
        sb3.trimToSize(); // trimToSize(); StringBuilder in capacity ile length ini esitler.
        System.out.println("After trim: " + sb3.capacity()); // 5 (21-16)

        // Example 3:
        StringBuilder strBld = new StringBuilder(6);
        strBld.append("Learn");
        strBld.append("Java");
        System.out.println(strBld); // LearnJava
        System.out.println(strBld.capacity()); // 14 (6*2+2)

        // Example 4:
        StringBuilder str = new StringBuilder(7);
        str.append("Java");
        System.out.println(str.capacity() + ", " + str.length()); // 7, 4
        System.out.println(str); // Java

        // Example 5:
        str.append("Java is so easy", 0, 4);
        System.out.println(str); // JavaJava

        // Example 6:
        StringBuilder sb = new StringBuilder();
        sb.append("Kemal");
        System.out.println(sb.length()); // 5
        System.out.println(sb.capacity()); // 16
        sb.append(" Can");
        System.out.println(sb.capacity()); // 16
        System.out.println(sb.charAt(0)); // K
        System.out.println(sb.indexOf("K")); // 0
        System.out.println(sb); // Kemal Can
        sb.replace(3, 7, "Ali");
        System.out.println(sb); // KemAlian
        System.out.println(sb.subSequence(2, 4));
        System.out.println(sb); // mA

        // Note: equals(); Iki StringBuilder in degerlerini karsilastirir. equals(); methodunda parantez icine String yazarsak hata vermez ama false doner.
        // String s1 = "java";
        // StringBuilder strB = new StringBuilder("java");
        // if (s1.equals(strB)) System.out.println(2); // s1.equals(strB) is always false.
        // if (s1==strB) System.out.println(1); == kullanamazsin, CTE verir.





    }
}
