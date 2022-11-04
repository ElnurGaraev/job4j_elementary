package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Monday" -> 1;
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            case "Thursday" -> 4;
            case "Friday" -> 5;
            case "Saturday" -> 6;
            case "Sunday" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        String name = "Monday";
        System.out.println("Если день недели " + name + " тогда на экран выводится "
                + MultipleSwitchWeek.numberOfDay(name));
    }
}
