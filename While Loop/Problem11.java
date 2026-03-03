
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n1 = a;
        int n2 = b;
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
            
        }
        // while(n1!=n2){
        //     if(n1>n2){
        //         n1=n1-n2;
        //     }
        //     else{
        //         n2=n2-n1;
        //     }
        // }
        System.out.println("GCD of "+n1+" and "+n2+" = "+a);
        sc.close();
        sc.close();
    }
}