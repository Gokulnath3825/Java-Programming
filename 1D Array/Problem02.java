
import java.util.*;

public class Problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = sc.nextInt();
        int [] arr = new int[n];
        int[] index = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                index[count]=i;
                count++;
            }
        }
        System.out.println("\nTotal Products: "+n);
        System.out.println("Minimum Threshold: "+min);
        System.out.println("Low Stock Products: "+count);
        System.out.print("Product Indices: [");
        for (int i = 0; i < count; i++) {
            System.out.print(index[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}
