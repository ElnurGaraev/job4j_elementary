package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        double result = SqArea.square(6, 2);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenP8K4Square2dot56() {
        double expected = 2.56;
        double result2 = SqArea.square(8, 4);
        Assert.assertEquals(expected, result2, 0.01);
    }

    @Test
    public void whenP12K4Square8() {
        double expected = 8;
        double result3 = SqArea.square(18, 8);
        Assert.assertEquals(expected, result3, 0.01);
    }
}