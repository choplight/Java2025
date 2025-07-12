import java.util.Scanner;
//method to receive user input
public class UserInput {
	//create one scanner for the whole class
    private static final Scanner scanner = new Scanner(System.in);

    public static String getName() {
        System.out.println("Enter your first and last name: ");
        return scanner.nextLine();
    }

    public static double getWeight() {
        System.out.println("Enter your weight in pounds: ");
        return scanner.nextDouble();
    }

    public static double getHeight() {
        System.out.println("Enter your height in inches: ");
        return scanner.nextDouble();
    }
}
