package DateTime;

import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant currentInstant = Instant.now(); //pe servere o sa salveze se va salva pe UTC time si atunci de ex poti folosi asta
        System.out.println(currentInstant); //daca vrei time zone pui local time
    }
}
