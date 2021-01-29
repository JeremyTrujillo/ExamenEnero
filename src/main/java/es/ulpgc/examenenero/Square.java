package es.ulpgc.examenenero;

public class Square implements Shape {
    int side;

    public Square(int side) {
        super();
        this.side = side;
    }

    public double area() {
        return 1.0;
    }
}
