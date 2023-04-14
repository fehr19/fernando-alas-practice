package employee_app.com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    //Variables
    private double hoursWorked;
    private double hourlyRate;

    //Constructor
    public HourlyEmployee(String name, LocalDate hireDate,
                          double hoursWorked, double hourlyRate) {
        super(name, hireDate);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    //Methods
    @Override
    public double computeMonthlyCompensation() {
        return hoursWorked * hourlyRate;
    }

    @Override
    //TODO finish logic here, need to add more return values
    public String getEmployeeInfo() {
        return "Name = " + getName()
                + " - " + "Hire Date = "
                + getHireDate();

    }

    //Setters and Getters
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
