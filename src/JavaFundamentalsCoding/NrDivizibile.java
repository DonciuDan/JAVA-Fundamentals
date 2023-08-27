package JavaFundamentalsCoding;

import java.util.Scanner;

public class NrDivizibile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Please provide your number: ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("This is a negative number !");
                System.out.println("1.Provide a new number.");
                System.out.println("2.Turn this number into a positive one.");
                int option = scanner.nextInt();
                if (option == 1) {
                    continue;
                } else {
                    n = -n; //n=n*(-1) sau abs
                }


                //return;
                //sa nu punem if si else samd,ca sa nu mai facem spaghetti code si sa il incurcam, mai bine il facem asa cu return
            }


            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 7 == 0) {
                    System.out.println("Fizz Buzz");
                } else if (i % 7 == 0) {
                    System.out.println("Buzz");

                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else {
                    System.out.println(i);
                }

            }


        } while (n < 0);
    }
}
