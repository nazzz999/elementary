package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        int[] sumNumbers = new int[2];
        while (i < j) {
            for (int k = j; k > i; k--) {
                if (array[i] + array[k] == target) {
                    sumNumbers[0] = i;
                    sumNumbers[1] = k;
                    return sumNumbers;
                }
            }
            i++;
        }
        return new int[0];
    }
}
