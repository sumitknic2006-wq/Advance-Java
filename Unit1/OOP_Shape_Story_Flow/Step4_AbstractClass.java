/* Abstract class: - Iska matlab hota hai zaroori details ko dikhana aur background details ko chupa dena (Hiding the implementation details and showing only functionality).
 */

// Step 4: Shape should not be instantiated
abstract class Shape {
    abstract void draw();

    abstract double area();
}

class Circle extends Shape {
    double r = 5;

    void draw() {
        System.out.println("Drawing Circle");
    }

    double area() {
        return Math.PI * r * r;
    }
}

public class Step4_AbstractClass {
    public static void main(String[] args) {

        Shape s = new Circle();

        s.draw();

        System.out.println("Area = " + s.area());
    }
}