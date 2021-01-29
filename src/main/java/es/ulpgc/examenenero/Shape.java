package es.ulpgc.examenenero;

public abstract class Shape implements Comparable<Shape>{
    public abstract double area();

    @Override
    public int compareTo(Shape shape) {
        return Double.compare(this.area(),shape.area());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
