package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (char index = 0; index < post.length - 1; index++) {
            if (word[word.length - 1 - index] != post[post.length - 1 - index]) {
                char temp = word[word.length - 1 - index];
                word[word.length - 1 - index] = word[index];
                word[index] = temp;
                result = false;
                break;
            }
        }
        return result;
    }
}
