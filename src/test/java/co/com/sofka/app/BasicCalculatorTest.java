package co.com.sofka.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    //@Test
    /*@DisplayName("Testing suma 1+1=2")
    void sum() {

        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        //Act
        Long result = basicCalculator.sum(number1, number2);


        //Assert
        assertEquals(expectedValue, result);

    }*/
    //Pruebas de suma.
    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Double first, Double second, Double expectedResult) {
        assertEquals(expectedResult, basicCalculator.Suma(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    //Pruebas de resta.
    @DisplayName("Testing several rest")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,    1,   -1",
            "2,    2,    0",
            "50,  32,   18",
            "85,  92,   -7"
    })
    public void severalRest(Double first, Double second, Double expectedResult) {
        assertEquals(expectedResult, basicCalculator.Resta(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    //Pruebas de Multiplicacion.
    @DisplayName("Testing several Multi")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "0,    1,    0",
            "2,    2,    4",
            "5,  -3,   -15",
            "-4,  6,   -24"
    })
    public void severalMulti(Double first, Double second, Double expectedResult) {
        assertEquals(expectedResult, basicCalculator.Multiplicacion(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    //Pruebas de division.
    @DisplayName("Testing several divid")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "0,    1,    0",
            "2,   -2,   -1",
            "50,   0,   Infinity",
            "16,   4,    4",
            "10,   1,    10"
    })
    public void severalDivid(Double first, Double second, Double expectedResult) {
        assertEquals(expectedResult, basicCalculator.Division(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }
}