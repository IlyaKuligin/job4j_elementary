package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int count = 0;

        int balance = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (balance >= coins[i]) {
                balance = balance - coins[i];
                size++;
                rsl[count] = coins[i];
                count++;
            }

        }
        return Arrays.copyOf(rsl, size);
    }
}
