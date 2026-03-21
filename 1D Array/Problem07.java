import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxDefects = sc.nextInt();
        int []arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int []index = new int[n];
        int count = 0;
        for(int i = 0;i < n ;i++){
            if(arr[i]>maxDefects){
                index[count]=i+1;
                count++;
            }
        }
        System.out.println("\nProduction Lines: "+n);
        System.out.println("Acceptable Threshold: "+maxDefects);
        System.out.println("Lines Exceeding Threshold: "+count);
        System.out.print("Critical Lines: [");
        for(int i=0;i<count;i++){
            System.out.print(index[i]);
            if(i<count-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        double avg = (double) (n-count)/n*100;
        System.out.printf("Compliance Rate: %.2f%%",avg);
        sc.close();
        sc.close();
    }
}
