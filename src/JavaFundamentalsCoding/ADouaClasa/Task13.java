package JavaFundamentalsCoding.ADouaClasa;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your desired phrase to stutter it: ");
        String text = scanner.nextLine();
        String[] myArrayString = text.split(" ");
        for (int i = 0; i< myArrayString.length; i++){
            System.out.print(myArrayString[i] + " " + myArrayString[i] + " ");
        }

        /*
        asa l-am facut in clasa
        for (int i = 0; i< myArrayString.length; i++){
            for (int j=0; j<2; j++){
            System.out.print(myArrayString[i]);
        }
         */

    }

}
