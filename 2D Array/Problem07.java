
import java.util.Scanner;

class Problem07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        System.out.println("\nInventory Grid:");
        int[][] arr = new int[rows][cols];
        int total =0;
        int max = Integer.MIN_VALUE;
        int maxStore = 0;
        int maxStr = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+" ");
                total+=arr[i][j];
                if(arr[i][j]>max){
                    max = arr[i][j];
                    maxStore=i;
                    maxStr=j;
                }
            }
            System.out.println();
        }
        double avg = (double)total/(rows*cols);
        System.out.println("Total Inventory: "+total);
        System.out.printf("Max Stock Zone: Row %d, Col %d (%d units)\n",maxStore,maxStr,max);
        System.out.printf("Average Stock per Zone: %.2f ",avg);
        sc.close();

    }
}