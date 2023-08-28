package JAVAFundamentals.JavaFundamentalsTema2;

public class TemaMetode2 {
    public static void main(String[] args) {

        TemaMetode2 object = new TemaMetode2();
        object.isPrime(5);

    }

    public boolean isPrime(int x) {
        if (x % 2 != 0) {
            System.out.println("prim");
        }
        return isPrime(x);

    }
}
