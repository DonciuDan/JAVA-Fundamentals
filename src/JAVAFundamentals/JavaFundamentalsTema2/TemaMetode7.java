package JAVAFundamentals.JavaFundamentalsTema2;

public class TemaMetode7 {
    public static void main(String[] args) {
        TemaMetode7 object = new TemaMetode7();

        object.printTemperature(20);


    }

    public double fahrenheitToCelsius(double f) {
        double c = (f - 32) * 5 / 9;

        return c;
    }

    public void printTemperature(double f1) {
        TemaMetode7 object = new TemaMetode7();
        System.out.println("F: " + f1);
        System.out.println("C: " + object.fahrenheitToCelsius(f1));

    }
}
