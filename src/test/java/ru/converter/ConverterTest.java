package ru.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen1Dot4Euro() {
        float in = 140;
        float expected = 1.4f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert221Dot5RblThen2Dot2Euro() {
        float in = 221.5f;
        float expected = 2.2f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.1f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert180RblThen2Dollar() {
        float in = 180;
        float expected = 2f;
        float out = Converter.rubleToDollar(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenConvert115Dot5RblThen1Dot2Dollar() {
        float in = 115.5f;
        float expected = 1.2f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.1f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}