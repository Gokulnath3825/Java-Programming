
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 4;
        int cols = 7;

        double[][] a = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextDouble();
            }
        }
        System.out.println("\nRainfall Data:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nWeekly Totals:");
        double min = Double.MAX_VALUE;
        int minStr = 0;
        for (int i = 0; i < rows; i++) {
            System.out.print("Week " + (i + 1) + ": ");
            double total = 0;
            for (int j = 0; j < cols; j++) {
                total += a[i][j];
            }
            if(total<min){
                min = total;
                minStr = i+1;
            }
            System.out.printf("%.2f mm\n",total);
        }


        double total = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                total += a[i][j];
            }
        }
        System.out.printf("Monthly Total: %.2f mm\n",total);
        System.out.printf("Driest Week: Week %d (%.2f mm)",minStr,min);

    }
}
