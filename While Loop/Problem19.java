
import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        int original = decimal;
        String binary = "";

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            System.out.println(binary);
            decimal = decimal / 2;
        }
        System.out.println("Decimal: " + original);
        System.out.println("Binary: " + binary);
        sc.close();
        sc.close();
    }
}
