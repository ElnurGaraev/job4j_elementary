package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива age: " + ages.length);
        System.out.println("Размер массива String: " + surnames.length);
        System.out.println("Размер массива prices: " + prices.length);

        String[] names = new String[4];
        names[0] = "Kirill";
        names[1] = "Alex";
        names[2] = "Maria";
        names[3] = "Sergey";
        String name = names[0];
        System.out.println(name);
        String name2 = names[1];
        System.out.println(name2);
        String name3 = names[2];
        System.out.println(name3);
        String name4 = names[3];
        System.out.println(name4);
    }
}
