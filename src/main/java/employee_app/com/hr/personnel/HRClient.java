package employee_app.com.hr.personnel;

import java.time.LocalDate;
import java.util.Arrays;

public class HRClient {
    public static void main(String[] args) {
        Employee employee1 = new SalariedEmployee("Com Truise",
                LocalDate.of(2020, 3, 22), 7000);
        Employee employee2 = new SalariedEmployee("San Holo",
                LocalDate.of(2015, 7, 28), 5000);
        Employee employee3 = new HourlyEmployee("Dopple Ganger",
                LocalDate.of(2017, 9, 07), 160, 20);


        employee1.computeMonthlyCompensation();

        System.out.println(employee1.getEmployeeInfo());
        System.out.println("Years at company: " + employee1.computeNumberOfYearsWorkedSinceHired());
        System.out.println(employee2.getEmployeeInfo());
        System.out.println("Years at company: " + employee2.computeNumberOfYearsWorkedSinceHired());
        System.out.println(employee3.getEmployeeInfo());
        System.out.println("Years at company: " + employee3.computeNumberOfYearsWorkedSinceHired());

        Department department = new Department("Sales", "Remote");

        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);


        int jj = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();

        System.out.println("Total Number of Employees in " + department.getName() + ": " + jj);
        System.out.printf("Total department monthly salary: " + "$%, .2f",
                department.computeDepartmentMonthlyTotalCompensation());





    }
}
