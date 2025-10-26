package Java_coding_challenges;

/*Person Class Implementation
Create a class "Person" with attributes "name" and "age". Create two instances and print their details.*/


public class Main {
    public static void main(String[] args) {
        // Create two Person instances
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Print details
        person1.printDetails();
        person2.printDetails();
    }
}

class Person {
    // Attributes
    String name;
    int age;

    //Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    // Method to print details
    void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

