
import java.util.Scanner;

public class digitalSignal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int signal=sc.nextInt();
        int toggle=sc.nextInt();

        System.out.println(signal^toggle);


    }
}
