package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rsl = 0;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rsl = index;
                break;
            } else {
                rsl = -1;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] data = new int[] {5, 10, 3};
        System.out.println(FindLoop.indexOf(data, 10));
    }
}
