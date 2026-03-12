
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        System.out.println("\nSales Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nRepresentative Totals:");
        for (int i = 0; i < rows; i++) {
            System.out.print("Rep " + (i + 1) + ": ");
            int total = 0;
            for (int j = 0; j < cols; j++) {
                total += a[i][j];
            }
            System.out.print(total+"\n");
        }

        System.out.println("\nTerritory Totals:");
        for (int i = 0; i < cols; i++) {
            int total = 0;
            System.out.print("Territory " + (i + 1) + ":");
            for (int j = 0; j < rows; j++) {
                total += a[j][i];
            }
            System.out.print(total+"\n");
        }
        sc.close();
        sc.close();
    }
}
