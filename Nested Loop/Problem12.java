
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<=n;j++){
                if((j+i)%2==0){
                    System.out.print("□ ");
                }
                else if((j+i)%2==1){
                    System.out.print("■ ");

                }
            }
            System.out.println();
        }
        sc.close();
        sc.close();
    }
}
