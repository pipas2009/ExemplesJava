package AATema1.ActivitatsJavaBase;

import java.util.Scanner;

public class GeneradorDeSudokus {
    public static int [][] grid;
    public static char separatorUnicode = '\u25CF';
    public static char emptyUnicode = '\u25A1';
    public static int[] dificultat = {60, 40, 20, 10};
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nivell de Dificultat [0 - 3]: ");
        int nivell = input.nextInt();
        int k = dificultat[nivell];

        grid= sudokuGenerator(k);
        printSudoku(grid);
    }

    public static int[][] sudokuGenerator(int k){
        int[][] grid = new int[9][9];
        fillDiagonal(grid);
        fillRemaining(grid, 0, 0);
        removeKDigits(grid, k);
        return grid;
    }

    public static void printSudoku(int[][] grid){
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                String separator = c > 0 && c % 3 == 0 ? " " + separatorUnicode+ " ":" ";
                String sValue = Integer.toString(grid[r][c]);
                String value = grid[r][c] == 0 ? String.valueOf(emptyUnicode) : sValue;
                System.out.printf("%s%s", separator, value);
            }
            System.out.println();


            if (r % 3 == 2 && r < grid.length - 1) {
                System.out.print(" ");
                for (int c = 0; c < grid[r].length; c++) {
                    System.out.printf("%c ", separatorUnicode);
                    if (c % 3 == 2 && c < grid.length - 1) {
                        System.out.print("  ");
                    }
                }
                System.out.println();

            }
        }
}

    public static boolean noUsedInBox(int[][] grid, int rowStart, int colStart, int num){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[rowStart + i][colStart + j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void fillBox(int[][] grid, int row, int col) {
        int num;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    num = (int)(Math.random()*9) + 1;
                } while (!noUsedInBox(grid, row, col, num));
                grid[row + i][col + j] = num;
            }
        }
    }

    public static boolean noUsedInRow(int[][] grid, int r, int num) {
        for (int c = 0; c < 9; c++) {
            if (grid[r][c] == num) {
                return false;
            }
        }
        return true;
    }

    public static boolean noUsedInCol(int[][] grid, int c, int num) {
        for (int r = 0; r < 9; r++) {
            if (grid[r][c] == num) {
                return false;
            }
        }
        return true;
    }

    public static void fillDiagonal(int[][] grid) {
        for (int i = 0; i < 9; i = i + 3) {
            fillBox(grid, i, i);
        }
    }

    public static boolean checkIfSafe(int[][] grid, int r, int c, int num) {
        return (noUsedInRow(grid, r, num) &&
                noUsedInCol(grid, c, num) &&
                noUsedInBox(grid, r - r % 3, c - c % 3, num));
    }

    public static boolean fillRemaining(int[][] grid, int i, int j) {

        if (i == 9) {
            return true;
        }

        if (j == 9) {
            return fillRemaining(grid, i + 1, 0);
        }

        if (grid[i][j] != 0) {
            return fillRemaining(grid, i, j + 1);
        }

        for (int num = 1; num <= 9; num++) {
            if (checkIfSafe(grid, i, j, num)) {
                grid[i][j] = num;
                if (fillRemaining(grid, i, j + 1)) {
                    return true;
                }
                grid[i][j] = 0;
            }
        }
        return false;
    }

    public static void removeKDigits(int[][] grid, int k) {
        while (k > 0) {
            int cellId = (int)(Math.random()*81);
            int r = cellId / 9;
            int c = cellId % 9;
            if (grid[r][c] != 0) {
                grid[r][c] = 0;
                k--;
            }
        }
    }


}