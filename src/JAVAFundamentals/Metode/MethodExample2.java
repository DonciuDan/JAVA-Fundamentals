package JAVAFundamentals.Metode;

public class MethodExample2 {
    public static void main(String[] args) {

        System.out.println("Suma numerelor este: " + calculateSum (4,7) );
    }

    static int calculateSum (int number, int number1) {
        int sum = number + number1;
        return sum;

    }
}
