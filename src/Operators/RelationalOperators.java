package Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int number1 = 7;
        int number2 = 5;

        System.out.println(number1 != number2);
        System.out.println("Numerele sunt egale?" + '\n' + (number1 == number2));
        System.out.println('\n');
        boolean firstValue = true;
        boolean secondValue = false;
        System.out.println(firstValue == secondValue); //am verificat daca true este egal cu false
        System.out.println(firstValue != secondValue); //am verificat daca true diferit de false

        System.out.println("Check if number1 is greater than number2: " + (number1 > number2));
        System.out.println("Check if number1 is smaller than number2: " + (number1 < number2));
        System.out.println("Check if number1 is greater or equal than number2: " + (number1 >= number2));
        System.out.println("Check if number1 is smaller or equal than number2: " + (number1 <= number2));

        boolean resultValue = (6 > number2) || (6 < number1) && (6 >= 0); // && (si-ul) se face prima data si || (sau-ul) se face dupa
        //daca voiam sa faca (sau-ul) prima oara scriam asa ((6 > number2) || (6 < number1)) && (6 >= 0)

        System.out.println(resultValue);

        boolean resultValue1 = ((6 > number2) || (6 < number1)) && (!firstValue); //! - asta e negare si se pune in fata numelui

        System.out.println(resultValue1);

    }



}
