import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double []values = new double[n];
        int []unsafe = new int[n];
        double total = 0;
        for(int i=0;i<n;i++){
            values[i]=sc.nextDouble();
            total+=values[i];
        }
        double avg = total/n;
        double min = values[0];
        double max = values[0];
        int count = 0;
        for(int i=0;i<n;i++){
            if(values[i]>max){
                max=values[i];
            }
            if(values[i]<min){
                min=values[i];
            }
            if(values[i]<6.5 || values[i]>8.5){
                unsafe[count]=i+1;
                count++;
            }
        }
        double safety = (double) (n-count)/n *100;
        System.out.println("Total Samples: "+n);
        System.out.printf("Average pH: %.2f\n",avg);
        System.out.printf("Minimum pH: %.2f\n",min);
        System.out.printf("Maximum pH: %.2f\n",max);
        System.out.println("Unsafe Samples: "+count);
        System.out.printf("Safety Compliance: %.2f%%\n",safety);
        System.out.print("Critical Alerts: [");
        for(int i=0;i<count;i++){
            System.out.print(unsafe[i]);
            if(i<count-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        sc.close();

    }
}
