package JAVAFundamentals.OOP.StaticMethod;

public class MyPrinter {
    public static void printNumber(int number) {
        System.out.println("Numarul este " + number);
    }

    public static String formatTime(int seconds) {
        int minutes = 0;
        int hours = 0;

        if (seconds > 0 || seconds < 60) {
            seconds = seconds;
            if (seconds >= 60) {
                minutes = seconds / 60;
                seconds = seconds % 60;
                if (minutes >= 60) {
                    hours = minutes / 60;
                    minutes = minutes % 60;
                }
            }
        }
        if (seconds < 0) {
            seconds = 0;
        }

        return String.format("%sh %smin %ssec", hours, minutes, seconds);
    }
}
