package ru.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        return value / 90;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedOne = 1.4F;
        float expectedTwo = 1.55555556F;
        float euro = rubleToEuro(in);
        float dollar = rubleToDollar(in);
        boolean passedOne = expectedOne == euro;
        boolean passedTwo = expectedTwo == dollar;
        System.out.println("140 rubles are " + euro + " euro. Test result: " + passedOne);
        System.out.println("140 rubles are " + dollar + " dollar. Test result: " + passedTwo);
    }
}
