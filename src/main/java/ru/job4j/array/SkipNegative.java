package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                int val = array[row][cell];
                if (val < 0) {
                    val = 0;
                    array[row][cell] = val;
                }
            }
        }
        return array;
    }
}
