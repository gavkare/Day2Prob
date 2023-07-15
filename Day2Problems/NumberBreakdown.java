package Day2Problems;

import java.util.Scanner;

    public class NumberBreakdown {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input the number
            System.out.print("Enter a number (1, 10, 100, or 1000): ");
            int number = scanner.nextInt();

            // Display the breakdown
            int unit = number % 10;
            int ten = (number / 10) % 10;
            int hundred = (number / 100) % 10;

            System.out.println("Unit: " + unit);
            System.out.println("Ten: " + ten);
            System.out.println("Hundred: " + hundred);

            scanner.close();
        }
    }

