package JavaFundamentalsCoding.ADouaClasa;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the input String: ");
        String text = scanner.nextLine();
        int spaceCounter = 0;
        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ') {
                spaceCounter++;
                //  System.out.println("Found space");
            } else {

                //  System.out.println(text.charAt(i));
            }

        }
        System.out.println("Our space counter is: " + spaceCounter + " and our text length is: " + text.length());
        try {
            if (text.length() <= 0){
                throw new Exception("Number is less then 1");
            }
            double percentage = (double) spaceCounter / text.length() * 100;
            System.out.println("Result is: " + (float) spaceCounter / text.length());
            System.out.format("Our percentage is: %.2f %%", percentage);
        } catch (Exception e) {
          //  System.out.println("Please enter a String with a length greater than 0");
            System.out.println("Error " + e.getMessage());
        }


        // System.out.print("%");
        //  System.out.println(text);
    }
}
