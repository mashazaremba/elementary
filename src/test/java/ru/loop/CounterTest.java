package ru.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom2To10Then42() {
        int start = 2;
        int finish = 12;
        int result = Counter.sumByEven(start, finish);
        int expected = 42;
        assertThat(result).isEqualTo(expected);
    }
}