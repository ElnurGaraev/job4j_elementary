package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Hi Bot.";
        String expected = "Hi, SmartAss.";
        String rsl = DummyBot.answer(in);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenByeBot() {
        String in = "Bye.";
        String expected = "See you later.";
        String rsl = DummyBot.answer(in);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Can you add two plus two";
        String expected = "I don't know. Please, ask another question.";
        String rsl = DummyBot.answer(in);
        assertThat(rsl).isEqualTo(expected);
    }
}