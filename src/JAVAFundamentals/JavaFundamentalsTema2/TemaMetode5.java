package JAVAFundamentals.JavaFundamentalsTema2;

public class TemaMetode5 {
    public static void main(String[] args) {
        TemaMetode5 obiect = new TemaMetode5();
        obiect.calculateTip(300);
    }

    public double calculateTip (double costOfTheMeal){
        costOfTheMeal = costOfTheMeal * 0.15;
        System.out.println(costOfTheMeal);
        return costOfTheMeal;
    }
}
