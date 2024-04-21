import java.util.Scanner;

public class CountdownApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to start the countdown: ");
        int N = scanner.nextInt();
        
        for (int i = N; i > 0; i--) {
            System.out.println(i);
            if (i % 5 == 0) {
                System.out.println("Beep");
            }
        }
    }
}