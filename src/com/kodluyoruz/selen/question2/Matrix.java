package com.kodluyoruz.selen.question2;

public class Matrix {


    public static void main(String[] args) {
        Integer[][] matrix1 = generateRandomMatrix(2, 3);
        Integer[][] matrix2 = generateRandomMatrix(3, 2);

        print(matrix1);
        print(matrix2);

        Integer[][] multiply = MatrixMultiplier.multiply(matrix1, matrix2);

        print(multiply);


    }

    private static Integer[][] generateRandomMatrix(int row, int col) {

        Integer[][] matrix = new Integer[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }

        return matrix;
    }

    private static void print(Integer[][] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("]");

        }
        System.out.print("]\n");
    }
}

