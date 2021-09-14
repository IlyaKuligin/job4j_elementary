package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {
    @Test
    public void when5Sort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when3Sort() {
        int[] data = new int[] {3, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when9Sort() {
        int[] data = new int[] {3, 4, 1, 2, 5, 7, 5, 15, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 5, 7, 9, 15};
        Assert.assertArrayEquals(expected, result);
    }

}