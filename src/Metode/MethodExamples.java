package Metode;

public class MethodExamples {
    public static void main(String[] args) {
        printName ("Dan"); // asa pot pune aici valoarea pe care vreau sa o folosesc in metoda cealalta
        printName("Mihai"); //apelarea metodei
        //
    }

    static void printName(String name) { // pun variabila intre paranteze ca sa o folosesc in metoda respectiva
        //in functie de valoarea pe care i-o dai variabilei acelasi tip de valoarea trebuie sa folosesti la apelarea metodei
        //punem static, doar asa o metoda statica poate folosi alta metoda
        System.out.println(name);
    }

    /* O alta varianta:
    public static void main(String[] args) {
        printName ();
    }

    static void printName() {
        System.out.println("Dan");


     */

    /*
    public static void main(String[] args) {
        String fluffy = "Animal de plus";
        verisor(fluffy);
    }

    static void verisor(String pufy) {
        System.out.println(pufy);
     */
}



