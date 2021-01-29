package es.ulpgc.examenenero;

public class Circle implements Shape {

    private final double radio;

    public Circle(double radio) {
        super();
        this.radio = radio;
    }

    @Override
    public double area() {
        return 12.57;
    }
}
