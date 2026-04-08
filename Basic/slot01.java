import java.util.Scanner;

public class slot01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int gcd = arr[0];
        for(int i = 1; i < n; i++) {
            int a = gcd;
            int b = arr[i];
            while(a != b) {
                if(a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            gcd = a;
        }

        System.out.println(gcd);
        sc.close();
        sc.close();
    }
}