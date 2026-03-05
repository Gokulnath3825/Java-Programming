
import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int subjects = sc.nextInt();

        for(int i=0;i<students;i++){
            if(i==0){
                System.out.println("Grade Sheet:");
                System.out.print("Student ");
                for(int k=1;k<=subjects;k++){
                    System.out.print("Sub"+k+" ");
                }
                System.out.println("Average");
            }
            String name = sc.next();
            int sum=0;
            System.out.print(name+" ");
            for(int j=0;j<subjects;j++){
                int mark = sc.nextInt();
                System.out.print(mark+" ");
                sum+=mark;
            }
            double avg=(double)sum/subjects;
            System.out.printf("%.2f\n",avg);
        }
    }
}
