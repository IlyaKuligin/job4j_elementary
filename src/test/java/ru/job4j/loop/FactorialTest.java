package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
        int number = 5;
        int result = Factorial.calc(number);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        int number = 0;
        int result = Factorial.calc(number);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}