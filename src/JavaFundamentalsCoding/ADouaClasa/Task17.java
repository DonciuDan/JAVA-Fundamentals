package JavaFundamentalsCoding.ADouaClasa;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter date to calculate the days in between: ");
        String date = scanner.nextLine();
        LocalDate toDay = LocalDate.now();
        LocalDate futureDate = LocalDate.parse(date);
        System.out.println(toDay);
        System.out.println(futureDate);

        int diffYears = 0;
        int diffMonths = 0;
        int diffDays = 0;
        long remainingDays = 0;

        //am incercat sa o gandim matematic, dar pana la urma s-a uitat pe net si am folosit o librarie

        //if (futureDate.getYear() != toDay.getYear()) {

            remainingDays = Math.abs(ChronoUnit.DAYS.between(toDay,futureDate));

//            diffYears = Math.abs(toDay.getYear() - futureDate.getYear());
//            diffDays = toDay.getDayOfYear() - futureDate.getDayOfYear();
//            remainingDays = diffYears * 365 + diffDays;

        //} else if (futureDate.getYear() == toDay.getYear()) {

         //   remainingDays = ChronoUnit.DAYS.between(toDay,futureDate);
        //la exercitiul nostru puteam sa tratam cu linia urmatoare, doar ca functiona pt acest caz
            //remainingDays = futureDate.getDayOfYear() - toDay.getDayOfYear();
      //  }


        System.out.println(remainingDays);
    }
}
