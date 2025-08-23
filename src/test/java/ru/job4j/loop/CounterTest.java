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
}