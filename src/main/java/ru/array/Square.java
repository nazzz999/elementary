package ru.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] array = new int[bound];
        for (int index = 0; index < bound; index++) {
            array[index] = (int) Math.pow(index, 2);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int element : array) {
            System.out.println(element);
        }
    }
}
