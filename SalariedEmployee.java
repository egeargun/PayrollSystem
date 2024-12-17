public class SalariedEmployee extends Employee {
    private double monthlySalary;

    // Constructor
    public SalariedEmployee(String id, String name, String email, double monthlySalary) {
        super(id, name, email);
        this.monthlySalary = monthlySalary;
    }

    // Getters and Setters
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    // Overriding calculatePay method
    @Override
    public double calculatePay() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Monthly Salary=" + monthlySalary;
    }
}

