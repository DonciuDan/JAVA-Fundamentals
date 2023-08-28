package JAVAFundamentals.Exercises;

import java.time.LocalDate;

public class MainExercitii {
    public static void main(String[] args) {
        Employee violeta = new Employee(5000, "Violeta", "violeta@yahoo.com", LocalDate.of(2020,12,06));
        System.out.println(violeta); // ca sa nu afiseze hashcodul pui to string in clasa respectiva
        Employee maria = new Employee(2000, "Maria Popescu", "mariapopescu@yahoo.com", LocalDate.of(2021,4,13));
        System.out.println(violeta);
        Employee radu = new Employee(2500, "Radu Ion", "i.radu@yahoo.com", LocalDate.of(2022,03,25));
        System.out.println(violeta);
        System.out.println("-------------------------------------------------------------------------------------");
        Company consultingSRL = new Company(new Employee[]{violeta,maria,radu});

        consultingSRL.printAllEmployess();
        System.out.println("-------------------------------------------------------------------------------------");
        consultingSRL.showNumberOfEmployeesWithExperience(2);
    }
}
