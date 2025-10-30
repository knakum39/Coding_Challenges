package Java_coding_challenges;

// Base class
class employee{
    protected String name;

    public employee(String name) {
        this.name = name;
    }

    // Method to calculate salary — will be overridden by subclasses
    public double calculateSalary(){
        return 0.0;
    }
}

// Subclass 1: Manager
class Manager extends employee{
    private double baseSalary;
    private double bonus;

    public Manager(String name, double baseSalary, double bonus){
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

@Override
    public double calculateSalary(){
        return baseSalary + bonus;
    }

}

// Subclass 2: Developer
class Developer extends employee {
    private double hourlyRate;
    private int hoursWorked;

    public Developer(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class to test
public class EmployeeHierarchy {
    public static void main(String[] args) {
        Manager manager = new Manager("Kri", 60000, 10000);
        Developer developer = new Developer("Ris", 50, 160);

        System.out.println("Manager Salary: " + manager.calculateSalary());
        System.out.println("Developer Salary: " + developer.calculateSalary());
    }
}
