package Problem4;

public abstract class Shape implements Scalable {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // Method to calculate perimeter
    public abstract double getPerimeter();

    // Method to calculate area
    public abstract double getArea();

    // Method to scale the shape by a factor
    public abstract void scale(double factor);

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
