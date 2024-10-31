package ru.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] arrayTwo = new int[bound];
        for (int index = 0; index < arrayTwo.length; index++) {
            arrayTwo[index] = (int) Math.pow(index, 2);
        }
        return arrayTwo;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int element : array) {
            System.out.println(element);
        }
    }
}
