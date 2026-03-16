
import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int[][] rotated = new int[n][n];
        for(int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                rotated[j][n-1-i]=matrix[i][j];
            }
        }
        System.out.println("Original Matrix:");
        for(int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nRotated Matrix (90 deg clockwise):");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
        sc.close();
    }
    
}
