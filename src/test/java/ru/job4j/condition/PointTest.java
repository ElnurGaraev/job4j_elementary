package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
         double expected = 2;
         double results = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, results, 0.01);
    }

    @Test
    public void when30To00Then3() {
        double expected = 3;
        double results2 = Point.distance(3, 0, 0, 0);
        Assert.assertEquals(expected, results2, 0.01);
        }

    @Test
    public void when01To00Then1() {
        double expected = 1;
        double result3 = Point.distance(0, 1, 0, 0);
        Assert.assertEquals(expected, result3, 0.01);
    }

    @Test
    public void when00To04Then4() {
        double expected = 4;
        double result4 = Point.distance(0, 0, 0, 4);
        Assert.assertEquals(expected, result4, 0.01);
    }

}
