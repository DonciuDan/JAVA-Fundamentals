package Joaca;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Scanner;



public class JoacaRandom {
    public static void main(String[] args) {
        int number = 3;
        float number1 = 5.05f;


        System.out.println(number + (int) (number1));
        System.out.println("-----------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu numarul pt verificare: ");
        int numberNearOneHundred = scanner.nextInt();
        if (numberNearOneHundred > 90 && numberNearOneHundred < 110) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }
        System.out.println("-----------------------------");

        int numberForCat = 18;
        numberForCat = numberForCat / 7;
        System.out.println(numberForCat);
        System.out.println("-----------------------------");
        double number2 = 18;
        number2 = number2 % 7;
        System.out.println(number2);
        System.out.println("-----------------------------");
        if ((number2 + numberForCat) > 6) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
        System.out.println("-----------------------------");


        System.out.println("Introdu cate kg de gem trebuie sa ia Will:");
        int numberFromScanner = scanner.nextInt();
        if (numberFromScanner < 7 || (numberFromScanner / 7 + numberFromScanner % 7) <= 6) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("---------Round Down-------");


        float numberRoundDown = BigDecimal.valueOf(number2)
                .setScale(2, RoundingMode.DOWN)
                .floatValue();
        System.out.println(numberRoundDown);

        System.out.println("-----------Math Rounded--------");

        float numberRoundMath = (float) Math.round(number1);
        System.out.println(numberRoundMath);

        System.out.println("---------------");

        String nume = " Dan Donciu ";

        localTime();
        printName();
    }

    static void printName() {
        System.out.println("Dan");

    }

    static void localTime () {
        LocalDate d = LocalDate.of(2020,3,22);
        d = d.plusDays(2);
        System.out.println(d);

    }
}







