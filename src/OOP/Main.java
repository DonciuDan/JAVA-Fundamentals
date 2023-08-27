package OOP;

import OOP.StaticMethod.MyPrinter;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(PI); // asta se poate face daca faci importul de la inceput


        MyPrinter.printNumber(10);
        //daca nu era static, la metoda pe care am apelat-o mai sus, trebuie sa creezi un obiect

        System.out.println(MyPrinter.formatTime(60));
    }
}
