package JavaFundamentalsCoding.Tema2;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[10];
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert 10 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();


        }
        for (int i = 0; i < 10; i++){
            for (int j = i + 1; j < 10; j++) {
                if (numbers[i] < numbers[j]) {
                    count++;

                }

            }


        }

        System.out.println(count);
    }
}
