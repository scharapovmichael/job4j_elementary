package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (word[word.length - index - 1] != pref[pref.length - index - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}




