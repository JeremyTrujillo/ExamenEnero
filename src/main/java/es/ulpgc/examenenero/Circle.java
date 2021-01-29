package es.ulpgc.examenenero;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_UP;

public class Circle implements Shape {

    private final double radio;

    public Circle(double radio) {
        super();
        this.radio = radio;
    }

    @Override
    public double area() {
        double area = Math.PI * radio * radio;
        BigDecimal bigDecimal = BigDecimal.valueOf(area).setScale(2, HALF_UP);
        return bigDecimal.doubleValue();
    }
}
