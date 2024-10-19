package ru.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Friday" -> 4;
            case "Пятница", "Saturday" -> 5;
            case "Суббота", "Sunday" -> 6;
            case "Воскресенье" -> 7;
            default -> 0;
        };
    }
}
