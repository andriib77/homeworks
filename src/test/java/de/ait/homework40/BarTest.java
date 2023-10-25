package de.ait.homework40;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BarTest {
    private Bar bar;

    @BeforeEach
    void setUp() {
        bar = new Bar();
    }

    @Test
    void testDrinkCreation() {
        Drink drink = new Drink("Коктейль Мохито", "Алкогольный", 250);
        assertNotNull(drink);
        assertEquals("Коктейль Мохито", drink.getName());
        assertEquals("Алкогольный", drink.getType());
        assertEquals(250, drink.getVolume(), 0.01);
    }

    @Test
    void testAddDrinkToBar() {
        Drink drink1 = new Drink("Коктейль Мохито", "Алкогольный", 250);
        Drink drink2 = new Drink("Сок апельсиновый", "Безалкогольный", 300);

        bar.addDrink("001", drink1);
        bar.addDrink("002", drink2);

        assertEquals(drink1, bar.getDrink("001"));
        assertEquals(drink2, bar.getDrink("002"));
    }

    @Test
     void testGetDrinkFromBar() {
        Drink drink1 = new Drink("Коктейль Мохито", "Алкогольный", 250);
        bar.addDrink("001", drink1);

        Drink retrievedDrink = bar.getDrink("001");
        assertEquals(drink1, retrievedDrink);
    }

    @Test
     void testGetNonExistentDrinkFromBar() {
        Drink retrievedDrink = bar.getDrink("003");
        assertNull(retrievedDrink);
    }
}