package Day2Problems;

import java.util.Scanner;
public class SumNaturalNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input the value of N
            System.out.print("Enter the value of N: ");
            int N = scanner.nextInt();

            // Calculate the sum
            int sum = 0;
            for (int i = 1; i <= N; i++) {
                sum += i;
            }

            // Display the sum
            System.out.print("The sum of the first " + N + " natural numbers: ");
            for (int i = 1; i <= N; i++) {
                System.out.print(i);
                if (i != N) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + sum);

            scanner.close();
        }
    }

