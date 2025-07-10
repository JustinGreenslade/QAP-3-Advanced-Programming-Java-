package Problem2;

public class Demo {
    public static void main(String[] args) {
        try {
            // Create a Point object at (1.1, 2.2)
            Point point = new Point(1.1f, 2.2f);
            System.out.println(point);

            // Create a MovablePoint object at (3.3, 4.4) with speeds 0.5 and 1.0
            MovablePoint movablePoint = new MovablePoint(3.3f, 4.4f, 0.5f, 1.0f);
            System.out.println("Before move: " + movablePoint);

            // Move the movable point by its speed
            movablePoint.move();
            System.out.println("After move: " + movablePoint);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
