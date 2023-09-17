package JavaFundamentalsCoding.Tema1;

import java.time.LocalDate;
import java.util.Scanner;

public class JoacaCoding2 {
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
        int remainingDays = 0;

        if (futureDate.getYear() <= toDay.getYear()) {


//            diffYears = Math.abs(toDay.getYear() - futureDate.getYear());
//            diffDays = Math.abs(toDay.getDayOfYear() - futureDate.getDayOfYear());
//            remainingDays = diffYears * 365 + diffDays;

        } else if (futureDate.getYear() == toDay.getYear()) {
            remainingDays = futureDate.getDayOfYear() - toDay.getDayOfYear();
        } else {
            diffYears = Math.abs(toDay.getYear() - futureDate.getYear());
        }


        System.out.println(remainingDays);
    }

}
