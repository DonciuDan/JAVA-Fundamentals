package JAVAFundamentals.Loop;

public class WhileExample {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            System.out.println("Hello world");
            ++i; // incrementare
            //in interiorul loop-ului trebuie sa ne asiguram ca va fi la un moment fals ca sa se opreasca si sa nu mearga la infinit

        }
        System.out.println("finish");
    }
}
