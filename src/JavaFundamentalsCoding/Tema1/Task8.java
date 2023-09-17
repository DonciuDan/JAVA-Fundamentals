package JavaFundamentalsCoding.Tema1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a number:");
        float firstNumber = scanner.nextFloat();
        char s = scanner.next().charAt(0);
        do {
            if (s != '+' && s != '-' && s != '*' && s != '/') {
                System.out.println("Invalid simbol, please insert an operation simbol:");

                s = scanner.next().charAt(0);

            }
        } while (s != '+' && s != '-' && s != '*' && s != '/');
        System.out.println("Please insert a second number:");
        float secondNumber = scanner.nextFloat();
        System.out.println("The operation result is: ");
        if (s == '+') {
            System.out.println(firstNumber + secondNumber);
        } else if (s == '-') {
            System.out.println(firstNumber - secondNumber);
        } else if (s == '*') {
            System.out.println(firstNumber * secondNumber);
        } else if (s == '/') {
            System.out.println(firstNumber / secondNumber);
        }
    }
}