package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTime04 {

    public static void main(String[] args) {

        // Find the difference in hours for two different dates

        // 1. yol:
        LocalDateTime date3 = LocalDateTime.of(1996, 8, 21, 0, 0);
        LocalDateTime date4 = LocalDateTime.of(1996, 7, 21, 0, 0);
        long difference2 = ChronoUnit.HOURS.between(date4, date3);
        System.out.println(difference2);

        // 2. yol:
        LocalDateTime date1 = LocalDate.of(1996, 8, 21).atTime(0,0);
        LocalDateTime date2 = LocalDate.of(1996, 7, 21).atTime(0, 0);
        long difference1 = ChronoUnit.HOURS.between(date2, date1);
        System.out.println(difference1);


    }
}
