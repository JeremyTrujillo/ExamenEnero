package es.ulpgc.examenenero;

import org.junit.jupiter.api.Test;

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
}
