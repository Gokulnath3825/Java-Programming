
import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int sum = 0;
        int count = 0;
        for(int i=0;i<n;i++){{
            sum += arr[i];
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i]>60){
                count++;
            }
        }
    }
    double avg =(double)sum/n;
    double level = (double) (n-count)/n*100;
    System.out.println("\nTotal Patients: "+n);
    System.out.println("Longest Wait Time: "+max+"minutes");
    System.out.printf("Average Wait Time: %.2f minutes\n",avg);
    System.out.println("Patients Waiting >60 min: "+count);
    System.out.printf("Service Level: %.2f%%\n",level);
    sc.close();
    }
}
