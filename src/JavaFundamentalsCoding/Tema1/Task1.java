package JavaFundamentalsCoding.Tema1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float radius = scanner.nextFloat();
        double pi = Math.PI;
        float diametre = (float) (2*pi*radius);
        System.out.println(diametre);
    }

}
