
import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] time = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            time[i]=sc.nextInt();
            sum+=time[i];
        }
        int max = time[0];
        int min = time[0];
        int count = 0;
        for(int i=0;i<n;i++){
            if(time[i]>max){
                max = time[i];
            }
            if(time[i]<max){
                min = time[i];
            }
            if(time[i]>300){
                count++;
            }
        }
        double avg = (double) sum/n;
        double target = (double)(n-count)/n*100;
        System.out.println("Total Calls: "+n);
        System.out.printf("Average Handling Time: %.2f seconds\n",avg);
        System.out.printf("Shortest Call: %d seconds\n",min);
        System.out.printf("Longest Call: %d seconds\n",max);
        System.out.println("Calls Exceeding Target (300s):"+count);
        System.out.printf("Target Compliance: %.2f%%",target);
        sc.close();

    }
}
