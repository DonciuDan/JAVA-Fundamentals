package JavaFundamentalsCoding;

import java.util.Scanner;

public class SumaArmonica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a number for the Harmonic series: ");
        int n = scanner.nextInt();
        double haronicSum = 0;

        for (int i = 1; i <= n; i++) {
            haronicSum += 1 / (double) (i); // sau la toata formula

        }
        System.out.println("Your Harmonic sum is: " + haronicSum);
    }
}
