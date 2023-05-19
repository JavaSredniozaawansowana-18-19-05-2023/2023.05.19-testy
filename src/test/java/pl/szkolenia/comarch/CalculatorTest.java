package pl.szkolenia.comarch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    @Disabled
    public void addTest() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 7;
        int expectedResult = 12;

        int actual = calculator.add(a, b);

        Assertions.assertEquals(expectedResult, actual);
    }

    @Test
    public void divideTest() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 5;
        int expectedResult = 1;

        int actual = calculator.divide(a,b);

        Assertions.assertEquals(expectedResult, actual);
    }
}
