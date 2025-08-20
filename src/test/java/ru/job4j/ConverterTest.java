package ru.job4j;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert180RblThen2Euro() {
        float input = 180;
        float expected = 2;
        float output = (float) Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert225RblThen3Dollar() {
        float input = 225;
        float expected = 3;
        float output = (float) Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}