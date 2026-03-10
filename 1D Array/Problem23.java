
import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []units = new int[n];
        int []Priority = new int[n];
        int total = 0;
        for(int i=0;i<n;i++){
            units[i]=sc.nextInt();
            total+=units[i];
        }
        double avg = (double)total/n;
        double avg_90 = avg*.9;
        int max = units[0];
        int maxStore =1;
        int count = 0;
        for(int i=0;i<n;i++){
            if(units[i]>max){
                max=units[i];
                maxStore=i+1;
            }
            if(units[i]<avg_90){
                Priority[count]=i+1;
                count++;
            }
        }
        System.out.println("Production Lines: "+n);
        System.out.printf("Total Output: %d units\n",total);
        System.out.printf("Average Output: %.2f units/hour\n",avg);
        System.out.printf("Top Producer: Line %d (%d units)\n",maxStore,max);
        System.out.println("Underperforming Lines: "+count);
        System.out.printf("Performance Threshold: %.2f units\n",avg_90);
        System.out.print("Priority Lines: [");
        for(int i=0;i<count;i++){
            System.out.print(Priority[i]);
            if(i<count-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        sc.close();

    }
}
