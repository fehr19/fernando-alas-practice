package employee_app.com.hr.personnel;

import java.time.LocalDate;

public class Employee {
    //Variables
    private String name;
    private LocalDate hireDate;

    //Constructors
    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    //Methods
    public double computeMonthlyCompensation() {

        return 0.0;
    }

    public int computeNumberOfYearsWorkedSinceHired() {

        return LocalDate.now().getYear() - hireDate.getYear();
    }

    //Setters and Getters
    public String getEmployeeInfo() {
        return "Name = " + name + " - " + "Hire Date = " + hireDate;
    }

    public String work() {
        return name + " worked.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}
