package JavaFundamentalsCoding.PrimaClasa;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.println("Please enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("your Body Mass Index is: " + bmi);

        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI Optimal");
        } else
            System.out.println("BMI not optimal");
    }

}

