package JavaFundamentalsCoding.PrimaClasa;

import java.util.Scanner;

public class ExerciseArrays {
    public static void main(String[] args) {

        float[] grades = {8, 7, 4, 9, 6.5f};
        String[] students = {"John", "Paul", "George", "Ringo", "Max"};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " has a grade of " + grades[i]);
        }
        System.out.println("---------------------------------------------------------");

        ExerciseArrays exerciseArrays = new ExerciseArrays();
        exerciseArrays.gradeStudents();

    }

    public void gradeStudents() {
        int[] newGrades = new int[5];
        Scanner scanner = new Scanner(System.in);
        String[] newStudents = {"John", "Paul", "George", "Ringo", "Max"};


        for (int i = 0; i < newStudents.length; i++) {
            System.out.println("Please grade student " + newStudents[i]);
            do {
                try {
                    newGrades[i] = scanner.nextInt();
                    if (newGrades[i] < 1 || newGrades[i] > 10) {
                        System.out.println("Invalid grade! Please enter a grade between 1 and 10");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid grade! Please enter a grade between 1 and 10");
                    newGrades[i] = 0;
                    scanner.nextLine();
                }


            } while (newGrades[i] < 1 || newGrades[i] > 10);

        }
        boolean allStudentsPassed = true;
        for (int i = 0; i < newStudents.length; i++) {
            System.out.println("Student " + newStudents[i] + " has grade " + newGrades[i]);
            if (newGrades[i] < 5) {
                allStudentsPassed = false;
            }
        }
        if (allStudentsPassed) {
            System.out.println("All Students passed!");

        } else {
            System.out.println("Not all students passed!We need to work harder!");
        }
    }


}
