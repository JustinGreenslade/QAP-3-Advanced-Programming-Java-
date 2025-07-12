package Problem2;

public class Demo {
    public static void main(String[] args) {
        try {
            System.out.println();

            // My First Point
            Point point1 = new Point(0.0f, 0.0f);
            System.out.println("My First Point created at: " + point1);
            point1.setX(9.0f);
            point1.setY(-3.0f);
            System.out.println("After updating x and y: (" + point1.getX() + ", " + point1.getY() + ")");
            System.out.println();

            // My Second Point
            Point point2 = new Point(-5.0f, 7.0f);
            System.out.println("My Second Point created at: " + point2);
            point2.setXY(3.0f, 2.0f);
            float[] coords = point2.getXY();
            System.out.println("After using setXY: (" + coords[0] + ", " + coords[1] + ")");
            System.out.println();
            // My First MovablePoint
            MovablePoint movable1 = new MovablePoint(0.0f, 0.0f);
            System.out.println("My First MovablePoint at: " + movable1);
            movable1.setXSpeed(1.0f);
            movable1.setYSpeed(-2.0f);
            System.out.println("After setting speed: Speed = (" + movable1.getXSpeed() + ", " + movable1.getYSpeed() + ")");
            movable1.move();
            System.out.println("After move: " + movable1);
            System.out.println();

            // My Second MovablePoint
            MovablePoint movable2 = new MovablePoint(0.0f, 0.0f, 0.0f, 0.0f);
            System.out.println("My Second MovablePoint at: " + movable2);
            movable2.setSpeed(-1.0f, -7.0f);
            System.out.println("After updating speed: Speed = (" + movable2.getXSpeed() + ", " + movable2.getYSpeed() + ")");
            movable2.move();
            System.out.println("After move: " + movable2);
            System.out.println();

            // My Third MovablePoint
            MovablePoint movable3 = new MovablePoint(3.0f, -2.0f, -4.0f, 7.0f);
            System.out.println("My Third MovablePoint at: " + movable3);
            float[] speed3 = movable3.getSpeed();
            System.out.println("Speed from getSpeed(): X = " + speed3[0] + ", Y = " + speed3[1]);
            movable3.move();
            System.out.println("After move: " + movable3);
            System.out.println();
            
        } catch (Exception e) {
            System.out.println("Oops! Something went wrong:");
            e.printStackTrace();
        }
    }
}
