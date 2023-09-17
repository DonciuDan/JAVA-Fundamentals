package JavaFundamentalsCoding.Tema1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write what number represents a: ");
        double a = scanner.nextFloat();
        System.out.println("Write what number represents b: ");
        double b = scanner.nextFloat();
        System.out.println("Write what number represents c: ");
        double c = scanner.nextFloat();

        double delta = (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println("Delta negative");

        } else {

            double x1 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("\nx1 este: \n" + x1);
            double x2 = (-b + Math.sqrt(delta)) / 2 * a;
            System.out.println("\nx2 este: \n" + x2);
        }

    }
}
