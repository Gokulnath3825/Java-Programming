
import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double []values = new double[n];
        double total = 0;
        for(int i=0;i<n;i++){
            values[i]=sc.nextDouble();
            total+=values[i];
        }
        double avg = total/n;
        double avg_200 = avg*2.0;
        double min = values[0];
        int minStore =1;
        double max = values[0];
        int maxStore =1;
        int count_0= 0;
        int count_1= 0;
        for(int i=0;i<n;i++){
            if(values[i]>max){
                max=values[i];
                maxStore=i+1;
            }
            if(values[i]<min){
                minStore=i+1;
                min=values[i];
            }
            if(values[i]<avg*0.70){
                count_0++;
            }
            if(values[i]>avg*1.50){
                count_1++;
            }
        }
        System.out.println("Total Properties: "+n);
        System.out.printf("Portfolio Value: $%.2f\n",total);
        System.out.printf("Average Property Value: $%.2f\n",avg);
        System.out.printf("Most Valuable: $%.2f (Property %d)\n",max,maxStore);
        System.out.printf("Least Valuable: $%.2f (Property %d)\n",min,minStore);
        System.out.println("Bargain Properties (<70% avg): "+count_0);
        System.out.println("Premium Properties (>150% avg): "+count_1);
        sc.close();
        sc.close();
    }
}
