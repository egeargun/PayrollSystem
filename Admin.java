import java.util.List;
import java.util.Map;

public class Admin implements User {
    private String adminId;
    private String name;
    private String email;

    // Constructor
    public Admin(String adminId, String name, String email) {
        this.adminId = adminId;
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Method to add a new employee to the system
    public void addEmployee(Map<String, Employee> employeeMap, Employee employee) {
        if (!employeeMap.containsKey(employee.getId())) {
            employeeMap.put(employee.getId(), employee);
            System.out.println("Employee added successfully: " + employee.getName());
        } else {
            System.out.println("Employee with ID " + employee.getId() + " already exists.");
        }
    }

    // Method to update employee details
    public void updateEmployee(Map<String, Employee> employeeMap, String employeeId, Employee updatedEmployee) {
        if (employeeMap.containsKey(employeeId)) {
            employeeMap.put(employeeId, updatedEmployee);
            System.out.println("Employee details updated successfully for ID: " + employeeId);
        } else {
            System.out.println("Employee with ID " + employeeId + " not found.");
        }
    }

    // Method to remove an employee
    public void removeEmployee(Map<String, Employee> employeeMap, String employeeId) {
        if (employeeMap.containsKey(employeeId)) {
            employeeMap.remove(employeeId);
            System.out.println("Employee removed successfully with ID: " + employeeId);
        } else {
            System.out.println("Employee with ID " + employeeId + " not found.");
        }
    }

    // Method to process payroll for all employees
    public void processPayroll(List<Employee> employees) {
        for (Employee employee : employees) {
            double pay = employee.calculatePay();
            System.out.println("Processed payroll for " + employee.getName() + ": $" + pay);
        }
    }

}



