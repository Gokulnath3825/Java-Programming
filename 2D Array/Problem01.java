import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();
        int subjects = sc.nextInt();

        int[][] a = new int[students][subjects];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {   // fixed here
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nStudent Averages:");
        for (int i = 0; i < students; i++) {
            System.out.print("Student " + (i + 1) + ":");
            int total = 0;
            for (int j = 0; j < subjects; j++) {
                total += a[i][j];
            }
            double avg = (double) total / subjects;
            System.out.printf(" %.2f\n", avg);
        }
        
        System.out.println("\nSubject Averages:");
        for (int i = 0; i < subjects; i++) {
            int total = 0;
            System.out.print("Subject " + (i + 1) + ":");
            for (int j = 0; j < students; j++) {
                total += a[j][i];
            }
            double avg = (double) total / students;
            System.out.printf(" %.2f\n", avg);
        }

        sc.close();
    }
}