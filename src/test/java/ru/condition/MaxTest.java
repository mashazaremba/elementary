package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
    void whenMax10To100Then100() {
        int left = 10;
        int right = 100;
        int result = Max.max(left, right);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax31To12Then31() {
        int left = 31;
        int right = 12;
        int result = Max.max(left, right);
        int expected = 31;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax55To55Then55() {
        int left = 55;
        int right = 55;
        int result = Max.max(left, right);
        int expected = 55;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax55To11To22Then55() {
        int first = 55;
        int second = 11;
        int third = 22;
        int result = Max.max(first, second, third);
        int expected = 55;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax55To11To22To70Then70() {
        int first = 55;
        int second = 11;
        int third = 22;
        int fourth = 70;
        int result = Max.max(first, second, third, fourth);
        int expected = 70;
        assertThat(result).isEqualTo(expected);
    }
}