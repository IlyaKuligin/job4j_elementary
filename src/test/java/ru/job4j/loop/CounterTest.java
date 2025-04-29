package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static ru.job4j.loop.Counter.sum;

class CounterTest {
    @Test
    public void testNormalRange() {
        assertEquals(6, sum(1, 3));   // 1 + 2 + 3 = 6
    }

    @Test
    public void testSingleNumber() {
        assertEquals(10, sum(10, 10)); // 10
    }

    @Test
    public void testStartGreaterThanFinish() {
        // Ожидаем 0, так как цикл не выполнится ни разу
        assertEquals(0, sum(5, 1));
    }

    @Test
    public void testZeroRange() {
        assertEquals(0, sum(0, 0)); // 0
    }
}