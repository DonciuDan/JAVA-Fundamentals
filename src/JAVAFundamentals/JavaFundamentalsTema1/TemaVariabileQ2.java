package JAVAFundamentals.JavaFundamentalsTema1;

public class TemaVariabileQ2 {
    public static void main(String[] args) {
        //Question 2:

        double register = 10.0d;
        register += 5;
        register -=2.5;
        register = register +10;
        register = register -3;

        System.out.println("Raspunsul corect la Intrebarea nr 2 este:");
        if (register == 19) {
            System.out.println("A");
        } else if (register == 19.5d) {
            System.out.println("B");
        } else if (register == 22.5d) {
            System.out.println("C");
        }else {
            System.out.println("D");
        }


    }
}
