package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int p = 0; p < post.length; p++) {
            if (post[post.length - 1 - p] != word[word.length - 1 - p]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
