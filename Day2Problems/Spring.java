package Day2Problems;

public class Spring {

        public static void main(String[] args) {
            if (args.length < 2) {
                System.out.println("Please provide two integer command-line arguments: m and d.");
                return;
            }

            int m = Integer.parseInt(args[0]);
            int d = Integer.parseInt(args[1]);

            boolean isSpring = (m > 3 && m < 6) || (m == 3 && d >= 20) || (m == 6 && d <= 20);

            System.out.println(isSpring);
        }
    }


