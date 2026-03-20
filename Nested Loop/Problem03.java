import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ch = sc.next();

        for(int i = 1;i<=n;i++){
            if(ch.equals("star")){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else if(ch.equals("number")){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
                
            }
        }
    }
}
