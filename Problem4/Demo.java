package Problem4;

public class Demo {
    // Static method to scale all shapes in the array
    public static void scaleAll(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println();
            Scalable[] shapes = new Scalable[4];
            shapes[0] = new Ellipse("Ellipse", 6.0, 4.0);
            shapes[1] = new Circle("Circle", 3.0);
            shapes[2] = new Triangle("Triangle", 3.0, 4.0, 5.0);
            shapes[3] = new EquilateralTriangle("Equal Triangle", 6.0);

            System.out.println("Before scaling:");
            for (Scalable s : shapes) {
                Shape shape = (Shape) s;
                System.out.println("Name: " + shape.getName() 
                    + ", Area: " + String.format("%.2f", shape.getArea()) 
                    + ", Perimeter: " + String.format("%.2f", shape.getPerimeter()));
            }

            System.out.println();

            scaleAll(shapes, 2.0); // Scale all shapes by factor 2

            System.out.println("After scaling:");
            for (Scalable s : shapes) {
                Shape shape = (Shape) s;
                System.out.println("Name: " + shape.getName() 
                    + ", Area: " + String.format("%.2f", shape.getArea()) 
                    + ", Perimeter: " + String.format("%.2f", shape.getPerimeter()));
            }

            System.out.println();

        } catch (IllegalArgumentException e) {
            System.out.println("Error creating shape: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
