
import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for(int i=1;i<=height;i++){
            for(int j=0;j<height-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=i-1;l>0;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
