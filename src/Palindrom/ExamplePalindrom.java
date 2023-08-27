package Palindrom;

import java.util.Scanner;

public class ExamplePalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder builder = new StringBuilder(input);
        String inputRevers = builder.reverse().toString();
        boolean isPalindrome = input.equals(inputRevers);
        if (isPalindrome) {
            System.out.println("Palindrom");

        }else {
            System.out.println("Not Palindrom");
        }
    }
}
