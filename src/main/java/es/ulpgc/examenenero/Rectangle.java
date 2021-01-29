package es.ulpgc.examenenero;

public class Rectangle implements Shape {
    private final double base;
    private final double height;

    public Rectangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 2;
    }
}
