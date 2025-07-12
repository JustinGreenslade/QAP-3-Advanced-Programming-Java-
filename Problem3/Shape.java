package Problem3;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // Method to calculate perimeter
    public abstract double getPerimeter();

    // Method to calculate area
    public abstract double getArea();

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
