package Java8Features.Streams;

import java.util.Random;

public class Employee {
    String employeeName;
    int employeeNumber;

    Random random = new Random();

    public Employee(String name){
        this.employeeName = name;
        this.employeeNumber = random.nextInt();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
}
