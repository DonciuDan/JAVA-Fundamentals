package Loop;

public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Hello world" + i);
            ++i;
        }while (i < 10);
        System.out.println("finish");
    }// la do while nu trebuie sa mai initializezi
    // do while executa cel putin codul o data dupa care verifica conditia
}
