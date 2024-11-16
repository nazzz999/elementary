package ru.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int changes = money - price;
        while (changes != 0) {
            for (int coin : coins) {
                if (changes >= coin) {
                    changes -= coin;
                    rsl[size] = coin;
                    size++;
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
