import java.util.*;

public class Problem19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][]original = new int[N][N];

        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                original[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Image:");
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }

        int newSize=N/2;
        int[][]compressed=new int[newSize][newSize];

        for (int i=0;i<newSize;i++){
            for (int j=0;j<newSize;j++){
                int sum=original[2*i][2*j]+original[2*i][2*j+1]+original[2*i+1][2*j]+original[2*i+1][2*j+1];
                compressed[i][j]=sum/4;
            }
        }
        System.out.println("\nCompressed Image:");
        for (int i=0;i<newSize;i++){
            for (int j=0;j<newSize;j++){
                System.out.print(compressed[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
        sc.close();
    }
}