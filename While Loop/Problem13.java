
import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int exp=exponent;
        int result = 1;
        while(exp>0){
            result *= base;
            exp--;
        }
        System.out.println(base+" ^ "+exponent+" = "+result);
    }
}
