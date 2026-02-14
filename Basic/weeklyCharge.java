import java.util.Scanner;
public class weeklyCharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int daysWorked=sc.nextInt();
        int  wagePerDay=sc.nextInt();
        int overtimeBonus=sc.nextInt();
        int maintenanceCharge=sc.nextInt();

        int totalService=(daysWorked*wagePerDay)+overtimeBonus-maintenanceCharge;

        System.out.println("Final Weekly Wage = "+totalService);
        sc.close();
    }
    
}
