package es.ulpgc.examenenero;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShapeShould {

    @Test
    void return_area_of_a_square(){
        // GIVEN
        Shape shape = new Square(1);

        // WHEN + THEN
        assertThat(shape.area()).isEqualTo(1);
    }

    @Test
    void return_area_of_another_square(){
        // GIVEN
        Shape shape = new Square(2);

        // WHEN + THEN
        assertThat(shape.area()).isEqualTo(4);
    }

    @Test
    void return_area_of_a_rectangle(){
        // GIVEN
        Shape shape = new Rectangle(2,1);

        // WHEN + THEN
        assertThat(shape.area()).isEqualTo(2);
    }

    @Test
    void return_area_of_another_rectangle(){
        // GIVEN
        Shape shape = new Rectangle(3,2);

        // WHEN + THEN
        assertThat(shape.area()).isEqualTo(6);
    }

    @Test
    void return_area_of_a_triangle(){
        // GIVEN
        Shape shape = new Triangle(3,2);

        // WHEN + THEN
        assertThat(shape.area()).isEqualTo(3);
    }

}
