package JavaFundamentalsTema1;

public class TemaConditionalQ6 {
    public static void main(String[] args) {
        int dayOfTheWeek = 1;
        boolean holiday = false;

        if (holiday == true || dayOfTheWeek > 5) {
            // if (dayOfTheWeek > 5)
            System.out.println("Sleep in!");
        } else {
            System.out.println("Wake up at 7:00!");
        }
    }
}
