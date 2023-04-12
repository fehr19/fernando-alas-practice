package employee_app.com.hr.personnel;

public class Department {
    //Variables
    int currentIndex = 0;
    private String name;
    private String location;
    private Employee[] employees = new Employee[100];

    //Constructor
    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    //Methods
    public void addEmployee(Employee employee) {
        employees[currentIndex++] = employee;
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int workedResult = 0;
        for (int i = 0; i <= currentIndex; i++) {
            if (employees[i] != null) {
                String workedCounter = employees[i].work();
                if (workedCounter.contains("worked")) {
                    workedResult++;
                }
            }
        }
        return workedResult;
    }

    // Compute total monthly compensation of all
    // employees in that department
    public double computeDepartmentMonthlyTotalCompensation() {
        double totalMonthlyCompensation = 0;
        for (int i = 0; i < currentIndex; i++) {
            totalMonthlyCompensation +=
                    employees[i].computeMonthlyCompensation();

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

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }
}

