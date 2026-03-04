import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String lower = text.toLowerCase();

        int count = 0;
        int i = 0;

        if (lower.length() > 0) {
            do {
                char ch = lower.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
                i++;
            } while (i < lower.length());
        }
        System.out.println("\nText: " + text);
        System.out.println("Vowel count: " + count);
        sc.close();
        sc.close();
    }
}