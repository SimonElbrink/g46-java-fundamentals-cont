package se.lexicon.java_time_api;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate waffleDay = LocalDate.of(2023, 3, 25);
        LocalDate christmasEve = LocalDate.parse("2023-12-24");

        LocalDate newYearEve = Year.now().atMonth(Month.DECEMBER).atEndOfMonth();


        LocalDate today_plus_14Days = today.plusDays(14);
        LocalDate today_plus_30Days = today.plus(30, ChronoUnit.DAYS);
        System.out.println("today_plus_14Days = " + today_plus_14Days);
        System.out.println("today_plus_30Days = " + today_plus_30Days);


        System.out.println("today.isLeapYear() = " + today.isLeapYear());

        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear());


        Period period = timeToChristmas(today);

        System.out.println(period.getYears() + " " + period.getMonths() + " " + period.getDays());

    }

    public static Period timeToChristmas(LocalDate today) {

//        LocalDate christmasEve = LocalDate.parse("2023-12-24");
        LocalDate christmasEve = LocalDate.of(
                today.getYear(),
                12,
                24);

        return Period.between(today, christmasEve);





}


}
