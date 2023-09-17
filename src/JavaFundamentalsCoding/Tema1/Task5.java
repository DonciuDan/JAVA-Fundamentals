package JavaFundamentalsCoding.Tema1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        for (int i = 2; i < number; i++) {
            if (number%i==0){
                System.out.println("This number isn't a prime number");
                break;
            }else if (number==i+1){
                System.out.println("This number is a prime number");
            }

        }


    }
}
