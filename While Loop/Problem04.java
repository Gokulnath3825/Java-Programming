import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = n;
        int fact=1;
        while(b!=0){
            fact*=b;
            b--;
        }
        System.out.println("Factorial of "+n+" = "+fact);
        sc.close();
        sc.close();
    }
    
}
