package es.ulpgc.examenenero;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_UP;

public class Square implements Shape {
    private final double side;

    public Square(double side) {
        super();
        this.side = side;
    }

    public double area() {
        double area = side * side;
        BigDecimal bigDecimal = BigDecimal.valueOf(area).setScale(2, HALF_UP);
        return bigDecimal.doubleValue();
    }
}
