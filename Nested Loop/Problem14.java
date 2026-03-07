import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int totalStudents = sc.nextInt();
        int total = rows*2;
        int count=1;

        for(int i=0;i<total;i++){
            for(int j=0;j<cols;j++){
                if((i + j) % 2 == 0 && count <= totalStudents){
                    System.out.printf("S%03d ", count);
                    count++;
                }
                else{
                    System.out.print("---- ");
                }
            }
            System.out.println();
        }
        System.out.println("\nTotal Seats: "+rows*cols);
        System.out.println("Occupied Seats: "+totalStudents);
        System.out.println("Empty Seats: "+((rows*cols)-totalStudents));
        sc.close();
        sc.close();
    }
}
