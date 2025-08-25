package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenStart0Finish5Then15() {
        int expected = 15;
        int output = Counter.sum(0, 5);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart6Finish5Then0() {
        int expected = 0;
        int output = Counter.sum(6, 5);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromTenToTenThenTen() {
        int start = 10;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromElevenToTenThenZero() {
        int start = 11;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusTwoToFourThenFour() {
        int start = -2;
        int finish = 4;
        int result = Counter.sumByEven(start, finish);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}