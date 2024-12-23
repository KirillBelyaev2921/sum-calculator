package ua.kyrylo.bieliaiev;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    private SumCalculator sumCalculator;

    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void testThatOneSumEqualsOne() {
        int actual = sumCalculator.sum(1);

        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void testThatThreeSumEqualsSix() {
        int actual = sumCalculator.sum(3);

        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void testThatZeroThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> sumCalculator.sum(0));
    }
}