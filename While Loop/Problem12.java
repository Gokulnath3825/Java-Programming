
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nn = n;
        int rev = 0;

        while(n!=0){
            int digit = n%10;
            rev = rev*10+digit;
            n/=10;
        }

        if(nn == rev){
            System.out.println(nn+" is a palindrome");
        }else{
            System.out.println(nn+" is not a palindrome");

        }
    }
}
