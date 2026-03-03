
import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nn = n;
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("Number: "+nn);
        System.out.println("Sum of digits: "+sum);
        sc.close();
        sc.close();
    }
}
