import java.util.Scanner;
import java.util.Arrays;

public class TicketCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the ages of 5 individuals separated by space: ");
        String input = scanner.nextLine();
        String[] ageStrings = input.split(" ");
        
        int[] ages = Arrays.stream(ageStrings).mapToInt(Integer::parseInt).toArray();
        
        int minAge = Arrays.stream(ages).min().getAsInt();
        double discount = minAge / 100.0 * 15;
        double totalCost = 5 * 10 - discount;
        
        System.out.println("The total cost of tickets after applying the discount is: " + totalCost);
    }
}