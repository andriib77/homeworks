package de.ait.homework34;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringProcessorTest {
    private StringProcessor stringProcessor;

    @BeforeEach
    public void setUp() {
        stringProcessor = new StringProcessor();
    }

    @Test
    public void testConcatenate(){
        assertEquals("hallo", stringProcessor.concatenate("hal", "lo"));
    }
    @Test
    public void testConcatenateNegative(){
        assertEquals("hallo Deutschland", stringProcessor.concatenate("hallo ", "Deutschland"));
    }


}
