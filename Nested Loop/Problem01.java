import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        for(int i=1;i<=row;i++){
            if(i == 1){
                for(int l=1;l<=row;l++){
                    System.out.print(l+" ");
                }
                System.out.println();
            }
            for(int k=0;k<1;k++){
                System.out.print(i+" ");
            }
            for(int j=1;j<=column;j++){
                System.out.print(j*i+" ");
            }
            System.out.println();
        }
    }
}
