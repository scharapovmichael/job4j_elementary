package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (char index = 0; index < word.length; index++) {
            if (word == pref) {
                char temp = word[word.length - index];
                word[word.length - index] = word[index];
                word[index] = temp;
                result = true;
            }
        }
        return result;
    }
}



