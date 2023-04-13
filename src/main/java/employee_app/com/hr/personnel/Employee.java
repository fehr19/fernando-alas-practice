package employee_app.com.hr.personnel;

import java.time.LocalDate;

public abstract class Employee {
    //Variables
    private String name;
    private LocalDate hireDate;

    //Constructors
    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    //Methods
    public abstract double computeMonthlyCompensation();

    public int computeNumberOfYearsWorkedSinceHired() {

        return LocalDate.now().getYear() - hireDate.getYear();
    }

    //Setters and Getters
    public abstract String getEmployeeInfo();

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
