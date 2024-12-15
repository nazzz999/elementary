package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To2Then5() {
        int left = 5;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To4and3Then7() {
        int one = 4;
        int two = 3;
        int tree = 7;
        int result = Max.max(one, two, tree);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To4and2and9Then9() {
        int one = 4;
        int two = 2;
        int tree = 7;
        int four = 9;
        int result = Max.max(one, two, tree, four);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}