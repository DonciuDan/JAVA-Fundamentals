package Loop;

import java.util.Random;

public class DiceGame1 {
    public static void main(String[] args) {

        Random random = new Random();
        int dice1;
        int dice2;
        int dice3;
        int count = 0; // prin asta contorizor de cate ori arunc zarul

        do {
            dice1 = random.nextInt(1,7);
            dice2 = random.nextInt(1,7);
            dice3 = random.nextInt(1,7);
            count = count + 1; // count += 1 sau count++
            System.out.println("primul zar este: " + dice1 + " si al doilea este: " +dice2 + " al treilea zar este: " + dice3);


        }while (!(dice1 == dice2 && dice2 == dice3)); //ca sa se opreasca cand sunt egale toate trebuie sa pun negatie

        System.out.println("finish. Ai aruncat zarurile de " + count);

    }
    }

