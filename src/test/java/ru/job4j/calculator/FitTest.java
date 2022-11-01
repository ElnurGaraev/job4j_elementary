package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenManHeight175Then86dot25() {
        Short height = 175;
        double expected = 86.25;
        double rsl = Fit.manWeight(height);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenWomanHeight175Then74dot75() {
        short height = 175;
        double expected = 74.75;
        double rsl = Fit.womanWeight(height);
        Assert.assertEquals(expected, rsl, 001);
    }
}