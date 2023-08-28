package JAVAFundamentals.Arrays;

public class ArrayItereation {
    public static void main(String[] args) {
        int[] myIntArray = {5,10,43,54,12};

        for (int i = 0; i <= (myIntArray.length - 1); i++) { //asa parcurge crescator
            System.out.println("Elementul de pe pozitia " + i + " este: " + myIntArray[i]);
        }
        System.out.println();

        for (int i = (myIntArray.length - 1); i >= 0; i--) { //asa parcurge descrescator
            System.out.println("Elementul de pe pozitia " + i + " este: " + myIntArray[i]);
        }

    }
}
