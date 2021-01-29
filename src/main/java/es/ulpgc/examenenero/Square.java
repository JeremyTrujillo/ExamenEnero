package es.ulpgc.examenenero;

public class Square implements Shape {
    double side;

    public Square(double side) {
        super();
        this.side = side;
    }

    public double area() {
        return side*side;
    }
}
