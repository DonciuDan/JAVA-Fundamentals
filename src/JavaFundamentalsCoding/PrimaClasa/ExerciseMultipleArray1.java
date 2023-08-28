package JavaFundamentalsCoding.PrimaClasa;

public class ExerciseMultipleArray1 {
    public static void main(String[] args) {
        //        ExerciseArrays exerciseArrays = new ExerciseArrays();
//        exerciseArrays.gradeStudents();
        //multidimensional arrays
        String [][][] matrix = new String[3][3][1];
        matrix[0][0][0] =  "Hello";
        matrix[0][1][0]  = "World";
        matrix[0][2][0]  = "Java";
        matrix[1][0][0]  = "Programming";
        matrix[1][1][0]  = "is";
        matrix[1][2][0]  = "fun";
        matrix[2][0][0]  = "I";
        matrix[2][1][0]  = "love";
        matrix[2][2][0]  = "it";
        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(“Row " + i);
            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.println(“Column " + j);
                System.out.print(" ");
                for (int k = 0; k < matrix[i][j].length; k++) {
//                    System.out.println(“Depth " + k);
                    System.out.print(matrix[i][j][k]);
                }
                System.out.print(" ");
            }
            System.out.print("");
        }
    }
} // tridim array
        

