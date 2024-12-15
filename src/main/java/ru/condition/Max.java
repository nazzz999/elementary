package ru.condition;

public class Max {
    public static int max(int one, int two) {
        return Math.max(one, two);
    }

    public static int max(int one, int two, int tree) {
        return Math.max(max(one, two), tree);
    }

    public static int max(int one, int two, int tree, int four) {
        return Math.max(max(one, two, tree), four);
    }

    public static void main(String[] args) {
        System.out.println("Максимальное число " + max(5, 9));
        System.out.println("Максимальное число " + max(5, 9, 10));
        System.out.println("Максимальное число " + max(5, 9, 10, 11));
    }
}
