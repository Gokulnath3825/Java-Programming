
import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        String topPerform="";
        double totalSales=0;
        double totalCommission=0.0;
        double Highest=0.0;

        for(int i=0;i<n;i++){

            String repName = sc.next();
            double salesAmount = sc.nextDouble();
            
            if(salesAmount>Highest){
                Highest=salesAmount;
                topPerform=repName;
            }
            totalSales+=salesAmount;

            int commissionRate = 0;
            if(salesAmount<=40000){
                commissionRate=5;
            }
            else if(salesAmount>40000 && salesAmount<=80000){
                commissionRate=8;
            }
            else if(salesAmount>80000 && salesAmount<=100000){
                commissionRate=10;
            }
            else if(salesAmount>100000 && salesAmount<150000){
                commissionRate=12;
            }
            else if(salesAmount>=150000 ){
                commissionRate=15;
            }
            double commission = salesAmount*(commissionRate/100.0);

            int bouns =0;
            if(salesAmount>=100000){
                bouns=2000;
            }
            else if(salesAmount>=150000){
                bouns=3000;
            }
            double total=(double)bouns+commission;
            totalCommission+=total;
            
            System.out.println();
            System.out.println("Sales Rep: "+repName);
            System.out.println("Sales Amount: $"+salesAmount);
            System.out.println("Commission Rate: "+commissionRate+"%");
            System.out.println("Commission Earned: $"+commission);
            System.out.println("Bouns: $"+(double)bouns);
            System.out.println("Total Payout: $"+total);
        }
        System.out.println();
        System.out.println("Total Sales Reps: "+n);
        System.out.println("Total Sales: $"+totalSales);
        System.out.println("Total Commissions: $"+totalCommission);
        System.out.println("Top Performer: "+topPerform);

        sc.close();
    }
    
}
