
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double []consumption = new double[n];
        for(int i=0;i<n;i++){
            consumption[i] = sc.nextDouble();
        }
        double limit = sc.nextDouble();
        double sum = 0;
        int maxStore = 1;
        double max = consumption[0];
        for(int i=0;i<n;i++){
            sum+=consumption[i];
            if(consumption[i]>max){
                max = consumption[i];
                maxStore=i+1;
            }
        }
        String status="Exceeded by";

        if(sum<limit){
            status="Within Limit";
        }
        double avg = sum/n;
        System.out.println("\nHours Monitored: "+n);
        System.out.printf("Total Daily Consumption: %.2f kWh\n",sum);
        System.out.printf("Peak Hour: Hour %d (%.2f kWh)\n",maxStore,max);
        System.out.printf("Average Hourly: %.2f kWh\n",avg);
        System.out.printf("Daily Limit: %.2f kWh\n",limit);
        if(status.equals("Within Limit")){
            System.out.println("Status: "+status);
        }
        else{
            double cal = sum-limit;
            System.out.printf("Status: Exceeded by %.2f kWh\n",cal);
        }
        sc.close();



    }
}
