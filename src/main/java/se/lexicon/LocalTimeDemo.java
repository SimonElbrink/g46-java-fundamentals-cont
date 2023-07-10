package se.lexicon;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {
    public static void main(String[] args) {

        LocalTime timeNow = LocalTime.now();

        LocalTime startOfLecture = LocalTime.of(9, 0);
        LocalTime endOfLecture = LocalTime.parse("12:00");

        System.out.println("startOfLecture = " + startOfLecture);
        System.out.println("endOfLecture = " + endOfLecture);

        System.out.println("timeNow = " + timeNow);

        System.out.println(timeNow.truncatedTo(ChronoUnit.MILLIS));
        System.out.println(timeNow.truncatedTo(ChronoUnit.SECONDS));
        System.out.println(timeNow.truncatedTo(ChronoUnit.MINUTES));
        System.out.println(timeNow.truncatedTo(ChronoUnit.HOURS));


        // TimeNow = 11:00 + 2h = 13:00,  13:00 + 30m = 13:30
        LocalTime timeNow_plus_2h_plus_30m = timeNow.plusHours(2).plusMinutes(30);

        LocalTime Time = LocalTime.NOON; // 12:00
        LocalTime min = LocalTime.MIN; // 00:00
        LocalTime max = LocalTime.MAX; // 23:59:999999999
        LocalTime midnight = LocalTime.MIDNIGHT; // 23:59:999999999

        Duration toEndOfDay = Duration.between(LocalTime.MIDNIGHT, timeNow);

        System.out.println(toEndOfDay.getSeconds());

        System.out.println("Minutes and seconds left of this day: "+ (toEndOfDay.getSeconds() / 60) + " seconds: " + (toEndOfDay.getSeconds() % 60));
        System.out.println("Minutes and seconds left of this day: '"+ toEndOfDay.toMinutes() + " seconds: " + toEndOfDay.toSecondsPart());


    }
}
