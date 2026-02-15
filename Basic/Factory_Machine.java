import java.util.Scanner;

public class Factory_Machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rodsPerHour=sc.nextInt();
        int hoursWorked=sc.nextInt();
        int overtimeRods=sc.nextInt();
        int rejectedRods=sc.nextInt();

        int Production=(rodsPerHour*hoursWorked)+overtimeRods-rejectedRods;
        
        System.out.println(Production);
        sc.close();
    }
    
}
