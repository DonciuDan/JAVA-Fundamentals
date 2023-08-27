package JavaFundamentalsTema1;

public class TemaConditionalQ4 {
    public static void main(String[] args) {
        boolean isSnowing = false;
        boolean isRaining = false;
        double temperature = 60;

        if (isRaining == true) {
            System.out.println("Let's stay home.");
        } else if (isSnowing == true) {
            System.out.println("Let's stay home.");
        } else if (temperature < 50) {
            System.out.println("Let's stay home.");

        } else {
            System.out.println("Let's go out!");


        }
    }
}


