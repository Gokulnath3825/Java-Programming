import java.util.*;

public class atmWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance=sc.nextInt();
        int withdrawl=sc.nextInt();
        int limit=sc.nextInt();
        if(withdrawl<=balance && withdrawl <=limit){
            System.out.println("Approved");
        }
        else{
            System.out.println("Declined");

        }


    }
    
}
