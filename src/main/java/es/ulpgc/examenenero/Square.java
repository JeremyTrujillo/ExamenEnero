package es.ulpgc.examenenero;

public class Square implements Shape {

    private final double side;

    public Square(double side) {
        super();
        this.side = side;
    }

    public double area() {
        return side*side;
    }
}
