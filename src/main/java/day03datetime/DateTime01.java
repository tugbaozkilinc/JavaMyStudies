package day03datetime;

import java.time.LocalDate;

public class DateTime01 {

    public static void main(String[] args) {

        /*
          Veli was born 3 years and 11 days after Ali. Ali gave you his date of birth as 24th of November 2012. Type code to calculate Veli’s date of birth.
        */

        LocalDate dobAli = LocalDate.parse("2012-11-24");
        LocalDate dobVeli = dobAli.plusYears(3).plusDays(11);
        System.out.println("The date of birth of Veli is: " + dobVeli);


    }
}
