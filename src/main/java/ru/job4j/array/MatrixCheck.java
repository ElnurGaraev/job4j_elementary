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

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X' && monoHorizontal(board, i) || monoVertical(board, i)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] board = {{'X', ' ', ' '}, {'X', 'X', 'X'}, {'X', ' ', 'X'}};
        int row = 1;
        boolean rsl = MatrixCheck.monoHorizontal(board, row);
        System.out.println(rsl);

        int column = 1;
        boolean rsl2 = MatrixCheck.monoVertical(board, column);
        System.out.println(rsl2);

        char[] rsl3 = MatrixCheck.extractDiagonal(board);
        for (int index = 0; index < rsl3.length; index++) {
            System.out.println(rsl3[index]);
        }

        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean rsl4 = MatrixCheck.isWin(input);
        System.out.println(rsl4);
    }
}
