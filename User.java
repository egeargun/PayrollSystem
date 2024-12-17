import java.util.List;
import java.util.Map;

public interface User {
    public void addEmployee(Map<String, Employee> employeeMap, Employee employee);




    // Method to update employee details
    public void updateEmployee(Map<String, Employee> employeeMap, String employeeId, Employee updatedEmployee);


    // Method to remove an employee
    public void removeEmployee(Map<String, Employee> employeeMap, String employeeId);



    // Method to process payroll for all employees
    public void processPayroll(List<Employee> employees);


}

