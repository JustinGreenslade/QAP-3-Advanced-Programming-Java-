package Problem4;

public class Ellipse extends Shape{
    protected double a; // major axis
    protected double b; // minor axis

    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        if (axis1 >= axis2) {
            a = axis1;
            b = axis2;
        } else {
            a = axis2;
            b = axis1;
        }
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (2 * (a * a + b * b) - Math.pow((a - b), 2)) / 2;
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public void scale(double factor) {
    a = a * factor;
    b = b * factor;
}

}
