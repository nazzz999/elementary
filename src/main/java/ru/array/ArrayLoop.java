package ru.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] number = new int[5];
        for (int index = 0; index < number.length; index++) {
            number[index] = index * 2 + 3;
        }
        for (int i : number) {
            System.out.println(i);
        }
    }
}
