package Others;

// Abstract class
abstract class Shape {
    // Abstract method
    public abstract void draw();

    // Regular method
    public void display() {
        System.out.println("Displaying shape");
    }
}

// Concrete subclass extending abstract class
class Circle extends Shape {
    // Implementing abstract method
    public void draw() {
        System.out.println("Drawing circle");
    }
}

public class Main {
    public static void main(String[] args) {
        // Cannot instantiate abstract class directly
        // Shape shape = new Shape(); // This will give an error

        // Creating object of concrete subclass
        Shape circle = new Circle();
        circle.draw(); // Output: Drawing circle
        circle.display(); // Output: Displaying shape
    }
}
