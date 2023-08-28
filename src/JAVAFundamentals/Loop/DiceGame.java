package JAVAFundamentals.Loop;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {

        Random random = new Random(); //() - constructorul clasei
       /* int dice1 = random.nextInt(6) + 1; // ca sa pui limita finala trebuie sa alegi cu bound; daca vrei interval pui origin si bound (bound e mai mare);
        int dice2 = random.nextInt(1, 7);
        System.out.println(dice1);
        System.out.println(dice2);

        while   (dice1 != dice2){
            dice1 = random.nextInt(1, 7);
            dice2 = random.nextInt(1, 7);
            System.out.println("primul zar este: " + dice1 + " si al doilea este: " + dice2);
        }
        System.out.println("finish");

        */

        int dice1;
        int dice2;
        int count = 0; // prin asta contorizor de cate ori arunc zarul

        do {
            dice1 = random.nextInt(1,7);
            dice2 = random.nextInt(1,7);
            count = count + 1; // count += 1 sau count++
            System.out.println("primul zar este: " + dice1 + " si al doilea este: " +dice2);


        }while (dice1 != dice2);

        System.out.println("finish. Ai aruncat zarurile de " + count);

    }
}
