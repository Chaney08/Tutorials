package Java8Features.Streams.ParallelStreams;

import java.util.Random;

public class Employee {
    String employeeName;
    double employeeSalary;

    Random random = new Random();

    public Employee(String name,double salary){
        this.employeeName = name;
        this.employeeSalary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}
