import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []quantity = new int[n];
        int []sold = new int[n];
        int total = 0;
        for(int i=0;i<n;i++){
            quantity[i]=sc.nextInt();
            total+=quantity[i];
        }
        double avg = (double) total/n;
        double avg_50 = avg*.50;

        int max = quantity[0];
        int maxStore = 1;
        int count = 0;
        for(int i= 0; i<n; i++){
            if(quantity[i]>max){
                max=quantity[i];
                maxStore=i+1;
            }
            if(quantity[i]<avg_50){
                sold[count]=i+1;
                count++;
            }
        }
        System.out.println("Total Samples: "+n);
        System.out.println("Total Units Sold:  "+total);
        System.out.printf("Average Monthly Sales: %.2f\n",avg);
        System.out.printf("Best Seller: Product %d (%d units)\n",maxStore,max);
        System.out.println("Slow-Moving Products: "+count);
        System.out.printf("Turnover Threshold: %.2f units\n",avg_50);
        System.out.print("Clearance Candidates: [");
        for(int i=0;i<count;i++){
            System.out.print(sold[i]);
            if(i<count-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}
