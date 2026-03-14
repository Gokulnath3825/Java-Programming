import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int total = 0;
        System.out.println("\nSeating Map:");
        int[][] arr = new int[rows][cols];
        int[] arr1 = new int[rows];
        int count = 0;
        for (int i = 0; i < rows; i++) {
            int count1=0;
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]);
                if(arr[i][j]==1){
                    total++;
                    count1++;
                }
            }
            if(count1==0){
                arr1[count]=i;
                count++;
            }
            System.out.println();
        }
        System.out.println("Total Occupied: "+total);
        double avg = (double) total/(rows*cols)*100;
        System.out.printf("Occupancy Rate: %.2f%%\n",avg);
        System.out.print("Empty Rows: [");
        for(int i=0;i<count;i++){
            System.out.print(arr1[i]);
            if(i<count-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        sc.close();
        sc.close();

    }
}
