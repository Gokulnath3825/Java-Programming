import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int floors = sc.nextInt();

        int[][] hotel=new int[floors][];
        int[] occupancy=new int[floors];
        for (int i=0;i<floors;i++) {
            int rooms=sc.nextInt();
            hotel[i]=new int[rooms];

            for(int j=0;j<rooms;j++) {
                hotel[i][j]=sc.nextInt();
            }
        }
        System.out.println("Hotel Status:");
        for(int i=0;i<floors;i++) {
            System.out.print("Floor " + (i+1) + ": ");
            for(int j=0;j<hotel[i].length;j++) {
                System.out.print(hotel[i][j] + " ");
            }
            System.out.println();
        }

        int max=-1;
        int busiestFloor=0;

        System.out.println("\nOccupancy Report:");
        for (int i=0;i<floors;i++) {
            int count=0;

            for (int j=0;j<hotel[i].length;j++) {
                if (hotel[i][j]==1) {
                    count++;
                }
            }
            occupancy[i]=count;

            System.out.println("Floor "+(i+1)+": "+count+" occupied");
            if (count>max) {
                max=count;
                busiestFloor=i+1;
            }
        }
        System.out.println("\nBusiest Floor: Floor "+busiestFloor+" ("+max+ " rooms occupied)");

        sc.close();
    }
}