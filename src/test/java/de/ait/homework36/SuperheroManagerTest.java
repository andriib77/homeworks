package de.javalessons.homework36;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SuperheroManagerTest {

    private SuperheroManager superheroManager;

    @BeforeEach
    void setUp() {
        superheroManager = new SuperheroManager();
    }

    @Test
    void testAddAndGetSuperhero() {
        Superhero superman = new Superhero("Superman", 10, 30);
        superheroManager.addSuperhero(superman);

        Superhero retrievedSuperhero = superheroManager.getSuperhero("Superman");
        assertNotNull(retrievedSuperhero);
        assertEquals("Superman", retrievedSuperhero.getName());
        assertEquals(10, retrievedSuperhero.getPower());
        assertEquals(30, retrievedSuperhero.getAge());
    }
    @Test
    void testAddSuperhero() {
        Superhero superman = new Superhero("Superman", 10, 30);
        superheroManager.addSuperhero(superman);

        List<Superhero> allSuperheroes = superheroManager.getAllSuperheroes();
        assertEquals(1, allSuperheroes.size());
        assertEquals("Superman", allSuperheroes.get(0).getName());
    }

    @Test
    void testRemoveSuperhero() {
        Superhero superman = new Superhero("Superman", 10, 30);
        superheroManager.addSuperhero(superman);

        superheroManager.removeSuperhero("Superman");

        assertEquals(0, superheroManager.getAllSuperheroes().size());
    }

    @Test
    void testGetSuperhero() {
        Superhero superman = new Superhero("Superman", 10, 30);
        Superhero spiderman = new Superhero("Spiderman", 8, 25);
        superheroManager.addSuperhero(superman);
        superheroManager.addSuperhero(spiderman);

        Superhero retrievedSuperman = superheroManager.getSuperhero("Superman");
        Superhero retrievedSpiderman = superheroManager.getSuperhero("Spiderman");
        Superhero nonExistentHero = superheroManager.getSuperhero("NonExistentHero");

        // Assert that the retrieved superheroes match the expected ones
        assertEquals("Superman", retrievedSuperman.getName());
        assertEquals("Spiderman", retrievedSpiderman.getName());

        // Assert that a non-existent hero returns null
        assertNull(nonExistentHero);
    }

    @Test
    void testRemoveNonexistentSuperhero() {
        superheroManager.removeSuperhero("NonexistentHero");
        assertEquals(0, superheroManager.getAllSuperheroes().size());
    }
    @Test
    void testGetAllSuperheroes() {
        Superhero superman = new Superhero("Superman", 10, 30);
        Superhero spiderman = new Superhero("Spiderman", 8, 25);
        superheroManager.addSuperhero(superman);
        superheroManager.addSuperhero(spiderman);

        List<Superhero> allSuperheroes = superheroManager.getAllSuperheroes();

        // Assert that the list contains the correct superheroes
        assertEquals(2, allSuperheroes.size());  // Check the size of the list
        assertEquals("Superman", allSuperheroes.get(0).getName());
        assertEquals("Spiderman", allSuperheroes.get(1).getName());
    }
}