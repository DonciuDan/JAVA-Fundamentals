package JavaFundamentalsCoding.ADouaClasa;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Please provide a number for our bidimensional matrix");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matrix = new int[4][n];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                // System.out.println("we reached cell" + i + " " + j);

                for (int k = 8; k > 0; k--) {
                    if (i + 1 + k == 9) {
                        System.out.println("*");
                    } else {
                        System.out.println(" ");
                    }

                }System.out.println(" ");
            }

        }
    }

}
