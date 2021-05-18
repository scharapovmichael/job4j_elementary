package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int index = 2; index <= 5; index++) {
          prime = index > 0;
          for (number = 2; number < index; number++)
            if (( index % number) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
