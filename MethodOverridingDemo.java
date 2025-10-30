package Java_coding_challenges;

// Parent class
class $Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class $Dog extends $Animal {
    // Overriding the method from parent class
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Test class
public class MethodOverridingDemo {
    public static void main(String[] args) {

        // Parent class reference, parent object
        $Animal a1 = new $Animal();
        a1.makeSound(); // Calls Animal's method

        // Child class reference, child object
        $Dog d1 = new $Dog();
        d1.makeSound(); // Calls Dog's overridden method

        // Parent class reference, child object (Runtime Polymorphism)
        $Animal a2 = new $Dog();
        a2.makeSound(); // Calls Dog's overridden method (runtime)
    }
}
