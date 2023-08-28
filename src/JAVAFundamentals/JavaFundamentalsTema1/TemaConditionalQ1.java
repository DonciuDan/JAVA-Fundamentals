package JAVAFundamentals.JavaFundamentalsTema1;

public class TemaConditionalQ1 {
    public static void main(String[] args) {
        double balance = 0;
        balance = balance +20;
        balance -= 25;
        balance += 30;
        balance = balance - 25;

        if (balance < 0) {
            System.out.println("We're in the red!");

        } else if (balance > 0) {
            System.out.println("we made a profit!");

        }else {
            System.out.println("We broke even.");

        }

    }
}
