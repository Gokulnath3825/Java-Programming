
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNum = sc.nextInt();
        int guess = -1;
        int attempt=0;
        while(guess!=secretNum){
            guess = sc.nextInt();
            System.out.println("Guess the number (1100):"+guess);
            attempt++;
            if(guess<secretNum){
                System.out.println("Too low!");
            }
            else if(guess>secretNum){
                System.out.println("Too high!");
            }
            else if(guess == secretNum){
                System.out.println("Correct! Attempts:"+attempt);
            }
        }
        sc.close();
        sc.close();

    }
}
