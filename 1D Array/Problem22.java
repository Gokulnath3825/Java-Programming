
import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double []values = new double[n];
        int []top = new int[n];
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
            if(values[i]>avg_200){
                top[count]=i+1;
                count++;
            }
        }
        System.out.println("Total Posts: "+n);
        System.out.printf("Average Engagement: %.2f%%\n",avg);
        System.out.printf("Peak Engagement: %.2f%% (Post %d)\n",max,maxStore);
        System.out.printf("Lowest Engagement: %.2f%% (Post %d)\n",min,minStore);
        System.out.println("Viral Posts (>200% avg):"+count);
        System.out.printf("Viral Threshold %.2f\n",avg_200);
        System.out.print("Top Performers: [");
        for(int i=0;i<count;i++){
            System.out.print(top[i]);
            if(i<count-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}
