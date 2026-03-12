
import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        System.out.println("\nSales Data:");
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int max = Integer.MIN_VALUE;
        int maxStore = 1;
        System.out.println("\nProduct-wise Total Sales");
        for (int i = 0; i < rows; i++) {
            int total =0;
            for (int j = 0; j < cols; j++) {
                total += arr[i][j];
            }
            if(total>max){
                max = total;
                maxStore=i+1;
            }
            System.out.println("Product "+(i+1)+": "+total);
        }
        System.out.printf("\nBest-Selling Product: Product %d with %d units",maxStore,max);
        sc.close();
        sc.close();
    }
}
