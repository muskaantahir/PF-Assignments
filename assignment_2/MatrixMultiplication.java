import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for Matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for Matrix A: ");
        int columnsA = scanner.nextInt();
        System.out.print("Enter the number of rows for Matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for Matrix B: ");
        int columnsB = scanner.nextInt();

        scanner.close();

        int[][] matrixA = new int[rowsA][columnsA];
        int[][] matrixB = new int[rowsB][columnsB];

        System.out.println("Enter the values for Matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the values for Matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < columnsB; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        int[][] result = new int[rowsA][columnsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Result of Matrix Multiplication:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}