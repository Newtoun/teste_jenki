package test.java;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import src.main.java.TemperatureConverter;

public class TemperatureConverterTest {
    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0, TemperatureConverter.fahrenheitToCelsius(32), 0.001);
        assertEquals(100, TemperatureConverter.fahrenheitToCelsius(212), 0.001);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0), 0.001);
        assertEquals(212, TemperatureConverter.celsiusToFahrenheit(100), 0.001);
