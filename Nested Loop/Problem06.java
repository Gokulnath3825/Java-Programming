
import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][]a = new int[row][col];
        int [][]b = new int[row][col];
        int [][]sum = new int[row][col];

        System.out.println("\nMatrix A:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nMatrix B:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = sc.nextInt();
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nSum (A + B):");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }
}
