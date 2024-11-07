package ru.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int val = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                val += array[row][cell];
            }
        }
        return val;
    }
}
