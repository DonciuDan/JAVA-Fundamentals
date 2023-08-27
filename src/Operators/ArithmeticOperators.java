package Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int number = 7;

        int anotherValue = ++number; //daca pui ++ dupa number il incrementeaza (cresti cu o unitate) dupa anotherValue number = number + 1


        System.out.println(anotherValue);

        System.out.println(++number);

        //ce am scris mai sus explicat ca program:
        //int number = 7;
        //int anotherValue = number++;
        //System.out.println(number);
        //System.out.println(anotherValue);

        System.out.println(number++);
        System.out.println(number);

        //e mai folosita prima varianta varianta cu number++ se folosesc la loops


    }




}
