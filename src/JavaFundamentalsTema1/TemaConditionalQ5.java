package JavaFundamentalsTema1;

public class TemaConditionalQ5 {
    public static void main(String[] args) {
        double time = 21;
        String timeOfDay;

        if (time >= 5 && time < 12) {
            timeOfDay = "morning";

        } else if (time >= 12 && time < 20) {
            timeOfDay = "daytime";
        } else {
            timeOfDay = "night";
        }
        System.out.println(timeOfDay);
    }
}
