package Day2Problems;

import java.util.Scanner;

public class NumberToWord {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a single-digit number (0-9): ");
            int number = scanner.nextInt();

            String word;

            switch (number) {
                case 0:
                    word = "Zero";
                    break;
                case 1:
                    word = "One";
                    break;
                case 2:
                    word = "Two";
                    break;
                case 3:
                    word = "Three";
                    break;
                case 4:
                    word = "Four";
                    break;
                case 5:
                    word = "Five";
                    break;
                case 6:
                    word = "Six";
                    break;
                case 7:
                    word = "Seven";
                    break;
                case 8:
                    word = "Eight";
                    break;
                case 9:
                    word = "Nine";
                    break;
                default:
                    word = "Invalid input";
                    break;
            }

            System.out.println("Word representation: " + word);

            scanner.close();
        }
    }


