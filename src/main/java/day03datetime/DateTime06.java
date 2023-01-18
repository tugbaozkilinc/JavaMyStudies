package day03datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTime06 {

    public static void main(String[] args) {

        // Ali was born in Istanbul on 5th of February 2015 at 10:00 am TRT, Mark was born in the USA
        // on 5th of February 2015 at 12:00 pm EST. What is the difference between Ali’s birth time
        // and Mark’s birth time in hours?

        LocalDateTime dobAli = LocalDateTime.of(2015, 02, 5, 10, 0, 0);
        ZonedDateTime dobAliInIstanbul = dobAli.atZone(ZoneId.of("Europe/Istanbul"));
        LocalDateTime dobMark = LocalDateTime.of(2015, 02, 5, 10, 0, 0);
        ZonedDateTime dobMarkInUSA = dobMark.atZone(ZoneId.of("America/New_York"));
        long difference = ChronoUnit.HOURS.between(dobAliInIstanbul, dobMarkInUSA);
        System.out.println("The difference in hours is: " + difference);


    }
}


