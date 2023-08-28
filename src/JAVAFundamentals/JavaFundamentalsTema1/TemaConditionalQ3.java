package JAVAFundamentals.JavaFundamentalsTema1;

public class TemaConditionalQ3 {
    public static void main(String[] args) {
        boolean canSeePlayer = false;
        boolean playerPowerUp = false;
        if (canSeePlayer == true) {
            if (playerPowerUp == false) {
                System.out.println("Attack!");
            } else {
                System.out.println("Run away!");
            }
        } else {
            System.out.println("Wander.");
        }

    }
}