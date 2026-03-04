
import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int range = sc.nextInt();
        int i=1;
        do { 
            System.out.println(number+" x "+i+" = "+(i*number));
            i++;
        } while (i<=range);

        sc.close();
        sc.close();
    }
}
