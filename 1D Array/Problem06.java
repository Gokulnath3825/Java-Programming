import java.util.*;

public class Problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double arr[] = new double[n];
        int[] index = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextDouble();
        }
        double sum = 0;
        for(int i =0;i<n;i++){
            sum = sum+arr[i];
        }
        double avg = sum / n;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>avg){
                index[count]=i;
                count++;
            }
        }
        System.out.println("\nTotal Transactions: "+n);
        System.out.printf("Average Transaction: $%.2f\n", avg);
        System.out.println("Suspicious Transactions: " + count);
        System.out.print("Fraud Alert Indices: [");
    
        for(int i=0;i<count;i++){
            System.out.print(index[i]);
            if (i<count-1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
        sc.close();
    }
}