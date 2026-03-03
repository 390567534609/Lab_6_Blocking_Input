import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = 0;
        boolean validInput = false;
        do {
            System.out.print("Enter a temperature in Celsius: ");
            if (sc.hasNextDouble()) {
                celsius = sc.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input enter a number.");
                sc.next();
            }
        } while (!validInput);
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit");
        sc.close();

    }
}