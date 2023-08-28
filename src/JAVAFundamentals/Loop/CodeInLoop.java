package JAVAFundamentals.Loop;

public class CodeInLoop {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            if (i == 5) {
                return;
            }
            System.out.println("Hello world" + i);


        }

        test();//apelez alte metode din alta parte
        System.out.println("finish");
        /* break intrerupe if-ul in cazul nostru; iese din loops
           continue sare 5-ul si merge mai departe pana indeplineste conditia
           return iese de tot din metoda si revine la main, nu mai afiseaza finish




         */


    }
    public static void test() {
        System.out.println("test");

    }
}







