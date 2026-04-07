
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int nn = a;
        int rev = 0;

        while(a!=0){
            int digit = a%10;
            rev = rev * 10 + digit;
            a/=10;
        }

        if(nn == rev){
            System.out.println(nn + " is a palindrome");
        }else{
            System.out.println(nn + " is not a palindrome");

        }
    }
}
