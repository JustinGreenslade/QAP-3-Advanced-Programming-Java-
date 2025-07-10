package Problem2;

public class MovablePoint extends Point {
    // Speed of movement along the x axis
    private float xSpeed = 0.0f;
    // Speed of movement along the y axis
    private float ySpeed = 0.0f;

    // Constructor to set position and speed
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // Call the parent class constructor to set x and y
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Constructor that takes speeds only, position defaults to (0,0)
    public MovablePoint(float xSpeed, float ySpeed) {
        super(0.0f, 0.0f);  // position at origin
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Default constructor
    public MovablePoint() {
    }
    
    // Get the speed along x axis
    public float getXSpeed() {
        return xSpeed;
    }

    // Set the speed along x axis
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    // Get the speed along y axis
    public float getYSpeed() {
        return ySpeed;
    }

    // Set the speed along y axis
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Set both speeds
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Get both speeds as an array
    public float[] getSpeed() {
        return new float[] { xSpeed, ySpeed };
    }

    // Return string showing position and speed
    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "), Speed = (" + xSpeed + "," + ySpeed + ")";
    }
    

        // Move the point by adding speed to current position
        public void move() {
            setX(getX() + xSpeed);
            setY(getY() + ySpeed);
        }
}
