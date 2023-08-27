package DateTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DurationPeriodExample {
    public static void main(String[] args) {
        LocalDateTime pastDateTime = LocalDateTime.of(2013,6,17,21,43,12,0);
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println(Duration.ofHours(10).toMinutes()); // ne ajuta sa transformam si in minute sau orice altceva
        System.out.println("Durata dintre trecut si prezent este: " + Duration.between(pastDateTime,currentDateTime)); //durata este la timp, period este la date
        System.out.println(Duration.ofHours(87708).toDays());

        System.out.println("Perioada dintre trecut si prezent este: " + Period.between(pastDateTime.toLocalDate(),currentDateTime.toLocalDate()));
        System.out.println(Period.ofMonths(3).withDays(15).withYears(5)); //la perioada nu le transforma in alte lucruri zile, etc., trebuie sa le faci tu

        System.out.println("------------------------------------------------------------------");

        String dateTimeFormat = currentDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(dateTimeFormat);
        String dateTimeFormat1 = currentDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(dateTimeFormat1);

        String dateTimeFormat2 = currentDateTime.format(DateTimeFormatter.ofPattern("dd.MMM.yy hh:mm:ss"));
        System.out.println(dateTimeFormat2);

        String pastTimeFormat = pastDateTime.format(DateTimeFormatter.ofPattern("HH:m a, yyy.M.d"));
        System.out.println(pastTimeFormat);


    }


}
