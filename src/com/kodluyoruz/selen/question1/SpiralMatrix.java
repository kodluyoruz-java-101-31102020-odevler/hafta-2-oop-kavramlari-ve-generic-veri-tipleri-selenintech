package com.kodluyoruz.selen.question1;

public class SpiralMatrix {


    public static void main(String[] args) {
        int[][] arr = new int[][] {
                {1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9}};


        int remainingRow = arr.length;
        int remainingCol = arr[0].length;

        final int totalRow = arr.length;;
        final int totalCol = arr[0].length;;

        final int totalCount = arr.length * arr[0].length;
        int visitedCount = 0;

        int lastCol = 0;
        int lastRow = 0;

        while (visitedCount < totalCount) {

            // right
            lastCol = totalCol - remainingCol;
            for (int col = lastCol; col < remainingCol; col++) {
                System.out.print(arr[lastRow][col] + " ");
                visitedCount++;
                lastCol = col;
            }


            // down
            for (int row = lastRow + 1; row < remainingRow; row++) {
                System.out.print(arr[row][lastCol] + " ");
                visitedCount++;
                lastRow = row;
            }

            remainingRow--;

            // left
            for (int col = lastCol - 1; col >= totalCol - remainingCol; col--) {
                System.out.print(arr[lastRow][col] + " ");
                visitedCount++;
                lastCol = col;
            }

            remainingCol--;

            // up
            for (int row = lastRow - 1; row >= totalRow - remainingRow; row--) {
                System.out.print(arr[row][lastCol] + " ");
                visitedCount++;
                lastRow = row;
            }

        }

    }
}
