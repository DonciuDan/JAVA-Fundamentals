package JAVAFundamentals.Metode;

public class MethodWithObjects { //cand vrem sa cautam clasa tot timpul vedem numele class inainte
    public static void main(String[] args) {
        //nu conteaza ordinea metodelor, conteaza ordinea de apelare
        MethodWithObjects object = new MethodWithObjects(); //poate sa fie orice obiect din clasa respectiva
        object.checkNumber(1);//dupa pct. checkNumber o sa apara ingrosat (asta pt ca am creat-o eu) celelalte care nu sunt ingrosate sunt de la JAVA
        //toate lucrurile astea le-am facut ca sa nu mai punem static la metoda checkNumber
        //in afara de primitive poti pune ca din orice clasa sa avem un obiect din clasa respectiva
        object.checkNumber1(10);
        System.out.println("finish");

    }

    void checkNumber(int number) { //metodele care au cuvantul static, pot fi apelate fara sa fi declarat vreun obiect
        if (number % 2 == 0) { //modulo da restul la cat am impartit
            System.out.println("Numar par");
        } else {
            System.out.println("Numar impar");
        }
    }

    void checkNumber1(int number) {
        if (number % 2 == 0) {
            System.out.println("Numarul este par si nu il afisam");
            return;
        } else {
            System.out.println("Numar impar");
        }

        //void test () {

    }
}
