//  Matrix Addition

import java.util.Scanner;

class Matrix {
    int col;
    int row;
    int[][] matrix;

    Matrix(int r, int c) {
        col = c;
        row = r;
        matrix = new int[row][col];
    }

    void matrixCreation(Scanner read) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = read.nextInt();
            }
        }
    }
}

public class Program2 {

    public static void addMatrix(Matrix m1, Matrix m2, Matrix result) {
        for (int i = 0; i < m1.row; i++) {
            for (int j = 0; j < m1.col; j++) {
                result.matrix[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
            }
        }
    }

    public static void displayMatrix(Matrix result) {
        System.out.println("The metrix after adding given 2 matrices:");
        for (int i = 0; i < result.row; i++) {
            for (int j = 0; j < result.col; j++) {
                System.out.print("\t" + result.matrix[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int row, col;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter Number of Rows:");
        row = read.nextInt();
        System.out.print("Enter Number of columns:");
        col = read.nextInt();
        Matrix m1 = new Matrix(row, col);
        Matrix m2 = new Matrix(row, col);
        Matrix result = new Matrix(row, col);
        System.out.println("Enter the elements of matrix1:");
        m1.matrixCreation(read);
        System.out.println("Enter the elements of matrix2:");
        m2.matrixCreation(read);
        addMatrix(m1, m2,result);
        displayMatrix(result);
    }
}