import java.util.*;

public class Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalSum = 0;

        for(int i = 0; i < n; i++){
            String employeeName = sc.next();
            double baseSalary = sc.nextDouble();
            int performanceRating = sc.nextInt();
            int increment = 0;

            if(performanceRating == 5){
                increment = 15;
            } else if(performanceRating == 4){
                increment = 10;
            } else if(performanceRating == 3){
                increment = 5;
            } else if(performanceRating == 2){
                increment = 2;
            } else if(performanceRating == 1){
                increment = 0;
            }

            double finalSalary = baseSalary * (1 + increment / 100.0);
            totalSum += finalSalary;

            System.out.println();
            System.out.println("Employee: " + employeeName);
            System.out.println("Base Salary: $" + baseSalary);
            System.out.println("Performance Rating: " + performanceRating);
            System.out.println("Increment: " + increment + "%");
            System.out.println("Final Salary: $" + String.format("%.2f",finalSalary));
        }

        double avg = totalSum / n;

        System.out.println("Total Employees Processed: " + n);
        System.out.println("Total Payroll: $" +String.format("%.2f",totalSum));
        System.out.println("Average Payroll: $" + String.format("%.2f",avg));
    }
}