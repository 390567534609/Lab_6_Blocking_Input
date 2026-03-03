import java.util.Scanner;
public class HighorLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10) + 1;
        int guess = 0;
        do {
            System.out.print("Guess a number between 1 and 10 ");
            guess = sc.nextInt();
        } while (guess < 1 || guess > 10);
        if (guess == randomNumber) {
            System.out.println("You got it right");
        } else if (guess < randomNumber) {
            System.out.println("Your guess is too low");
        }
        else {
            System.out.println("Your guess is too high!");
        }
        sc.close();
    }
}
