package ru.condition;

public class Max {
    public static int max(int one, int two) {
        return one >= two ? one : two;
    }

    public static int max(int one, int two, int tree) {
        return max(one, two) >= tree ? max(one, two) : tree;
    }

    public static int max(int one, int two, int tree, int four) {
        return max(one, two, tree) >= four ? max(one, two, tree) : four;
    }

    public static void main(String[] args) {
        System.out.println("Максимальное число " + max(5, 9));
        System.out.println("Максимальное число " + max(5, 9, 10));
        System.out.println("Максимальное число " + max(5, 9, 10, 11));
    }
}
