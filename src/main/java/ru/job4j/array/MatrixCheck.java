package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] board = {{'X', ' ', ' '}, {'X', 'X', 'X'}, {'X', ' ', ' '}};
        int row = 1;
        boolean rsl = MatrixCheck.monoHorizontal(board, row);
        System.out.println(rsl);

        int column = 1;
        boolean rsl2 = MatrixCheck.monoVertical(board, column);
        System.out.println(rsl2);
    }
}
