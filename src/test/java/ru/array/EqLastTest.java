package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EqLastTest {

    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        boolean result = EqLast.check(left, right);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        boolean result = EqLast.check(left, right);
        assertThat(result).isFalse();
    }

    @Test
    public void whenEq1() {
        int[] left = {1, 2, 3, 7, 9};
        int[] right = {3, 3, 9};
        boolean result = EqLast.check(left, right);
        assertThat(result).isTrue();
    }
}