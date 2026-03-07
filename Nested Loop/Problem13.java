import java.util.Scanner;
public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] matrix = new int[n][n];
        int size = n*n;
        int top = 0, left = 0, bottom = n-1, right = n-1;
        int i=1;
        for(;i<=size;){
            for(int j=left;j<=right;j++){
                matrix[top][j] = i++;
                }
            for(int j=top+1;j<=bottom;j++){
                matrix[j][right] = i++;
                }
            for(int j=right-1;j>=left;j--){
                matrix[bottom][j] = i++;
                }
            for(int j=bottom-1;j>=top+1;j--){
                matrix[j][left] = i++;
                }
                left++  ; top++;
                bottom--; right--;
            }

        for(int j=0;j<n;j++){
            for(int k=0;k<n;k++){
                System.out.print(matrix[j][k]+" ");
            }
            System.out.println();
        }
        }
}
