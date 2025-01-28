import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to identify if it is even or odd: ");
        int number = scanner.nextInt();
        
        // conditional operator is used to identify the number as even or odd
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println(" The given integer " + number + " is " + result + " number.");
        
        scanner.close();
    }
}