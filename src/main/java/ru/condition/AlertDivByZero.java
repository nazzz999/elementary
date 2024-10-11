package ru.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
        if (number < 0) {
            System.out.println("Число " + number + "  меньше нуля");
        } else if (number == 0) {
            System.out.println("Число " + number + " равно нулю");
        } else {
            System.out.println("Число " + number + " больше нуля");
        }
    }

    public static void main(String[] args) {
       possibleDiv(4);
       possibleDiv(0);
    }
}
