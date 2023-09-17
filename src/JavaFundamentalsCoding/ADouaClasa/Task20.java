package JavaFundamentalsCoding.ADouaClasa;

import java.util.Random;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int chosenNumber = randomNumber.nextInt(0, 100);
        System.out.println(chosenNumber);
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        do {

            try {
                System.out.println("Please insert a number: ");
                number = scanner.nextInt();
                if (number < 0 || number > 100) {
                    System.out.println("Wrong input please insert a number between 0 and 100: ");
                    continue;
                }
                if (chosenNumber == number) {
                    System.out.println("Congratulations!");
                } else if (chosenNumber > number) {
                    System.out.println("not enough");
                } else {
                    System.out.println("too much");
                }
            } catch (Exception e) {
                System.out.println("Wrong input, please try again");
                scanner.nextLine();
            }

        } while (chosenNumber != number || number < 0 || number > 100);

    }
}
