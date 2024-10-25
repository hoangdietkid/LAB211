package TranHoangViet_DE180482_SE18D10_week8.matrixcalculator.Model;

import TranHoangViet_DE180482_SE18D10_week8.matrixcalculator.View.InputValid;

public class Matrix {
    InputValid input = new InputValid();

    public int[][] inputMatrix(int n) {
        System.out.println("Enter row: ");
        int row = input.checkInputInt();
        System.out.println("Enter colum: ");
        int col = input.checkInputInt();
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter matrix" + n + "[" + i + "]" + "[" + j + "] :");
                matrix[i][j] = input.checkInputInt();
            }
        }
        return matrix;
    }

    public void displayMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }

    public void additionMatrix(int[][] matrix1, int[][] matrix2) {
        displayMatrix(matrix1);
        System.out.println("+");
        displayMatrix(matrix2);
        System.out.println("=");
        int row = matrix1.length;
        int col = matrix1[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + matrix1[i][j] + matrix1[i][j] + "]");
            }
            System.out.println();
        }
    }

    public void subtractionMatrix(int[][] matrix1, int[][] matrix2) {
        displayMatrix(matrix1);
        System.out.println("-");
        displayMatrix(matrix2);
        System.out.println("=");
        int row = matrix1.length;
        int col = matrix1[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + (matrix1[i][j] - matrix2[i][j]) + "]");
            }
            System.out.println();
        }
    }

    public void multiplicationMatrix(int[][] matrix1, int[][] matrix2) {
        displayMatrix(matrix1);
        System.out.println("*");
        displayMatrix(matrix2);
        System.out.println("=");
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        if (col1 != row2) {
            System.err.println("Can't multiple");
            return;
        }
        int[][] matrixResult = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                matrixResult[i][j] = 0;
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    matrixResult[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        displayMatrix(matrixResult);
    }
}
