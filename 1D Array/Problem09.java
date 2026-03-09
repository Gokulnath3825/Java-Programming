import java.util.Scanner;

class Problem09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double [] arr = new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int storeMax = 1;
        int storeMin = 1;
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]>max){
                storeMax=i+1;
                max = arr[i];
            }
            if(arr[i]<min){
                storeMin=i+1;
                min = arr[i];
            }
        }
        double avg = sum/(double)n;
        System.out.println("\nTotal Stores: "+n);
        System.out.printf("Highest Sales: $%.2f (Store %d)\n",max,storeMax);
        System.out.printf("Lowest Sales: $%.2f (Store %d)\n",min,storeMin);
        System.out.printf("Total Sales: $%.2f\n",sum);
        System.out.printf("Average Sales: $%.2f\n",avg);
        sc.close();

    }
}