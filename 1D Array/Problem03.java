import java.util.*;

public class Problem03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int failed = 0;

        for (int i = 0; i < n; i++) {
            int grade = arr[i];
            if (grade > max) {
                max = grade;
            }
            if (grade < min) {
                min = grade;
            }
            if (grade < 40) {
                failed++;
            }
        }

        int passed = n - failed;
        double passPercentage = (double)passed/n*100;

        System.out.println("\nTotal Students: " + n);
        System.out.println("Highest Score: " + max);
        System.out.println("Lowest Score: " + min);
        System.out.println("Failed Students: " + failed);
        System.out.printf("Pass Percentage: %.2f%%", passPercentage);
        sc.close();
        sc.close();
    }
}