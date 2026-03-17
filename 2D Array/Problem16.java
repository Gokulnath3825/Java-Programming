import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][]grid=new int[10][10];

        int T=sc.nextInt();
        for (int i=0;i<T;i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            grid[r][c]=1;
        }
        System.out.println("Treasure Map:");
        for (int i=0;i<10;i++) {
            boolean hasTreasure=false;
            int lastCol=-1;

            for(int j=0;j<10;j++) {
                if (grid[i][j]==1) {
                    hasTreasure=true;
                    lastCol=j;
                }
            }

            if (hasTreasure) {
                for(int j=0;j<=lastCol;j++) {
                    System.out.print(grid[i][j]+ " ");
                }
                System.out.println();
            }
        }

        int C = sc.nextInt();
        for (int i=0;i<C;i++) {
            int r=sc.nextInt();
            int c=sc.nextInt();

            if(grid[r][c]==1) {
                System.out.println("Checking Location (" + r + ", " + c + "): Treasure Found!");
                grid[r][c]=0;
            }else{
                System.out.println("Checking Location (" + r + ", " + c + "): No Treasure");
            }
        }
        System.out.println("Final Map:");
        for (int i = 0; i < 10; i++) {
            boolean hasTreasure = false;
            int lastCol = -1;

            for (int j=0;j<10;j++) {
                if (grid[i][j]==1) {
                    hasTreasure=true;
                    lastCol=j;
                }
            }

            if (hasTreasure) {
                for (int j=0;j<=lastCol;j++) {
                    System.out.print(grid[i][j]+" ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}