public class PalindromeChecker {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number > 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }
        
        return originalNumber == reversedNumber;
    }
    
    public static void main(String[] args) {
        int inputNumber = 13431;
        if (isPalindrome(inputNumber)) {
            System.out.println(inputNumber + " is a palindrome");
        } else {
            System.out.println(inputNumber + " is not a palindrome");
        }
    }
}