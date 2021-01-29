package es.ulpgc.examenenero;

import java.math.BigDecimal;
import java.util.Objects;

import static java.math.RoundingMode.HALF_UP;

public class Rectangle extends Shape {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.base, base) == 0 &&
                Double.compare(rectangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), base, height);
    }
}
