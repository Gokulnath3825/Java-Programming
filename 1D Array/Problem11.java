import java.util.*;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] quantity = new double[n];
        double[] price = new double[n];
        double[] arr = new double[n];

        for(int i = 0; i < n; i++){
            quantity[i] = sc.nextDouble();
        }
        for(int i = 0; i < n; i++){
            price[i] = sc.nextDouble();
        }
        for(int i = 0; i < n; i++){
            arr[i] = quantity[i] * price[i];
        }
        double sum = 0;
        double max = arr[0];
        double min = arr[0];
        int storeMax = 1, storeMin = 1;

        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(arr[i] >= max){
                max = arr[i];
                storeMax = i+1;
            }
            if(arr[i] <=min){
                min = arr[i];
                storeMin = i+1;
            }
        }
        System.out.println("Number of Assets: " + n);
        System.out.printf("Total Portfolio Value: $%.2f\n", sum);
        System.out.printf("Most Valuable Asset: Asset %d ($%.2f)\n", storeMax, max);
        System.out.printf("Least Valuable Asset: Asset %d ($%.2f)\n", storeMin, min);

        sc.close();
    }
}