
import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n1 = a;
        int n2 = b;
        while(n2!=0){
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        int lcm = (a*b)/n1;
        System.out.println("LCM of "+a+" and "+b+" = "+lcm);
        sc.close();
        sc.close();
    }
}
