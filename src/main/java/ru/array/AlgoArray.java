package ru.array;

import java.util.Arrays;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        Arrays.sort(array);
        for (int element : array) {
            System.out.println(element);
        }
    }
}
