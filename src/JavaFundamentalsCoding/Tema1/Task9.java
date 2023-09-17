package JavaFundamentalsCoding.Tema1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfWaves = scanner.nextInt();
        do {
            if (numberOfWaves <= 0) {
                System.out.println("The number is 0 or lower than 0, please insert a greater number than 0: ");
                numberOfWaves = scanner.nextInt();
            }
        } while (numberOfWaves <= 0);
        for (int i = 1; i <= numberOfWaves; i++) {
            if (i == 1) {
                System.out.println("*");
                System.out.println(" *");
                System.out.println("  *");
                System.out.println("   *");
            } else if (i == numberOfWaves) {
                System.out.println("*");
                System.out.println("*");
                System.out.println("*");
                System.out.println("*");

            } else System.out.println(" ");

        }
    }
}
