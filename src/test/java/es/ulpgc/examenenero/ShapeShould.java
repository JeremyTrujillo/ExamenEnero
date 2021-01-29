package es.ulpgc.examenenero;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShapeShould {

    @Test
    void return_a_squares_area(){
        // GIVEN
        Shape shape = new Square(1);

        // WHEN + THEN
        assertThat(shape.area()).isEqualTo(1);
    }

    @Test
    void return_a_bigger_squares_area(){
        // GIVEN
        Shape shape = new Square(2);

        // WHEN + THEN
        assertThat(shape.area()).isEqualTo(4);
    }
}
