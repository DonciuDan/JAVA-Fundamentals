package Arrays;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] tabel = new int[3][3];
        tabel[0][0] = 5;
        tabel[1][2] = 7;

        System.out.println(tabel[1][2]);
        System.out.println();
        System.out.println(tabel[0][2]); //la cifre nu o sa apara null in consola, o sa apara cu 0
        System.out.println();

        tabel[2] = new int[]{6, 2, 10};
        System.out.println(tabel[2][1]);

        System.out.println("___________________");

        //poti sa pui si doar nr de linii fara sa ii zici cate coloane si sa le definestie dupa
//        String[][] myArray = new String[2][];
//        myArray[0] = new String[]{"Alice", "has", "the", "cat"}; // creating the first row (index number 0)
//        myArray[1] = new String[]{"The", "cat", "has", "Alice"};

        for (int i = 0; i <= (tabel.length - 1); i++) {
            for (int j = 0; j <= (tabel[i].length - 1); j++) {
                System.out.print(tabel[i][j] + " ");

            }
            System.out.println();


        }
        System.out.println("___________________");

        //  String [][] tabelsWords = {}; - asa o sa aiba 0 valori

        String[][] tabelsWords = {{"math", "english", "info"}, {"Ion", "Maria"}, {"ala", "bala", "porto", "cala"}}; //array neregulat

        for (int i = 0; i < tabelsWords.length; i++) {
            for (int j = 0; j < tabelsWords[i].length; j++) {
                System.out.print(tabelsWords[i][j] + " ");

            }
            System.out.println();

        }

        System.out.println("___________________");
        printLastLetterFromEachElementOfArray(tabelsWords);


    }

    static void printLastLetterFromEachElementOfArray(String[][] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                System.out.print(words[i][j].charAt(words[i][j].length() - 1) + " ");
            }
            System.out.println();
        }
    }
}
