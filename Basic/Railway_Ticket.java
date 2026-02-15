import java.util.Scanner;

public class Railway_Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int genPass=sc.nextInt();
        int genFare=sc.nextInt();
        int acPass=sc.nextInt();
        int acFare=sc.nextInt();
        int platform=sc.nextInt();
        int maintenance=sc.nextInt();
        int fuel=sc.nextInt();

        int Revenue =(genPass *genFare)+ (acPass * acFare)+platform-maintenance-fuel;

        System.out.println("Net Railway Revenue ="+Revenue);
        sc.close();
    }
    
}
