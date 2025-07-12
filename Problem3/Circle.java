package Problem3;

public class Circle extends Ellipse {
    public Circle(String name, double radius) {
        super(name, radius, radius); // Circle is a special case of ellipse
    }

    @Override
    public double getArea() {
        return Math.PI * a * a;  // a is the radius
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * a;
    }
}
