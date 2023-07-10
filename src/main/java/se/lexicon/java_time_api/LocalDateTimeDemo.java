package se.lexicon.java_time_api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {
    public static void main(String[] args) {

        LocalDateTime timestamp = LocalDateTime.now();
        LocalDateTime nextWorkshop = LocalDateTime.parse("2023-07-12T09:00");
        LocalDateTime endOfWorkDay = LocalDateTime.of(2023,7, 10,17,0);

//        timestamp.plus();

        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        System.out.println("timestamp = " + timestamp);
        System.out.println("timestamp = " + timestamp.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("timestamp = " + timestamp.format(DateTimeFormatter.ISO_WEEK_DATE));
        System.out.println("timestamp = " + timestamp.format(DateTimeFormatter.ofPattern("eeee dd MM y 'T' hh:mm:ss")));


    }
}
