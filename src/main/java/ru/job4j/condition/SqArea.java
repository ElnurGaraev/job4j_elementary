package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double height = p / (2 * (k + 1));
        double lenght = height * k;
        double square = height * lenght;
        return square;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println("p=6, k=2, s=2, real= " + result + ".");
        double result2 = SqArea.square(8, 4);
        System.out.println("p=8, k=4, s=2.56 , real= " + result2 + ".");
        double result3 = SqArea.square(18, 8);
        System.out.println("p=18, k=8, s=8, real= " + result3 + ".");
    }
}
