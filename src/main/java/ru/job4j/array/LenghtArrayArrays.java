package ru.job4j.array;

public class LenghtArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {2, 3}, {4, 5, 6}, {5, 6, 7, 8}};
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index].length);
        }
    }
}
