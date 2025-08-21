package ru.job4j.calculator;

import ru.job4j.math.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second) + MathFunction.multiply(first, second);
    }

    public static double differenceAndDivide(double first, double second) {
        return MathFunction.difference(first, second) + MathFunction.divide(first, second);
    }

    public static double calculateCombinedResult(double first, double second) {
        return sumAndMultiply(first, second) + differenceAndDivide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета (сумма и умножение) равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета (разность и частное) равен: " + differenceAndDivide(10, 20));
        System.out.println("Результат расчета (сумма общая) равен: " + calculateCombinedResult(10, 20));
    }
}
