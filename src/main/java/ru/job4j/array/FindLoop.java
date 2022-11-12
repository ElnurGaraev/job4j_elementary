package ru.job4j.array;

public class FindLoop {
    public static int indexInRange(int[] data, int el, int start, int finish) {
        int rsl = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public static int indexOf(int[] data, int el) {
        int rsl = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] data = new int[] {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int el = 8;
        int start = 1;
        int finish = 5;
        System.out.println(FindLoop.indexInRange(data, el, start, finish));
    }
}
