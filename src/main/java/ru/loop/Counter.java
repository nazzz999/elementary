package ru.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int summa = 0;
        for (int index = start; index <= finish; index++) {
            summa += index;
        }
        return summa;
    }

    public static void main(String[] args) {
        System.out.println("Сумма всех чисел от 0 до 10 : " + sum(0, 10));
        System.out.println("Сумма всех чисел от 3 до 8 : " + sum(3, 8));
        System.out.println("Сумма всех чисел от 1 до 1 : " + sum(1, 1));
    }
}
