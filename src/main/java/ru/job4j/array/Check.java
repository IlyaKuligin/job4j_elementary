package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean standard = data[0];
        for (boolean value : data) {
            if (standard != value) {
                result = false;
                break;
            }
        }
        return result;
    }
}
