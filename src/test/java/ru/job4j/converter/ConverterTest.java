package ru.job4j.converter;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        float expectedEuro = 2;
        float euro = Converter.rubleToEuro(140);
        float eps = 0.0001F;
        Assert.assertEquals(expectedEuro, euro, eps);
    }

    @Test
    void whenConvert140RblThen2dot3333Dollar() {
        float expectedDollar = 2.3333F;
        float dollar = Converter.rubleToDollar(140);
        float eps = 0.0001F;
        Assert.assertEquals(expectedDollar, dollar, eps);

    }

    @Test
    void whenConvert1DollarThen60Rbl() {
        float expectedDolRub = 60;
        float dollarRuble = Converter.dollarToRuble(1);
        float eps = 0.0001F;
        Assert.assertEquals(expectedDolRub, dollarRuble, eps);
    }

    @Test
    void whenConvert1EuroThen70Rbl() {
        float expectedEuRub = 70;
        float euroRuble = Converter.euroToRuble(1);
        float eps = 0.0001F;
        Assert.assertEquals(expectedEuRub, euroRuble, eps);

    }
}