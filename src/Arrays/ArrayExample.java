package Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        int[] myIntArray = {5,10,43,54,12};

        for (int i = 0; i <= (myIntArray.length - 1); i++) { //asa parcurge crescator
            System.out.println("Elementul de pe pozitia " + i + " este: " + myIntArray[i]);
        }

        System.out.println("Media aritmetica a numerelor din array este: " + calculeAverageOf(myIntArray));

        //Vreau sa numar cate litere sunt in total in array
        String[] stringArray = {"sda", "azi", "Dan", "Donciu"};

        findHowManyCharactersAreInStringArray(stringArray);

    }

    static void findHowManyCharactersAreInStringArray(String[] words) {
        int sumOfCharacters = 0;
        for (int i = 0; i <= words.length - 1; i++) {
            sumOfCharacters = sumOfCharacters + words[i].length();

        }
        System.out.println("Numarul total de caractere este: " + sumOfCharacters);
    }

    static int calculeAverageOf (int[] numbersFromArray) { //void returneaza nimic din acest motiv trebuie int
        int sumOfArray = 0;
        for (int i = 0; i <= numbersFromArray.length - 1; i++) {
            sumOfArray = sumOfArray + numbersFromArray[i];

        }
        return sumOfArray / numbersFromArray.length;

    }
}



