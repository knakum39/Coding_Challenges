package Java_coding_challenges;

import static java.lang.Math.PI;

// ✅ Abstract class
abstract class Shape {
    // Abstract method (no body)
    abstract double getArea();
}

// ✅ Rectangle subclass
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement abstract method
    @Override
    double getArea() {
        return length * width;
    }
}

// ✅ Circle subclass
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement abstract method
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

// ✅ Main class to test
public class ShapeTest {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        Shape circle = new Circle(7);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Circle Area: " + circle.getArea());
    }
}