
import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []percentage = new int[n];
        int total = 0;
        for(int i=0;i<n;i++){
            percentage[i]=sc.nextInt();
            total+=percentage[i];
        }
        double avg = (double)total/n;
        int min = percentage[0];
        int minStore =1;
        int max = percentage[0];
        int maxStore =1;
        int count = 0;
        for(int i=0;i<n;i++){
            if(percentage[i]>max){
                max=percentage[i];
                maxStore=i+1;
            }
            if(percentage[i]<min){
                minStore=i+1;
                min=percentage[i];
            }
            if(percentage[i]<60){
                count++;
            }
        }
        double Rate = (double) (n-count)/n *100;
        System.out.println("Total Students: "+n);
        System.out.printf("Average Completion: %.2f%%\n",avg);
        System.out.printf("Maximum pH: %d%% (Student %d)\n",max,maxStore);
        System.out.printf("Minimum pH: %d%% (Student %d)\n",min,minStore);
        System.out.println("At-Risk Students (<60%) "+count);
        System.out.printf("Safety Compliance: %.2f%%\n",Rate);
        sc.close();
    }
}
