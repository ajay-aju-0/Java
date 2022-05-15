//  Read two matrices and perform matrix addition

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

    void readMatrix(Scanner s) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
    }

    void addMatrix(Matrix m1, Matrix m2, Matrix result) {
        for (int i = 0; i < m1.row; i++) {
            for (int j = 0; j < m1.col; j++) {
                result.matrix[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
            }
        }
    }

    void displayMatrix(Matrix res) {
        System.out.println("The matrix after adding given 2 matrices:");
        for (int i = 0; i < res.row; i++) {
            for (int j = 0; j < res.col; j++) {
                System.out.print("\t" + res.matrix[i][j]);
            }
            System.out.print("\n");
        }
    }
}

public class Addition {
    public static void main(String[] args) {
        int row, col;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number of Rows:");
        row = s.nextInt();
        System.out.print("Enter Number of columns:");
        col = s.nextInt();
        Matrix m1 = new Matrix(row, col);
        Matrix m2 = new Matrix(row, col);
        Matrix res = new Matrix(row, col);
        System.out.println("Enter the elements of matrix1:");
        m1.readMatrix(s);
        System.out.println("Enter the elements of matrix2:");
        m2.readMatrix(s);
        res.addMatrix(m1, m2,res);
        res.displayMatrix(res);
    }
}