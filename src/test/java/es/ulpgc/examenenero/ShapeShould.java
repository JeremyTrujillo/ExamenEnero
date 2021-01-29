package es.ulpgc.examenenero;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShapeShould {

    @Test
    void return_a_squares_area(){
        Shape shape = new Square(1);

        assertThat(shape.area()).isEqualTo(1.0);
    }
}
