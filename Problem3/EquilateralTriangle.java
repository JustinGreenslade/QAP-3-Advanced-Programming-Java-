package Problem3;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side); // All sides equal
    }

    @Override
    public String toString() {
        return "EquilateralTriangle: " + super.toString();
    }
}
