package ru.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива ages: " + ages.length + " символов");
        String[] surnames = new String[100500];
        System.out.println("Размер массива surnames: " + surnames.length + " символов");
        float[] prices = new float[40];
        System.out.println("Размер массива prices: " + prices.length + " символов");
        String[] names = new String[4];
        names[0] = "Ivan Petrov";
        names[1] = "Ilya Vanichkin";
        names[2] = "Nastya Nazarycheva";
        names[3] = "Irina Sheyk";
        System.out.println(names[0] + ", " + names[1] + ", " + names[2] + ", " + names[3]);
    }
}
