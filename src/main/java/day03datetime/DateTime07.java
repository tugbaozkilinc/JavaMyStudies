package day03datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime07 {

    public static void main(String[] args) {

        // Mark was born on 2/23/2018 at 3:25 PM in GMT. What is the exact birthdate and time of Mark in Japan?

        LocalDateTime timeInTokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime timeInGmt = LocalDateTime.now(ZoneId.of("GMT"));
        long diffInHours = ChronoUnit.HOURS.between(timeInGmt, timeInTokyo);
        LocalDateTime dobOfMark = LocalDateTime.of(2018, 2, 23, 15, 25, 0).minusHours(diffInHours);
        System.out.println("Birthdate of Mark in Tokyo is " + dobOfMark);


    }
}
