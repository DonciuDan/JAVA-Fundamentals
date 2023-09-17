package JavaFundamentalsCoding.ADouaClasa;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first ascii Character:");
        char c = scanner.next().charAt(0);
        System.out.println("Please enter second ascii Character:");
        char c2 = scanner.next().charAt(0);
        System.out.println("Our ascii chars are " + c + " and " + c2);

        int asciiLetterOne = (int) c;
        int asciiLetterTwo = (int) c2;

        System.out.println("Our ascii chars are " + asciiLetterOne + " and " + asciiLetterTwo);

        int letterDifference = asciiLetterTwo - asciiLetterOne;
        System.out.println("The difference between the two letters is " + letterDifference);

        int letterDifferenceAbs = Math.abs(letterDifference);
        // poti sa faci asa ca sa nu mai faci cu if (-1), e un fel de modulo, la numerele absolute trece numarul pozitiv
        System.out.println("The difference between the two letters is " + letterDifferenceAbs);
    }
}
