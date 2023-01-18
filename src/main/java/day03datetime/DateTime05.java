package day03datetime;

import java.time.LocalTime;

public class DateTime05 {

    public static void main(String[] args) {

        // EbobEkok.day09specialnumbers.Example: If the hour is
        // i) Between 24:00 and 05:00 then print ‘Sleeping time’ on the console
        // ii) Between 08:00 and 16:00 then print ‘Working time’ on the console
        // iii) Between 19:00 and 22:00 then print ‘Family time’ on the console
        // iv) For the others print ‘Personal time’ on the console

        LocalTime currentTime = LocalTime.of(23, 0, 0);
        int hour = currentTime.getHour();
        System.out.println(hour); // 23

        if (0<hour && hour<5){
            System.out.println("Sleeping time");
        } else if (8<hour && hour<16){
            System.out.println("Working time");
        } else if (19<hour && hour<22){
            System.out.println("Family time");
        } else {
            System.out.println("Personal time");
        }



    }
}
