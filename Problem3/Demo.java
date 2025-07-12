package Problem3;

public class Demo {
    public static void main(String[] args) {
        try {
            Shape[] shapes = new Shape[4];

            shapes[0] = new Ellipse("Oval", 6.0, 4.0);
            shapes[1] = new Circle("Circle", 3.0);
            shapes[2] = new Triangle("Triangle", 3.0, 4.0, 5.0);
            shapes[3] = new EquilateralTriangle("Equal Triangle", 6.0);

            for (Shape s : shapes) {
                System.out.println("Name: " + s.getName() + ": Area = " + String.format("%.1f", s.getArea()) + ", Perimeter = " + String.format("%.1f", s.getPerimeter()));
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error creating shape: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

