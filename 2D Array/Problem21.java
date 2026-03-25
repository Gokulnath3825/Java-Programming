import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R1 = sc.nextInt();
        int C1 = sc.nextInt();
        int[][] A = new int[R1][C1];
        for (int i = 0; i < R1; i++) {
            for (int j = 0; j < C1; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int R2 = sc.nextInt();
        int C2 = sc.nextInt();
        int[][] B = new int[R2][C2];
        for (int i = 0; i < R2; i++) {
            for (int j = 0; j < C2; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println("\nMatrix B:");
        printMatrix(B);
        System.out.println("\nResult Matrix:");
        if (C1 != R2) {
            System.out.println("Invalid Multiplication Dimensions");
            return;
        }
        int[][] result = new int[R1][C2];
        for (int i = 0; i < R1; i++) {
            for (int j = 0; j < C2; j++) {
                for (int k = 0; k < C1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        printMatrix(result);
        sc.close();
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}