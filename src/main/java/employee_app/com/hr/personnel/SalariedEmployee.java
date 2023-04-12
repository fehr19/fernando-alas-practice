package employee_app.com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    //Variables
    private double monthlySalary;

    //Constructor
    public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary) {
        super(name, hireDate);
        this.monthlySalary = monthlySalary;
    }

    //Methods
    @Override
    public double computeMonthlyCompensation() {

        return monthlySalary;
    }

    //Setters and Getters
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
