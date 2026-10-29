import java.util.Random;
import java.util.Scanner;

public class idk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Guess the number: ");
        int guess = scanner.nextInt();

        int number = random.nextInt(1, 11);

        while(guess != number){
            if (guess > number){
                System.out.println("Lower");
        } else {
            System.out.println("Higher");
        }
        System.out.println("Guess the number: ");
        guess = scanner.nextInt();
    }

        System.out.println("Correct!");
        scanner.close();
    }
}