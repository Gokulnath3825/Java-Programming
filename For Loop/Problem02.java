import java.util.Scanner;

public class Problem02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int highest = 0;
        int pass = 0;
        int fail = 0;
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            total = total + score;
            if (score > highest) {
                highest = score;
            }
            String grade;
            if (score >= 80) {
                grade = "A";
            } else if (score >= 70) {
                grade = "B";
            } else if (score >= 60) {
                grade = "C";
            } else if (score >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }
            String status;
            if (score >= 60) {
                status = "Pass";
                pass = pass + 1;
            } else {
                status = "Fail";
                fail = fail + 1;
            }

            System.out.println();
            System.out.println("Student: " + name);
            System.out.println("Score: " + score);
            System.out.println("Letter Grade: " + grade);
            System.out.println("Status: " + status);
            System.out.println();
        }
        sc.close();
        double avg = (double) total / n;

        System.out.println("Total Students: " + n);
        System.out.println("Class Average: " + String.format("%.2f", avg));
        System.out.println("Highest Score: " + highest);
        System.out.println("Students Passed: " + pass);
        System.out.println("Students Failed: " + fail);
    }
}