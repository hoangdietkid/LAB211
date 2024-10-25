package TranHoangViet_DE180482_SE18D10_week8.matrixcalculator.View;

import TranHoangViet_DE180482_SE18D10_week8.matrixcalculator.Model.Matrix;

public class Main {
    public static Menu menu = new Menu();
    public static Matrix matrix = new Matrix();

    public static void main(String[] args) {
        int[][] matrix1 = matrix.inputMatrix(1);
        int[][] matrix2 = matrix.inputMatrix(2);
        while (true) {
            int choice = menu.menu();
            switch (choice) {
                case 1:
                    matrix.additionMatrix(matrix1, matrix2);
                    break;
                case 2:
                    matrix.subtractionMatrix(matrix1, matrix2);
                    break;
                case 3:
                    matrix.multiplicationMatrix(matrix1, matrix2);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
