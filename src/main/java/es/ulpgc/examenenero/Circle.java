package es.ulpgc.examenenero;

import java.math.BigDecimal;
import java.util.Objects;

import static java.math.RoundingMode.HALF_UP;

public class Circle extends Shape {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radio, radio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radio);
    }
}
