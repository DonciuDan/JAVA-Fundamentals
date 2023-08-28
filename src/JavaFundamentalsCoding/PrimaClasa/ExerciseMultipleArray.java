package JavaFundamentalsCoding.PrimaClasa;

public class ExerciseMultipleArray {
    public static void main(String[] args) {


        int[][] matrix = new int[3][3];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 2;

        matrix[1][0] = 3;
        matrix[1][1] = 4;
        matrix[1][2] = 5;

        matrix[2][0] = 6;
        matrix[2][1] = 7;
        matrix[2][2] = 8;


        for (
                int i = 0;
                i < matrix.length; i++) {
            System.out.println("Row " + i);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        } // put all this code in psvm shortcut
    }
}
