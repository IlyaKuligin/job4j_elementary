package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean datum = data[0];
        for (int d = 0; d < data.length; d++) {
            if (datum != data[d]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
