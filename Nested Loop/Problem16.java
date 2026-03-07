
import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int Occupied = sc.nextInt();
        int [][]arr = new int[rows][cols];
        for(int i=0;i<Occupied;i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                arr[a][b]+=1;
        }
        System.out.println("Parking Lot Grid:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==1){
                    System.out.print("[O] ");
                }
                else{
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }
        int total=rows*cols;
        double rate = (double) Occupied/total*100;
        System.out.println("\nTotal Spots: "+total);
        System.out.println("Occupied: "+Occupied);
        System.out.println("Vacant: "+(total-Occupied));
        System.out.printf("Occupancy Rate: %.2f%%",rate);
        sc.close();
        sc.close();
    }
}

