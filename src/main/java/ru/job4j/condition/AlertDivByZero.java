package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] arts) {
        possibleDiv(0);
        possibleDiv(-5);
    }

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not divide by 0.");
        }
        if (number < 0) {
            System.out.println("This is negative number.");
        }
    }
}
