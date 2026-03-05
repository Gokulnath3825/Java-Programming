import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int daysInMonth = sc.nextInt();
        int startDay = sc.nextInt();
        System.out.println("Calendar Grid:");
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        int day=7-startDay;
        for(int i=1;i<daysInMonth;i++){
            if(startDay>i){
                for(int l=1;l<startDay;l++){
                    System.out.print("  ");
                }
                for(int k=0;k<=day;k++){
                    System.out.print(i+" ");
                    i++;
                }
                System.out.println();
            }
            for(int j=0;j<7;j++){
                System.out.print(i+" ");
                i++;
                if(i>daysInMonth){
                    break;
                }

            }
            i--;
            System.out.println();
        }
    }
}
