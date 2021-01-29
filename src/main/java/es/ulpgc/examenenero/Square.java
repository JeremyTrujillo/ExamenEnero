package es.ulpgc.examenenero;

import java.math.BigDecimal;
import java.util.Objects;

import static java.math.RoundingMode.HALF_UP;

public class Square extends Shape {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }
}
