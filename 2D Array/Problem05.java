import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        System.out.println("\nTemperature Grid:");
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int max = Integer.MIN_VALUE;
        int maxStore = 0;
        int maxStr = 0;
        int min = Integer.MAX_VALUE;
        int minStore = 0;
        int minStr = 0;
        int total = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                total+=arr[i][j];
                if(arr[i][j]>max){
                    max = arr[i][j];
                    maxStore=i;
                    maxStr=j;
                }
                if(arr[i][j]<min){
                    min = arr[i][j];
                    minStore=i;
                    minStr=j;
                }
            }
        }
        double avg = (double)total/(rows*cols);
        System.out.printf("\nMaximum Temperature: %d°C at position (%d, %d)",max,maxStore,maxStr);
        System.out.printf("\nMinimum Temperature: %d°C at position (%d, %d)",min,minStore,minStr);
        System.out.printf("\nAverage Temperature: %.2f°C",avg);
        sc.close();

        
    }
}
