package JavaFundamentalsTema2;

public class TemaMetoda5 {
    public static void main(String[] args) {
        TemaMetoda5 obiect = new TemaMetoda5();
        obiect.calculateTip(300);
    }

    public double calculateTip (double costOfTheMeal){
        costOfTheMeal = costOfTheMeal * 0.15;
        System.out.println(costOfTheMeal);
        return costOfTheMeal;
    }
}
