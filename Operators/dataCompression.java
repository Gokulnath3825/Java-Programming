
import java.util.Scanner;

public class dataCompression {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int file=sc.nextInt();
        int compress=sc.nextInt();
        int size=file>>compress;
        System.out.println(size);

    }
}