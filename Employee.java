    public abstract class Employee {
    private String id;
    private String name;
    private String email;

    // Constructor
    public Employee(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    // Abstract method to be implemented by subclasses
    public abstract double calculatePay();

    // Overriding toString method for better representation
    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Email=" + email + "]";
    }
}


