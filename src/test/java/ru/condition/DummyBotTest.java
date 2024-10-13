package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DummyBotTest {

    @Test
    void answerHi() {
        String in = "Hi, Bot.";
        String result = DummyBot.answer(in);
        String expected = "Hi, SmartAss.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void answerBye() {
        String in = "Bye.";
        String result = DummyBot.answer(in);
        String expected = "See you later.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void answerOther() {
        String in = "Hello";
        String result = DummyBot.answer(in);
        String expected = "I don't know. Please, ask another question.";
        assertThat(result).isEqualTo(expected);
    }
}