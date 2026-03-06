
import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int days = sc.nextInt();
        int perfect =0;

        System.out.println("Attendance Matrix:");
        System.out.print("Student ");
        for(int i=1;i<=days;i++){
            System.out.print("Day"+i+" ");
        }
        System.out.print("Attendance%");
        System.out.println();

        for(int i=0;i<students;i++){
            int presentCount=0;
            String name = sc.next();
            System.out.print(name+" ");
            for(int j=0;j<days;j++){
                char ch = sc.next().charAt(0);
                System.out.print(ch+" ");
                if(ch == 'P'){
                    presentCount++;
                }
            }
            
            double avg = (double) presentCount/days*100;
            if(presentCount==days){
                perfect++;
            }
            System.out.printf("%.2f%%",avg);
            System.out.println();
        }
        System.out.println();
        System.out.println("Perfect Attendance: "+perfect+" students");
    }
}
