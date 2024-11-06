package ru.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length; index++) {
            int minElement = MinDiapason.findMin(data, index, data.length - 1);
            int minIndex = FindLoop.indexInRange(data, minElement, index, data.length);
            SwitchArray.swap(data, index, minIndex);
        }
        return data;
    }
}
