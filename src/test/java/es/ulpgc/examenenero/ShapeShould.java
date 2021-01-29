package es.ulpgc.examenenero;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ShapeShould {

    @Test
    void return_area_of_a_square(){
        // GIVEN
        Shape square1 = new Square(1);
        Shape square2 = new Square(2);

        // WHEN + THEN
        assertThat(square1.area()).isEqualTo(1);
        assertThat(square2.area()).isEqualTo(4);
    }

    @Test
    void sort_squares_based_on_their_area(){
        // GIVEN
        List<Shape> shapes = new ArrayList<>();
        Square square1 = new Square(2);
        Square square2 = new Square(3);
        Square square3 = new Square(1);
        shapes.add(square1);
        shapes.add(square2);
        shapes.add(square3);

        // WHEN
        Collections.sort(shapes);

        // THEN
        assertThat(shapes.get(0)).isEqualTo(square3);
        assertThat(shapes.get(1)).isEqualTo(square1);
        assertThat(shapes.get(2)).isEqualTo(square2);
    }

    @Test
    void return_area_of_a_rectangle(){
        // GIVEN
        Shape rectangle1 = new Rectangle(2,1);
        Shape rectangle2 = new Rectangle(3,2);

        // WHEN + THEN
        assertThat(rectangle1.area()).isEqualTo(2);
        assertThat(rectangle2.area()).isEqualTo(6);
    }

    @Test
    void return_area_of_a_triangle(){
        // GIVEN
        Shape triangle1 = new Triangle(3,2);
        Shape triangle2 = new Triangle(4,4);

        // WHEN + THEN
        assertThat(triangle1.area()).isEqualTo(3);
        assertThat(triangle2.area()).isEqualTo(8);
    }

    @Test
    void return_area_of_a_circle(){
        // GIVEN
        Shape circle1 = new Circle(2);
        Shape circle2 = new Circle(3);

        // WHEN + THEN
        assertThat(circle1.area()).isEqualTo(12.57);
        assertThat(circle2.area()).isEqualTo(28.27);

    }
}
