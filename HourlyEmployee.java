public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    public HourlyEmployee(String id, String name, String email, double hourlyRate, int hoursWorked) {
        super(id, name, email);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Getters and Setters
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Overriding calculatePay method
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() + ", Hourly Rate=" + hourlyRate + ", Hours Worked=" + hoursWorked;
    }
}

