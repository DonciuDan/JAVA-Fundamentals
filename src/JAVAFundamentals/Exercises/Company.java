package JAVAFundamentals.Exercises;

import java.time.LocalDate;
import java.time.Period;

public class Company {

    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public void printAllEmployess(){
        System.out.println("Lista cu angajatii este: ");
        for (int i=0; i<= employees.length-1; i++){
            System.out.println(employees[i]);
        }
    }
    public void showNumberOfEmployeesWithExperience(int years) {
        int numberOfEmployees = 0;
        for (Employee employee:employees) {
           if(Period.between(employee.getDateOfHirring(),LocalDate.now()).getYears() >= years){
               numberOfEmployees++;
           }
        }
        System.out.println("Numarul de angajati cu o vechime mai mare de " + years + " este: " + numberOfEmployees);
    }
}
