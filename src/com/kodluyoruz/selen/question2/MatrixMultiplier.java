package com.kodluyoruz.selen.question2;

public class MatrixMultiplier {


    public static <T extends Number> T[][] multiply(T[][] matrix1, T[][]  matrix2) {
        int row = matrix1.length;
        int col = matrix2[0].length;

        T[][] mult = null;

        if (matrix1[0][0] instanceof Integer) {
            mult = (T[][]) new Integer[row][col];
        }
        else if (matrix1[0][0] instanceof Double) {
            mult = (T[][]) new Double[row][col];
        }
        else if (matrix1[0][0] instanceof Float) {
            mult = (T[][]) new Float[row][col];
        }
        else if (matrix1[0][0] instanceof Long) {
            mult = (T[][]) new Long[row][col];
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mult[i][j] = (T) (Object) 0;
            }
        }


        for(int i = 0; i < matrix1.length; i++)
        {
            for(int j = 0; j < matrix2[0].length; j++)
            {
                for(int k = 0; k < matrix2.length; k++)
                {
                    if(matrix1[i][k] instanceof Integer) {
                        int val = matrix1[i][k].intValue() *  matrix2[k][j].intValue();
                        mult[i][j] = (T) (Object) (mult[i][j].intValue() + val);
                    }
                    else if(matrix1[i][k] instanceof Double) {
                        long val = matrix1[i][k].longValue() *  matrix2[k][j].longValue();
                        mult[i][j] = (T) (Object) (mult[i][j].longValue() + val);
                    }
                    else if(matrix1[i][k] instanceof Long) {
                        double val = matrix1[i][k].doubleValue() *  matrix2[k][j].doubleValue();
                        mult[i][j] = (T) (Object) (mult[i][j].doubleValue() + val);
                    }
                    else if(matrix1[i][k] instanceof Float) {
                        float val = matrix1[i][k].floatValue() *  matrix2[k][j].floatValue();
                        mult[i][j] = (T) (Object) (mult[i][j].floatValue() + val);
                    }
                }
            }
        }


        return mult;
    }
}
