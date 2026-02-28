
import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double initialBalance = sc.nextDouble();
        double balance=initialBalance;
        int n = sc.nextInt();
        int failCount=0;
        int succCount=0;
        double withdrawal=0.0;
        for(int i=1;i<=n;i++){
            double withdrawalAmount = sc.nextDouble();
            String status="";
            if(withdrawalAmount>balance){
                failCount++;
                status="Denied";
            }
            else if(withdrawalAmount<=balance){
                succCount++;
                balance-=withdrawalAmount;
                status="Approve";
                withdrawal+=withdrawalAmount;
            }
            System.out.println();
            System.out.println("Transaction "+i+": $"+withdrawalAmount);
            System.out.println("Status: "+status);
            if(status.equals("Denied")){
                System.out.println("Insufficient funds");
            }
            System.out.println("Remaining Balance: $"+balance);
        }
        sc.close();
        System.out.println();
        System.out.println("Total Transactions: "+n);
        System.out.println("Successful Withdrawals: "+succCount);
        System.out.println("Failed Withdrawals: "+failCount);
        System.out.println("Final Balance: $"+balance);
        System.out.println("Total Withdrawn: $"+withdrawal);
        sc.close();

    }
}