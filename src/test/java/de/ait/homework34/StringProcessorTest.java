package de.ait.homework34;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringProcessorTest {
    private StringProcessor stringProcessor;

    @BeforeEach
    public void setUp() {
        stringProcessor = new StringProcessor();
    }

    @Test
    public void testConcatenatePositive() {
        assertEquals("hallo Deutschland", stringProcessor.concatenate("hallo ", "Deutschland"));
    }

    public void testConcatenateNegative() {
        assertEquals("", stringProcessor.concatenate("", ""));
    }

    @Test
    public void testLength() {
        assertEquals(17, stringProcessor.getLength("hallo Deutschland"));
    }

    @Test
    public void testLengthNoData() {
        assertEquals(0, stringProcessor.getLength(""));
    }

    @Test
    public void testLengthSymbols() {
        assertEquals(4, stringProcessor.getLength(" @# "));
    }

    @Test
    public void testReverse() {
        assertEquals("iirdnA", stringProcessor.reverse("Andrii"));
    }

    @Test
    public void testReverseLeer() {
        assertEquals("", stringProcessor.reverse(""));
    }

    @Test
    public void testReverseSymbols() {
        assertEquals(" #@ ", stringProcessor.reverse(" @# "));
    }

    @Test
    public void testPalindromeTrue() {
        assertTrue(stringProcessor.isPalindrome("lagerregal"));
    }

    @Test
    public void testPalindromeLeerTrue() {
        assertTrue(stringProcessor.isPalindrome(""));
    }
    @Test
    public void testPalindromeFalse() {
        assertFalse(stringProcessor.isPalindrome("hello"));
    }
}

