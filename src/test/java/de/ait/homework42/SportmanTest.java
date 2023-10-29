package de.ait.homework42;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportmanTest {

    private Sportman sportman;

    @BeforeEach
    void setUp() {
        sportman = new Sportman("Fernando Alonso", 42, "Racing, Formula One", 8);
    }

    @Test
    void getName() {
        Assertions.assertEquals("Fernando Alonso", sportman.getName());
    }

    @Test
    void setName() {
        sportman.setName("Michael Schumacher");
        Assertions.assertEquals("Michael Schumacher", sportman.getName());

    }

    @Test
    void getAge() {
        Assertions.assertEquals(42, sportman.getAge());
    }

    @Test
    void setAge() {
        sportman.setAge(54);
        Assertions.assertEquals(54, sportman.getAge());
    }

    @Test
    void getSport() {
        Assertions.assertEquals("Racing, Formula One", sportman.getSport());
    }

    @Test
    void setSport() {
        sportman.setSport("Tennis");
        Assertions.assertEquals("Tennis", sportman.getSport());
    }

    @Test
    void getRecords() {
        Assertions.assertEquals(8, sportman.getRecords());
    }

    @Test
    void setRecords() {
        sportman.setRecords(9);
        Assertions.assertEquals(9, sportman.getRecords());
    }

    @Test
    void updateRecordSuccess() {
        Assertions.assertTrue(sportman.updateRecord(9));
    }
    @Test
    void updateRecordFalse() {
        Assertions.assertFalse(sportman.updateRecord(7));

    }

    @Test
    void testToString() {
        sportman.toString();
    }
    @Test
    void testIsEligibleForCompetitionSuccess() {
        Assertions.assertTrue(sportman.isEligibleForCompetition(16,55));
    }

    @Test
    void testIsEligibleForCompetitionFails() {
        Assertions.assertFalse(sportman.isEligibleForCompetition(7,18));
    }
}