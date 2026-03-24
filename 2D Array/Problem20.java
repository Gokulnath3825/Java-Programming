
import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]matrix = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        String status = "Symmetric";
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(matrix[i][j]==matrix[i][j+1]){
                    status="Asymmetric";
                }
            }
        }
        System.out.println("Status: "+status);
        sc.close();
}
