import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []delay = new int[n];
        for(int i=0;i<n;i++){
            delay[i]=sc.nextInt();
        }
        int max = delay[0];
        int early =0;
        int compare = 0;
        int sum =0;
        for(int num : delay){
            sum+=num;
            if(num>max){
                max = num;
            }
            if(num<15){
                early++;
            }
            if(num>180){
                compare++;
            }
        }
        double avg = (double) sum/n;
        double perform = (double) early/n*100.0;
        System.out.println("Total Flights: "+n);
        System.out.printf("Average Delay: %.2f minutes\n",avg);
        System.out.println("Maximum Delay: "+max);
        System.out.println("On-Time Flights: "+early);
        System.out.println("Compensation Required: "+compare);
        System.out.printf("On-Time Performance: %.2f%%\n",perform);
        sc.close();
    }
}
