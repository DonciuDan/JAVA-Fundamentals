package JAVAFundamentals.JavaFundamentalsTema2;

import java.util.Random;

public class TemaMetodeSiLoops8 {
    public static void main(String[] args) {
        TemaMetodeSiLoops8 object = new TemaMetodeSiLoops8();
        object.monopolyRoll();
    }

    public void monopolyRoll() {
        Random random = new Random();
        int dice1;
        int dice2;
        int sumEquality = 0;
        int count = 0;

        do {
            count++;
            if (count > 3) {
                System.out.println("Player goes to jail!");
                break;
            }
            dice1 = random.nextInt(1, 7);
            dice2 = random.nextInt(1, 7);

            System.out.println(dice1 + " " + dice2);

//            if (dice1 == dice2) {
//                sumEquality = dice1 + dice2;
////                System.out.println(sumEquality);
//            } else if (dice1 != dice2) {
//
//
//            }

            sumEquality = sumEquality + dice1 + dice2;

        }
        while (dice1 == dice2);

        System.out.println("Suma zarurilor este: ");
        System.out.println(sumEquality);

    }

}
