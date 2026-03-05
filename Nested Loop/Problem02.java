import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=0;j<1;j++){
                System.out.print("Row"+i+": ");
            }
            for(int k=1;k<=column;k++){
                System.out.print("Seat-"+k+" ");
            }
            System.out.println();
        }
        System.out.println("Total Seats: "+(row*column));
    }
}
