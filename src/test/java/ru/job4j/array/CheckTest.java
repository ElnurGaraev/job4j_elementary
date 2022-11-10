package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] data = new boolean[] {true, true, true};
        boolean result = Check.mono(data);
        boolean expected = true;
        assertThat(result).isTrue();
    }

    @Test
    public void whenDataNotMonoTrueThenFalse() {
        boolean[] data = new boolean[]  {true, false, true};
        boolean result = Check.mono(data);
        boolean expected = false;
        assertThat(result).isFalse();
    }

    @Test
    public void whenDataMonoFalseThenTrue() {
        boolean[] data = new boolean[] {false, false, false};
        boolean result = Check.mono(data);
        boolean expected = true;
        assertThat(result).isTrue();
    }

    @Test
    public void whenDataNotMonoFalseThenFalse() {
        boolean[] data = new boolean[] {false, true, false};
        boolean result = Check.mono(data);
        boolean expected = false;
        assertThat(result).isFalse();
    }
}