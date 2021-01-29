package es.ulpgc.examenenero;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_UP;

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
        double area = base * height;
        BigDecimal bigDecimal = BigDecimal.valueOf(area).setScale(2, HALF_UP);
        return bigDecimal.doubleValue();

    }
}
