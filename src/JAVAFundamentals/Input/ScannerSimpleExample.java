package JAVAFundamentals.Input;


import java.util.Scanner;

public class ScannerSimpleExample {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // de cate ori avem nevoie sa citim de la utilizator (ce scrie utilizatorul in consola) vom scrie Scanner si .in ca sa vada ce e in interior (este de tip obiect)
        // dupa egal reprezinta crearea obiectului, este constructorul, au acelasi nume precum clasa, dar are si paranteze ca sa mai adaugi ceva
        System.out.println("Te rog introdu de la tastatura un text:");
        String inputFromUser = scan.nextLine(); // se citeste textul introdus de utilizator de la tastatura si
        System.out.println(inputFromUser.toUpperCase());

        System.out.println("Te rog introdu un numar intreg: ");
        byte byteNumberFromUser = scan.nextByte();
        System.out.println(byteNumberFromUser);

        System.out.println("Te rog introdu un numar intreg: ");
        int intNumberFromUser = scan.nextInt();
        System.out.println(intNumberFromUser + byteNumberFromUser);

        System.out.println("Te rog introdu un nr cu virgula");
        double doubleNumberFromUser = scan.nextDouble();
        System.out.printf("%.2f\n" , doubleNumberFromUser); //punem printf = print format - ca sa modificam formatul la ce imi returneaza - putem cauta pe internet termenul
        // e .2f indiferent daca e double sau float
        // \n se pune ca treaca urmatoarea linie sub numarul formatat sau puteam pune sout gol
        /* la exceptii scrie acolo randul unde este pb ca sa iti dai seama pe unde ai gresit

         */

        System.out.printf("Numele meu este %s si prenumele este %s", "Noge", "Alina");
      //  scanner.close

    }
}
