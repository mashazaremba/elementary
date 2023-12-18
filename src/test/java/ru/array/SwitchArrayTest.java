package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {

    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap3to4() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int source = 3;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 5, 4, 6, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap5to2() {
        int[] input = {8, 2, 9, 4, 3, 6, 7};
        int source = 5;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {8, 2, 6, 4, 3, 9, 7};
        assertThat(result).containsExactly(expected);
    }
}