package JAVAFundamentals.JavaFundamentalsTema2;

public class TemaMetode4 {
    public static void main(String[] args) {
        TemaMetode4 object = new TemaMetode4();
        object.absoluteValue(-5);
    }

    public double absoluteValue(double x) {
        if (x < 0) {
            System.out.println(-x);
            return -x;

        } else {
            System.out.println(x);
            return x;
        }

    }
}
