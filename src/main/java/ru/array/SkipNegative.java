package ru.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                int val = array[row][cell];
                if (val < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }
}