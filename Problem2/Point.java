package Problem2;

public class Point {
    // x coordinate starts at 0.0f
    private float x = 0.0f;
    // y coordinate starts at 0.0f
    private float y = 0.0f;


    // Constructor to set x and y to given values
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Default constructor sets x and y to 0.0f by default
    public Point() {
    }


    // Get the x value
    public float getX() {
        return x;
    }

    // Set the x value
    public void setX(float x) {
        this.x = x;
    }

    // Get the y value
    public float getY() {
        return y;
    }

    // Set the y value
    public void setY(float y) {
        this.y = y;
    }

    // Sets both x and y coordinates
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Returns both x and y coordinates as an array
    public float[] getXY() {
        return new float[]{x, y};
    }

    // Return a string showing the point as (x, y)
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
