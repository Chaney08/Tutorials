package Java8Features.Streams;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String args[]){

        ArrayList<Employee> employeeList = new ArrayList<>();
        Stream<Integer> employeeNum = Stream.of(1, 2,3,4,5,6,7);

        employeeNum.forEach(x -> employeeList.add(new Employee("Name" + x)));

        employeeList.forEach(x-> System.out.println(x.getEmployeeName()));

        long totalEmployees = employeeList.stream()
                .filter(x-> !x.employeeName.isEmpty())
                .count();

        long totalEmployeesWithoutFilter = employeeList.stream()
                .count();

        employeeList.forEach(x -> System.out.println(x.getEmployeeNumber()));
        long totalEmployeesWithModulasFilter = employeeList.stream()
                .filter(x -> x.getEmployeeNumber() % 2 == 1)
                .count();

        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Total Employees without filter: " + totalEmployeesWithoutFilter);
        System.out.println("Total Employees with Modulas filter: " + totalEmployeesWithModulasFilter);

    }
}
