
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0,max =arr[0],min =arr[0],slow=0;

        for(int num : arr){
            sum+=num;
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }
            if(num>200){
                slow++;
            }
        }

        double avg =(double) sum/n;
        double Perform =(double)(n-slow)/n*100;
        System.out.println("\nTotal Servers: "+n);
        System.out.println("Fastest Response: "+min+"ms");
        System.out.println("Slowest Response: "+max+"ms");
        System.out.printf("Average Response: %.2fms\n",avg);
        System.out.println("Slow Servers (>200ms):"+slow);
        System.out.printf("Performance Score: %.2f%%\n",Perform);
    }
}
