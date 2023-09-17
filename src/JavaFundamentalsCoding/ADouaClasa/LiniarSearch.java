package JavaFundamentalsCoding.ADouaClasa;

import java.util.Scanner;

public class LiniarSearch {
    public static void main(String[] args) {
        int[] array = {10, 5, 4, 23, 109};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the element that you are looking for: ");
        int searchElement = scanner.nextInt();
        int foundElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                foundElement++;
                System.out.println("We found our number " + array[i] + " at the " + i + " position");
            }
        }
        if (foundElement > 0) {
            System.out.println("Our element was found " + foundElement + " times");

        } else {

            System.out.println("Our number wasn't a match in the given array");

        }

    }
}
