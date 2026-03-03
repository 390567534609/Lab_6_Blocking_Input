import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gallons = 0;
        double milesPerGallon = 0;
        double pricePerGallon = 0;
        boolean validInput = false;
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (sc.hasNextDouble()) {
                gallons = sc.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invelid input enter a number");
                sc.next();
            }
        } while (!validInput);
        validInput = false;
        do {
            System.out.print("Enter the fuel eficiency in miles per gallon");
            if (sc.hasNextDouble()) {
                milesPerGallon = sc.nextDouble();
                validInput = true;
            } else { System.out.println("Invalid input enter a number");
                sc.next();
            }
        } while (!validInput);
        validInput = false;
        do { System.out.print("Enter the price of gas per gallon ");
            if (sc.hasNextDouble()) {
                pricePerGallon = sc.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input enter a number ");
                sc.next();
            }
        } while (!validInput);
        double costPer100Miles = (100 / milesPerGallon) * pricePerGallon;
        double fullTankRange = gallons * milesPerGallon;
        System.out.println("The cost to drive 100 miles is " + costPer100Miles);
        System.out.println("The car can go " + fullTankRange + " miles with a full tank");
    }
}