package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ac = 2;
        double ab = 2;
        double bc = 2;
        boolean result = Triangle.exist(ac, ab, bc);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotExist() {
        double ac = 0.1;
        double ab = 0.5;
        double bc = 2;
        boolean result = Triangle.exist(ac, ab, bc);
        assertThat(result).isFalse();
    }
}