package JAVAFundamentals.Arrays;

public class ArraysDeclarationAndIntialization {
    public static void main(String[] args) {
        String[] myStringArray = new String[5]; //string - prin asta setez elementele din cutii sa fie stringuri
        //tot timpul porneste de la 0  la cutii/elemente/index
        myStringArray[0] = "SDA"; //am setat string doar asta putem pune la elemente
        //am ales indexul/cutia 0 si acolo punem "SDA"
        myStringArray[4] = "Curs";//ultima pozitie e cu 1 mai mic decat cel setat in new
        myStringArray[1] = "Dan";
        myStringArray[1] = myStringArray[1].concat(" Donciu");

        System.out.println("Elementul de pe pozitia 0 este: " + myStringArray[0]);
        System.out.println("Elementul de pe pozitia 0 este: " + myStringArray[1]);
        System.out.println("Elementul de pe pozitia 0 este: " + myStringArray[2]);
        System.out.println("Elementul de pe pozitia 0 este: " + myStringArray[3]);
        System.out.println("Elementul de pe pozitia 0 este: " + myStringArray[4]);

        System.out.println();

        System.out.println(myStringArray[1].length());
        System.out.println();
        //cand nu ai nimic in cutie o sa apara in consola null
        //cand ai un index cu valoarea null si pui orice metoda (ex:"toLowerCase") va da eroarea NullPointerException


        String[] secondStringArray = new String[]{"SDA", "Dan", "Hello", "10", "Duminica"}; //asa e mai bine sa il faci cand stii ce elemente vrei sa contina elementele
        String[] thirdStringArray = {"SDA", "Dan", "Hello", "10", "Duminica"}; //o varianta mai scurta
        System.out.println(secondStringArray[2]);
        System.out.println();

        int[] intArray = {5, -1, 32, 41, 532};
        intArray[2] = intArray[2] + 1; //update si chiar si operatie
        System.out.println(intArray[2]);
        System.out.println();
        if (myStringArray[2] != null) { //daca vrei sa te asiguri ca nu iti apare nullexception
            System.out.println(myStringArray[2].toUpperCase());
        }
        //la array cu boolean in loc de null va da false

        //System.out.println(intArray[5]);
        //.ArrayIndexOutOfBoundsException asta o sa dea cand vrei sa printezi un index in afara array-urlui

        System.out.println(intArray.length - 1); // sa aflu nr ultimului index
        System.out.println();
        System.out.println(intArray[intArray.length - 1]); // sa afiseze ultimul elem pe care l-am pus

    }
}
