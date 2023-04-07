package exercises.inheritance_test;

import employee_app.com.hr.personnel.Employee;

class Employee1 {
    String getName() {
        return null;
    }

}

class SalariedEmployee1 extends Employee1 {
    private double getMonthlySalary() {
        return 50;
    }

}

public class testCode {


    public static void main(String[] args) {

        Employee1 employee1 = new SalariedEmployee1();
        String name = employee1.getName();
        //double salary = employee.getMonthlySalary();
        //Employee object does not possess method in SalariedEmployee
    }

}


