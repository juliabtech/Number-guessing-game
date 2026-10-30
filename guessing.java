import java.util.Random;
import java.util.Scanner;

public class guessing {
    public static void main (String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            String again = "y";

            while (again.equalsIgnoreCase("y")) {
                System.out.print("Guess a number: ");
                int guess = scanner.nextInt();
                int secretNumber = random.nextInt(1, 13);
                int time = 0;
                boolean iswon = false;
                game(time, iswon, secretNumber, guess, scanner);
                System.out.printf("%n Want to play again? y/n: ");
                again = scanner.next();
            }
        }
    }

    static void game(int time, boolean iswon, int secretNumber, int guess, Scanner scanner) {
        for (time = 0; time < 5; time++) {
                    if (guess < 1 || guess > 12) {
                        System.out.println("Only numbers between 1-12!");
                    } else if (guess < secretNumber) {
                        System.out.println("Higher!");
                    } else if (guess > secretNumber) {
                        System.out.println("Lower!");
                    } else {
                        iswon = true;
                        break;
                    }
                    System.out.print("Guess again: ");
                    guess = scanner.nextInt();
                }

            if(iswon) {
                System.out.printf("Correct! You used %d attempts %n", time + 1);
            } else {
                
                System.out.println("You ran out of attempts");
                System.out.printf("The answer was %d", secretNumber);
            }
    }
}