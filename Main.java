import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create employees
        Employee emp1 = new SalariedEmployee("E001", "Kaan", "kaan@example.com", 5000);
        Employee emp2 = new HourlyEmployee("E002", "Zeynep", "zeynep@example.com", 20, 160);

        // Store employees in a list
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);

        // Display employee details and calculate pay
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("Pay: $" + employee.calculatePay());
            System.out.println("-------------");
        }
    }
}

