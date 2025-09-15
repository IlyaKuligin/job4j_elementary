package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{3}, {4, 5}, {7, 8, 9}, {7, 8, 9, 3}};
        for (int[] number : numbers) {
            System.out.println(
                    "Размер вложенного массива равен: " + number.length
            );
        }
    }
}
