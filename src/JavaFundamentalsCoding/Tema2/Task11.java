package JavaFundamentalsCoding.Tema2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please start insert the texts: ");
        String text;
        String[] longestText = {};
        String longestText1 = "";
        do {
            text = scanner.nextLine();
            if (text.equals("") || text.equals(" ")) {
                System.out.println("No text provided,please insert another text");
            }
            if (longestText.length < text.length() && !text.equals("Enough!"))
                longestText1 = text;

        } while (!text.equals("Enough!"));
        System.out.println("\nThe longest text is: ");
        System.out.println(longestText1);

    }
}