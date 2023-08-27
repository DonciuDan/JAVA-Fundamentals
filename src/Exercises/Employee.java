package Exercises;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {

    private LocalDate dateOfHirring;
    private String mailOfEmployee;
    private String nameOfEmployee;
    private int salary;

    public Employee(int salary, String nameOfEmployee, String mailOfEmployeeFromUser, LocalDate dateOfHirring) {
        this.salary = salary;
        this.nameOfEmployee = nameOfEmployee;
        this.dateOfHirring = dateOfHirring;
        if (isMailValid(mailOfEmployeeFromUser)) {
            this.mailOfEmployee = mailOfEmployeeFromUser;
        } else {
            System.out.println("Email invalid");
        }

    }

    private boolean isMailValid(String mail) {
        Pattern pattern = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(mail);
        return matcher.matches();
    }

    @Override
    public String toString() { //scrii direct toString si iti da sa alegi si alegi via wizard
        return "Employee{" +
                "dateOfHirring=" + dateOfHirring +
                ", mailOfEmployee='" + mailOfEmployee + '\'' +
                ", nameOfEmployee='" + nameOfEmployee + '\'' +
                ", salary=" + salary +
                '}';
    }

    public LocalDate getDateOfHirring () {
        return dateOfHirring;
    }
}
