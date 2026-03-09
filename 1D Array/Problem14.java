
import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double [] yield = new double[n];
        double total = 0;
        for(int i=0;i<n;i++){
            yield[i] = sc.nextDouble();
            total += yield[i];
        }
        double high = yield[0];
        int store = 1;
        double avg = total/(double)n;
        double avg_80 = avg*0.80;
        int perform = 0;
        for(int i=0;i<n;i++){
            if(yield[i]>high){
                high = yield[i];
                store = i+1;
            }
            if(yield[i]<avg_80){
                perform++;
            }
        }
        System.out.println("\nTotal Plots: "+n);
        System.out.printf("Total Harvest: %.2f tons\n",total);
        System.out.printf("Average Yield: %.2f tons/acre\n",avg);
        System.out.printf("Highest Yield: %.2f tons/acre (Plot %d)\n",high,store);
        System.out.printf("Underperforming Plots: %d\n",perform);
        System.out.printf("Performance Threshold: %.2f tons/acre\n",avg_80);
        sc.close();


    }
}
