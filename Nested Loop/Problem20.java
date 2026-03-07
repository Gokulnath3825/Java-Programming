import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("\nOriginal Matrix ("+row+" x "+col+"):");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nTransposed Matrix ("+col+" x "+row+"):");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}