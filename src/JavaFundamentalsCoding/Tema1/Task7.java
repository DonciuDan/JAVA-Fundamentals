package JavaFundamentalsCoding.Tema1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println("Please enter an index number for the Fibonacci series: ");
        int numberIndex = scanner.nextInt();
        do {
            if (numberIndex < 0) {
                System.out.println("The number is a negative number, please type a positive number: ");
                numberIndex = scanner.nextInt();
            }
        } while (numberIndex < 0);

        while (i <= numberIndex) {
            System.out.print(firstNumber + " ");
            int fibonacciNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = fibonacciNumber;
            i++;
        }
    }
}
