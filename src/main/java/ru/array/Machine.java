package ru.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int i = 0;
        int[] rsl = new int[100];
        int size = 0;
        int changes = money - price;
        while (changes != 0) {
            if (changes >= coins[i]) {
                changes -= coins[i];
                rsl[size] = coins[i];
                size++;
            } else {
                i++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
