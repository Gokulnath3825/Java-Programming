import java.util.Scanner;
public class mobil_Data{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cost=sc.nextInt();
        int extra=sc.nextInt();
        int rate=sc.nextInt();
        int tax=sc.nextInt();

        int total=cost+(extra*rate);

        float Bill=total+(total*tax/100.0f);
        System.out.println(Bill);
        sc.close() ;
    }
    
}
