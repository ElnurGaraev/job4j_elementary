package ru.job4j.condition;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax15To12Then() {
        int left = 15;
        int right = 12;
        int expected = 15;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMin10To20Then() {
        int left = 10;
        int right = 20;
        int expected = 20;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenLeft10Eq10Then() {
        int left = 10;
        int right = 10;
        int expected = 10;
        int result = Max.max(10, 10);
        assertThat(result).isEqualTo(expected);
    }
}