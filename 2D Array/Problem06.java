import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        System.out.println("\nTraffic Data:");
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < rows; i++) {
            int total=0;
            for (int j = 0; j < cols; j++) {
                total += arr[i][j];
            }
            System.out.printf("Lane %d: %d\n",(i+1),total);
        }
        int max = Integer.MIN_VALUE;
        int maxStr = 0;
        for (int i = 0; i < cols; i++) {
            int total=0;
            for (int j = 0; j < rows; j++) {
                total += arr[j][i];
            }
            if(total>max){
                max=total;
                maxStr=i+1;
            }
        }
        System.out.printf("Busiest Hour: Hour %d with %d vehicles",maxStr,max);
        sc.close();
    }
}
