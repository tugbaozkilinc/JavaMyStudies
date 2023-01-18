package datetime;

import java.time.LocalDate;

public class DateTime03 {

    public static void main(String[] args) {

        // Type code to check if a given year is “Leap year” or not
        // Leap Year:
        // i) If a year is divisible by 100 and divisible by 400 it is called leap year. For example; 2000 is, 1900 is not
        // ii) If a year is not divisible by 100 and divisible by 4 it is called leap year. For example; 2004 is, 2007 is not

        // 1. yol:
        LocalDate currentDate = LocalDate.of(2007, 5, 17);
        String result = currentDate.getYear()%100==0 ? currentDate.getYear()%400==0 ? "Leap year" : "Not leap year" : currentDate.getYear()%4==0 ? "Leap year" : "Not leap year";
        System.out.println(result);

        // 2. yol:
        boolean isLeapYear = currentDate.isLeapYear();
        System.out.println("Is the given year leap year? " + isLeapYear);



    }
}
