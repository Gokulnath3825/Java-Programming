
import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []risk = new int[n];
        int []Alert = new int[n];
        int total = 0;
        for(int i=0;i<n;i++){
            risk[i]=sc.nextInt();
            total+=risk[i];
        }
        double avg = (double)total / n;
        double avg_2 = avg*2;
        int max = risk[0];
        int maxStore =1;
        int min = risk[0];
        int minStore =1;
        int count = 0;
        for(int i=0;i<n;i++){
            if(risk[i]>max){
                max=risk[i];
                maxStore=i+1;
            }
            if(risk[i] < min){
                min=risk[i];
                minStore=i+1;
            }
            if(risk[i]>avg_2){
                Alert[count]=i+1;
                count++;
            }
        }
        System.out.println("Security Events Analyzed: "+n);

        System.out.printf("Average Risk Score: %.2f\n",avg);
        System.out.printf("Highest Risk Event: %d (Event %d)\n",max,maxStore);
        System.out.printf("Lowest Risk Event: %d (Event %d)\n",min,minStore);
        System.out.println("Critical Threats (>200% avg): "+count);
        System.out.printf("Threat Threshold: %.2f\n",avg_2);
        System.out.print("Alert Events: [");
        for(int i=0;i<count;i++){
            System.out.print(Alert[i]);
            if(i<count-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
