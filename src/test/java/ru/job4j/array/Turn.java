package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int endIndex = array.length - 1;
        for (int i = 0; i < array.length / 2; i++, endIndex--) {
            int temp = array[i];
            array[i] = array[endIndex];
            array[endIndex] = temp;
        }
        return array;
    }
}
