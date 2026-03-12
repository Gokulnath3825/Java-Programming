
import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        System.out.println("\nElevation Map:");
        int[][] arr = new int[rows][cols];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+" ");
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
            System.out.println();
        }
        int range = max - min;
        System.out.println("\nHighest Point: "+max+" m");
        System.out.println("Lowest Point: "+min+" m");
        System.out.println("Elevation Range: "+range+" m");
        sc.close();
    }
}
