package JavaFundamentalsCoding.ADouaClasa;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[10];
        System.out.println("Please enter 10 numbers: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The number you entered are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");

        }
        System.out.println();
        System.out.println("Numbers that appear at least twice are: ");
        //print the number that occured twice

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
