package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        int[] sumNumbers = new int[2];
        while (i < j) {
            if (array[i] + array[j] == target) {
                sumNumbers[0] = i;
                sumNumbers[1] = j;
                return sumNumbers;
            } else if (array[i] + array[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}

