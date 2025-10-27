package Java_coding_challenges;

public class Employee {
    // ✅ Private attributes (data hiding)
    private int id;
    private String name;
    private double salary;

    // ✅ Constructor (optional)
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // ✅ Getter and Setter methods for each field

    public int getId() {
        return id;
    }

    public void setId(int id) {
        // You can add validation here (e.g., id > 0)
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Add validation if needed
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        // Add validation to prevent negative salary
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // ✅ Optional: method to display employee info
    public void displayEmployeeDetails() {
        System.out.println("----- Employee Details -----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println();
    }

    // ✅ Example main method to test encapsulation
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Rishabh", 55000);
        emp1.displayEmployeeDetails();

        // Update fields using setters
        emp1.setSalary(60000);
        emp1.setName("Rishabh Sharma");

        // Access fields using getters
        System.out.println("Updated Name: " + emp1.getName());
        System.out.println("Updated Salary: $" + emp1.getSalary());
    }
}
