
import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        int result=0;
        int power =1;
        while(binary!=0){
            int digit = binary % 10;
            result+=digit*power;
            binary/=10;
            power*=2;
        }
        System.out.println("Binary: "+binary);
        System.out.println("Decimal: "+result);
        sc.close();
        sc.close();
    }
}
