package ru.condition;

public class Max {
    public static int max(int left, int right) {
        boolean maximum = left >= right;
        return maximum ? left : right;
    }

    public static void main(String[] args) {
        System.out.println("Максимальное число " + max(5, 9));
    }
}
