package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        number = Math.abs(number);
        if (number == 1) {
            prime = false;
            return prime;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
            return prime;
        }
    }
}
