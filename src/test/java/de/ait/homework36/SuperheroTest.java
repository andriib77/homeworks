package de.ait.homework36;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperheroTest {

    private Superhero superhero;

    @BeforeEach
    void setUp() {
        superhero = new Superhero("Superman", 10, 30);
    }

    @Test
    void testGetters() {
        assertEquals("Superman", superhero.getName());
        assertEquals(10, superhero.getPower());
        assertEquals(30, superhero.getAge());
    }
    @Test
    void testSetters(){
        superhero.setName("Superman");
        // Assert that the name has been updated
        assertEquals("Superman", superhero.getName());
        superhero.setPower(15);
        // Assert that the power has been updated
        assertEquals(15, superhero.getPower());
        superhero.setAge(31);
        // Assert that the power has been updated
        assertEquals(31, superhero.getAge());

    }
    @Test
    void testToString() {
        assertEquals("Имя: Superman, Сила: 10, Возраст: 30", superhero.toString());
    }

}
