package src.Section8;

public class CircleEx56 {
    public double radius;

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "AREA = " + String.format("%.2f", area()) + "\nCIRCUMFERENCE = " + String.format("%.2f", circumference());
    }
}
