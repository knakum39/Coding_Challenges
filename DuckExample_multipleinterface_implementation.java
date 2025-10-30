package Java_coding_challenges;

// Step 1: Create first interface
interface Flyable {
    void fly();
}

// Step 2: Create second interface
interface Swimmable {
    void swim();
}

// Step 3: Implement both interfaces in Duck class
class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Duck is flying gracefully in the sky!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming smoothly in the pond!");
    }
}

//Strp 4 : Test class
public class DuckExample_multipleinterface_implementation
{
    public static void main(String[] args) {
        Duck duck = new Duck();

        // Calling methods from both interfaces
        duck.fly();
        duck.swim();

    }
}
