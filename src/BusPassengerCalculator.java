import java.util.Scanner;

public class BusPassengerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of passengers waiting at the bus station: ");
        int totalPassengers = scanner.nextInt();
        
        int remainingPassengers = totalPassengers % 50;
        int emptySeatsInLastBus = 50 - remainingPassengers;
        
        System.out.println("The number of empty seats in the last bus will be: " + emptySeatsInLastBus);
    }
}