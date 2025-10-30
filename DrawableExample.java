package Java_coding_challenges;

// Step 1: Create interface
interface Drawable {
    void draw(); // abstract method
}

// Step 2: Implement Drawable in Circle class
class $Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Step 3: Implement Drawable in Rectangle class
class $Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Step 4: Test in main class
public class DrawableExample {
    public static void main(String[] args) {
        Drawable circle = new $Circle();
        Drawable rectangle = new $Rectangle();

        // Call draw() method for each
        circle.draw();
        rectangle.draw();
    }
}
