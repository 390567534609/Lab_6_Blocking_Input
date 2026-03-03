import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = 0;
        double height = 0;
        boolean validInput = false;
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (sc.hasNextDouble()) {
                width = sc.nextDouble();
                validInput = true;
            }
            else {
                System.out.println("Invalid input enter a number");
                sc.next();
            }
        } while (!validInput);
        validInput = false;
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (sc.hasNextDouble()) {
                height = sc.nextDouble();
                validInput = true;
            }
            else {
                System.out.println("Invalid input enter a number");
                sc.next();
            }
        }
        while (!validInput);
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The diagonal of the rectangle is " + diagonal);
        sc.close();
    }
}
