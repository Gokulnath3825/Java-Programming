
import java.util.*;

public class Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double [] arr = new double[n];
        double total = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextDouble();
            total+=arr[i];
        }
        double avg = total/n;
        int count = 0;
        for(double num : arr){
            if(num>avg){
                count++;
            }
        }
        double percentage = (double) count/n*100;
        System.out.println("\nTotal Employees: "+n);
        System.out.println("Average Salary: "+avg);
        System.out.println("Employees Above Average: "+count);
        System.out.printf("Percentage: %.2f%%",percentage);
        sc.close();
        

    }
}
