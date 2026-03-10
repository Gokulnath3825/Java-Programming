import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double []values = new double[n];
        int []Priority = new int[n];
        double total = 0;
        for(int i=0;i<n;i++){
            values[i]=sc.nextDouble();
            total+=values[i];
        }
        double avg = total/n;
        double avg_80 = avg*0.80;
        double min = values[0];
        int minStore =1;
        double max = values[0];
        int maxStore =1;
        int count = 0;
        for(int i=0;i<n;i++){
            if(values[i]>max){
                max=values[i];
                maxStore=i+1;
            }
            if(values[i]<min){
                minStore=i+1;
                min=values[i];
            }
            if(values[i]<avg_80){
                Priority[count]=i+1;
                count++;
            }
        }
        System.out.println("Fleet Size: "+n);
        System.out.printf("Average Fuel Efficiency: %.2f MPG\n",avg);
        System.out.printf("Most Efficient: %.2f MPG (Vehicle %d)\n",max,maxStore);
        System.out.printf("Least Efficient: %.2f MPG (Vehicle %d)\n",min,minStore);
        System.out.println("Underperforming Vehicles: "+count);
        System.out.printf("Efficiency Threshold: %.2f MPG\n",avg_80);
        System.out.print("Maintenance Priority: [");
        for(int i=0;i<count;i++){
            System.out.print(Priority[i]);
            if(i<count-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");



        sc.close();
        sc.close();
    }
}
