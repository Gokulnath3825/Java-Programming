
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        int book = sc.nextInt();
        for (int i = 0;i<book;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==1){
                    System.out.print("B ");
                }
                else{
                    System.out.print("A ");
                }
            }
            System.out.println();
        }
        int total = rows*cols;
        int avl = total - book;
        double occ = (double)book/total*100;
        System.out.println("Total Seats: "+total);
        System.out.println("Booked Seats: "+book);
        System.out.println("Available Seats: "+avl);
        System.out.printf("Occupancy Rate: %.2f",occ);
        sc.close();
    }
}
