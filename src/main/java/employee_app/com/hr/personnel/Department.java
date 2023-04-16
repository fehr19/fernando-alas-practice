package employee_app.com.hr.personnel;

import java.util.ArrayList;
import java.util.List;

public class Department {
    //Variables

    private String name;
    private String location;

    //private Employee[] employees = new Employee[100];
    //instead of Array, we will now use ArrayList
    private List<Employee> employees = new ArrayList<>();

    //Constructor
    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    //Methods
    //public void addEmployee(Employee employee) {employees[currentIndex++] = employee;}
    //Rewrite method to use ArrayList
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int workedResult = 0;
        for (Employee employee : employees) {
            int currentIndex = 0;
            String workedCounter = employees.get(currentIndex).work();
            if (workedCounter.contains("worked")) {
                workedResult++;
            }
            currentIndex++;
        }
        return workedResult;
    }


    // Compute total monthly compensation of all
    // employees in that department
    public double computeDepartmentMonthlyTotalCompensation() {
        double totalMonthlyCompensation = 0;
        int currentIndex = 0;
        for (Employee employee : employees) {
            totalMonthlyCompensation +=
                    employees.get(currentIndex).computeMonthlyCompensation();
            currentIndex++;
        }
        return totalMonthlyCompensation;
    }


    //Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}

