/* Interface ek tarah ka contract ya blueprint hota hai, jo sirf yeh batata hai ki class ko kya karna chahiye (What to do), par yeh nahi batata ki kaise karna hai (How to do).

interface Keyword: Ise banane ke liye class ki jagah interface keyword ka use hota hai.
implements Keyword: Koi class jab interface ko use karti hai, toh extends ki jagah implements keyword likhti hai.
Methods: Iske saare methods by default public aur abstract hote hain (bina body ke).
Variables: Iske saare variables by default public, static, aur final hote hain (unhe badla nahi ja sakta). 
No Object: Abstract class ki tarah, interface ka bhi object nahi ban sakta. */

interface Rotatable {
    void rotate();
}

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape implements Rotatable {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void rotate() {
        System.out.println("Rotating Circle");
    }
}

public class Step5_Interface {
    public static void main(String[] args) {

        // Shape reference (Runtime Polymorphism)
        Shape s = new Circle();
        s.draw();

        // Interface reference
        Rotatable r = new Circle();
        r.rotate();

        // Direct Object
        Circle c = new Circle();
        c.draw();
        c.rotate();
    }
}