import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] employees = new int[n][];
        int total = 0;
        System.out.println("Employee Contact Book:");
        for(int i=0;i<n;i++){
            System.out.print("Dept "+(i+1)+": ");
            int a = sc.nextInt();
            for(int j=0;j<a;j++){
                employees[i] = new int[a];
                employees[i][j] = sc.nextInt();
                System.out.print(employees[i][j]+" ");
                total++;
            }
            System.out.println();
        }
        System.out.println("\nTotal Employees: "+total);
        sc.close();
    }
}
