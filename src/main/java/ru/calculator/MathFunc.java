package ru.calculator;

public class MathFunc {
    public static int func1(int x) {
        return x * x + 1;
    }

    public static int func2(int x) {
        return 1 / x;
    }

    public static void main(String[] args) {
        System.out.println(MathFunc.func1(3));
        System.out.println(MathFunc.func2(5));
    }

}
