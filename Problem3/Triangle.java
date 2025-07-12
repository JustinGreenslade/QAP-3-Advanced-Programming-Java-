package Problem3;

public class Triangle extends Shape {
    protected double side1, side2, side3;

    public Triangle(String name, double s1, double s2, double s3) {
        super(name);
        if (s1 + s2 > s3 && s2 + s3 > s1 && s3 + s1 > s2) {
            side1 = s1;
            side2 = s2;
            side3 = s3;
        } else {
            throw new IllegalArgumentException("Invalid triangle sides.");
        }
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
