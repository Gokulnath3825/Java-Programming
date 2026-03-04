
import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            int fact = 1;
            while(digit>0){
                fact*=digit;
                digit--;
            }
            sum+=fact;
            n/=10;
        }
        if(sum == original){
            System.out.println(original+" is a strong number");
        }else{
            System.out.println(original+" is not a strong number");
        }
        sc.close();
        sc.close();
    }
}
