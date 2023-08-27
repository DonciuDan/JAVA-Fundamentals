package JavaFundamentalsTema2;

public class TemaLoops4 {
    public static void main(String[] args) {

        System.out.println(yearsTillOneMillion(100000));
    }
    public static int yearsTillOneMillion(double initialBalance) {
        int years = 0;
        double balance = initialBalance;
        while (balance<1000000) {
            years++;
            balance = balance * 1.05;
        }


    return years;
    }

    }

