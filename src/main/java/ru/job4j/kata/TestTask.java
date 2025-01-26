package ru.job4j.kata;

import java.util.Arrays;
import java.util.Scanner;

public class TestTask {
    public static void main(String[] args) {
        System.out.println(textModifier());
    }

    public static String textModifier() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
        String cleanSpacesResult = cleanSpaces(text);
        String replaceCharResult = replaceChar(cleanSpacesResult);
        String replacePlusResult = replacePlus(replaceCharResult);
        String sumNumberResult = sumNumber(replacePlusResult);
        return sumNumberResult;
    }

    public static String cleanSpaces(String string) {
        char[] arrInput = string.toCharArray();
        char space = ' ';
        int arrOutputSize = 0;
        for (int i = 0; i < arrInput.length; i++) {
            if ((arrInput[i] == space) && (i < arrInput.length - 1) && (arrInput[i + 1] == space)) {
                continue;
            }
            arrOutputSize++;
        }
        char[] arrOutput = new char[arrOutputSize];
        int arrOutputIndex = 0;
        for (int i = 0; i < arrInput.length; i++) {
            if ((arrInput[i] == space) && (i < arrInput.length - 1) && (arrInput[i + 1] == space)) {
                continue;
            }
            arrOutput[arrOutputIndex] = arrInput[i];
            arrOutputIndex++;
        }
        return new String(arrOutput);
    }

    public static String replaceChar(String string) {
        char[] arrInput = string.toCharArray();
        char space = ' ';
        int arrOutputSize = 0;
        for (int i = 0; i < arrInput.length; i++) {
            if (arrInput[i] == '-') {
                continue;
            }
            arrOutputSize++;
        }
        char[] arrOutput = new char[arrOutputSize];
        int arrOutputIndex = 0;
        char leftChar = ' ';
        char rightChar = ' ';
        for (int i = 0; i < arrInput.length; i++) {
            if ((arrInput[i] == '-') && (i > 0) && (i < arrInput.length - 1)) {
                leftChar = arrInput[i - 1];
                rightChar = arrInput[i + 1];
                arrOutput[arrOutputIndex - 1] = rightChar;
                arrOutput[arrOutputIndex] = leftChar;
                i++;
                arrOutputIndex++;
                continue;
            }
            arrOutput[arrOutputIndex] = arrInput[i];
            arrOutputIndex++;
        }
        return new String(arrOutput);
    }

    public static String replacePlus(String string) {
        char[] arrInput = string.toCharArray();
        char[] arrOutput = new char[arrInput.length];
        for (int i = 0; i < arrInput.length; i++) {
            if (arrInput[i] == '+') {
                arrOutput[i] = '!';
                continue;
            }
            arrOutput[i] = arrInput[i];
        }
        return new String(arrOutput);
    }
    // Данный метод не закончен
    public static String sumNumber(String string) {
        char[] arrInput = string.toCharArray();
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int number = 0;
        char[] numbersRst = new char[2];
        int numbersRstIntex = 0;
        int arrOutputSize = 0;
        for (int i = 0; i < arrInput.length; i++) {
            if (Arrays.asList(numbers).contains(arrInput[i])) {
                numbersRst[numbersRstIntex] = arrInput[i];
                numbersRstIntex++;
                number = number + (int) arrInput[i];
                continue;
            }
            arrOutputSize++;
        }
        if (number > 10) {
            arrOutputSize++;
            arrOutputSize++;
            arrOutputSize++;
        } else if (number > 0) {
            arrOutputSize++;
            arrOutputSize++;
        }
        char[] arrOutput = new char[arrOutputSize];
        int arrOutputIndex = 0;
        for (int i = 0; i < arrInput.length; i++) {
            if (Arrays.asList(numbers).contains(arrInput[i])) {
                continue;
            }
            arrOutput[arrOutputIndex] = arrInput[i];
            arrOutputIndex++;
        }
        if (number > 10) {
            arrOutput[arrOutputIndex + 1] = numbersRst[0];
            arrOutput[arrOutputIndex + 2] = numbersRst[1];
        } else if (number > 0) {
            arrOutput[arrOutputIndex + 1] = numbersRst[0];
        }
        return new String(arrOutput);
    }
}
