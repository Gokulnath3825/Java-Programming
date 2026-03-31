
import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int amount=0;
        boolean ok = true;
        do {
            int withdrawal = sc.nextInt();
            System.out.println("\nEnter withdrawal amount: "+withdrawal);
            
            amount = balance-withdrawal;
            if(withdrawal <= 100){
                System.out.println("Invalid amount! Try again.");
            }
            else if(amount<0){
                System.out.println("Insufficient funds! Try again.");
            }
            else{
                System.out.println("Withdrawal successful! Remaining balance:"+amount);
                ok=false;
            }
            
        } while (ok);
    }
}
