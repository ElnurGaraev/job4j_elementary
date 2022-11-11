package ru.job4j.array;

public class RollBackArray {
    public static int[] rollBack(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            int lastIndex = array.length - 1;
            int currentIndex = index;
            result[currentIndex] = array[lastIndex - currentIndex];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = rollBack(new int[] {1, 2, 3, 4, 5});
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
