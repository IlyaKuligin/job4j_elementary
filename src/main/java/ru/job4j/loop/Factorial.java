package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 1;
        if (number != 0) {
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
        }
        return result;
    }
}
