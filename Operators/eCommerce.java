
import java.util.Scanner;

public class eCommerce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  value=sc.nextInt();
        int  premium=sc.nextInt();
        if(value>999 || premium==1){
            System.out.println("Free Shipping");
        }
        else{
            System.out.println("Charges Applied");
        }
    }
}