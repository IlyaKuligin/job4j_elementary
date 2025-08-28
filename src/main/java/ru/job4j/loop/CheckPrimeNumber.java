package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean result = false;
        if (number > 1) {
            result = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
