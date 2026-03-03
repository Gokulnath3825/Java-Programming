
import java.util.Scanner;

public class Problem01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctpassword = sc.nextLine();
        int maxAttempt = 3;
        int attempt = 0;
        boolean login =false;

        while(attempt<maxAttempt && !login){
            System.out.println("\nEnter password:");
            String password = sc.nextLine();
            attempt++;
            if(password.equals(correctpassword)){
                System.out.println("Access granted!");
                login = true;
            }
            else{
                if(attempt<maxAttempt){

                    System.out.println("Incorrect! Attempts remaining:"+(maxAttempt-attempt));
                }
            }
        }
        if(!login){
            System.out.println("Account locked!");
        }
    }
}